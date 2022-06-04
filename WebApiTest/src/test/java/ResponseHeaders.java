import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.struts.util.ResponseUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ResponseHeaders extends BaseUrl {

    CloseableHttpClient client;
    CloseableHttpResponse response;

    @BeforeMethod
    public void setUp() throws IOException {
        client = HttpClientBuilder.create().build();
    }
    @AfterMethod
    public void closeResources() throws IOException {
        client.close();
        response.close();
    }

    @Test
    public void serverIsGithub() throws IOException {
        HttpGet httpGet = new HttpGet(BASE_ENDPOINT);
        response = client.execute(httpGet);

        Header contentTypeHeader = response.getEntity().getContentType();
        //String contentType = response.getFirstHeader("Content-Type").getValue();
        //Assert.assertEquals(contentTypeHeader.getValue(), "application/json; charset=utf-8");

        String headerValue = getHeader(response, "Server");
        Assert.assertEquals(headerValue, "GitHub.com");
    }

    @Test
    public void xRateLimitIsSixty() throws IOException {
        HttpGet httpGet = new HttpGet(BASE_ENDPOINT);
        response = client.execute(httpGet);
        String limitVal = ResponseHeaders.getHeaderJava8Way(response, "X-RateLimit-Limit");
        Assert.assertEquals(limitVal, "60");
    }

    @Test
    public void eTagIsPresent() throws IOException {
        HttpGet httpGet = new HttpGet(BASE_ENDPOINT);
        response = client.execute(httpGet);
        boolean eTag = ResponseHeaders.headerIsPresent(response, "ETag");
        Assert.assertTrue(eTag);
    }

    private String getHeader(CloseableHttpResponse response, String headerName) {

        //get all headers
        Header[] headers = response.getHeaders(headerName);
        List<Header> httpHeaders = Arrays.asList(headers);
        String returnHeader = "";
        //loop through headers and return the first header value
        for (Header header : httpHeaders) {
            returnHeader = header.getValue();
        }
        if (returnHeader.isEmpty()) {
            throw new RuntimeException("Header not found" + headerName);
        }
        return returnHeader;
    }

    public static String getHeaderJava8Way(CloseableHttpResponse response, String headerName) {
        List<Header> httpHeaders = Arrays.asList(response.getAllHeaders());
        Header matchHeader = httpHeaders.stream()
                .filter(header -> header.getName().equals(headerName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Header not found" + headerName));
        return matchHeader.getValue();
    }

    private static boolean headerIsPresent(CloseableHttpResponse response, String eTag) {
        List<Header> httpHeaders = Arrays.asList(response.getAllHeaders());

        return  httpHeaders.stream()
                .anyMatch(header -> header.getName().equals(eTag));
    }
}
