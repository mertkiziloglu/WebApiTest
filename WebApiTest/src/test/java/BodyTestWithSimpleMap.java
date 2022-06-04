import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class BodyTestWithSimpleMap extends BaseUrl {

    CloseableHttpClient client;
    CloseableHttpResponse response;
    @Test
    public void returnsCorrectLogin() throws IOException {

        HttpGet httpGet = new HttpGet(BASE_ENDPOINT + "/users/mertkiziloglu");
        response = client.execute(httpGet);
        String jsonBody = EntityUtils.toString(response.getEntity());
        System.out.println(jsonBody);

    }
}
