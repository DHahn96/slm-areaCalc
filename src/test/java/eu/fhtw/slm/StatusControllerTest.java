package eu.fhtw.slm;

import eu.fhtw.slm.controller.StatusController;
import eu.fhtw.slm.service.StatusService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StatusControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private StatusService statusService;

    @Autowired
    private StatusController statusController;

    @Test
    void testGetStatus() {
        final double messageCircle = 1.00;
        statusService.setMessagecircleVal(messageCircle);
        final double messageResponseCircle = testRestTemplate.getForObject("http://localhost:" + port + "/message", double.class);
        assertEquals(messageCircle*3.1415, messageResponseCircle);

        final double messageSqare = 100.00;
        statusService.setMessageSquareVal(messageSqare);
        final double messageResponseSquare = testRestTemplate.getForObject("http://localhost:" + port + "/message", double.class);
        assertEquals(messageSqare*messageSqare, messageResponseSquare);
    }

}

