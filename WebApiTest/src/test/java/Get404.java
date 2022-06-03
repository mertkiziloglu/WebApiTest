import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class Get404 extends BaseUrl {

    CloseableHttpClient client = HttpClientBuilder.create().build();

    @Test
    public void baseUrlReturns404() throws IOException {

        HttpGet httpGet = new HttpGet(BASE_ENDPOINT);

        HttpResponse response = client.execute(httpGet);

        int actualStatus = response.getStatusLine().getStatusCode();


        Assert.assertEquals(actualStatus, 404);
    }
}
