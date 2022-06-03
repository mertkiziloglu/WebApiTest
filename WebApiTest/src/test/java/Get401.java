import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Get401 extends BaseUrl {

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



    @Test
    public void baseUrlUnauthorized401() throws IOException {

        HttpGet httpGet = new HttpGet(BASE_ENDPOINT);

        response = client.execute(httpGet);

        int actualStatus = response.getStatusLine().getStatusCode();

        //this line is return 200 because we have base url
        Assert.assertEquals(actualStatus, 200); //401 is unauthorized status code
    }
    @Test
    public void userReturns401() throws IOException {

        HttpGet httpGet = new HttpGet(BASE_ENDPOINT + "/user");

        response = client.execute(httpGet);

        int actualStatus = response.getStatusLine().getStatusCode();


        Assert.assertEquals(actualStatus, 401);
    }
    @Test
    public void userFollower401() throws IOException {

        HttpGet httpGet = new HttpGet(BASE_ENDPOINT + "/user/followers");

        response = client.execute(httpGet);

        int actualStatus = response.getStatusLine().getStatusCode();


        Assert.assertEquals(actualStatus, 401);
    }
    @Test
    public void notifications401() throws IOException {

        HttpGet httpGet = new HttpGet(BASE_ENDPOINT + "/notifications");

        response = client.execute(httpGet);

        int actualStatus = response.getStatusLine().getStatusCode();


        Assert.assertEquals(actualStatus, 401);
    }
}
