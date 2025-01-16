package guru.springframework.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Person;

public class PersonTest {

    @Test
    @DisplayName("Assert all test")
    void groupedAssertions() {

        Person person = new Person(1L, "Karthik", "TEst");
        assertAll("Assert all test", () -> assertEquals("Karthik", person.getFirstName()),
                () -> assertEquals("TEst", person.getLastName()));

    }

}
