import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetThreeEndpointTest extends BaseUrl {

    CloseableHttpClient client;
    CloseableHttpResponse response;

    @BeforeMethod
    public void setUp() throws IOException {
        client = HttpClientBuilder.create().build();
    }

    @AfterMethod
    public void closeResources() throws IOException {
        client.close();
    }

@DataProvider
private  Object[][] endpoints() {
        return new Object[][]{
                {"/user"},
                {"/notifications"},
                {"/user/followers"}
        };
}


    @Test(dataProvider = "endpoints")
    public void baseUrlUnauthorized401(String endpoint)  throws IOException {

        HttpGet httpGet = new HttpGet(BASE_ENDPOINT + endpoint);

        response = client.execute(httpGet);

        int actualStatus = response.getStatusLine().getStatusCode();


        Assert.assertEquals(actualStatus, 401);
    }
}
