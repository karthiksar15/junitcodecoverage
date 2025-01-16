package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class IndexControllerTest {
    @Test
    void testIndex() {

    }

    @Test
    void testOupsHandler() {
        assertThrows(ValueNotFoundException.class, () -> new IndexController().oupsHandler()); // throws (null)
    }

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(200);
            System.out.println("Inn 1");
        });
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testWindowsOnly() {
        assertTrue(true);

    }

}
