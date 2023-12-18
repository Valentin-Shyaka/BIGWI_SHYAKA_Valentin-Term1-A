package rca.exam.calculator.endtoend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathApplicationTestE2E {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testApiEndpoint() {

        String url = "http://localhost:" + port + "/api/v1/do_math";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String requestBody = "{\"operand1\": 2, \"operand2\": 5, \"operation\": \"+\"}";


        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        String response = restTemplate.postForObject(url, request, String.class);

        assertEquals("Expected Response", response);
    }
}