package guru.springframework.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

public class OwnerTest {

    @Test
    void dependentAssertion() {
        Owner owner = new Owner(3L, "Nethra", "Karthik");
        owner.setAddress("Chennai");
        owner.setCity("Chennai");
        owner.setTelephone("456987");

        assertAll("Properties test",
                () -> assertAll("Person properties",
                        () -> assertEquals("Nethra", owner.getFirstName()),
                        () -> assertEquals("Karthik", owner.getLastName())),
                () -> assertAll("Owner properties",
                        () -> assertEquals("Chennai", owner.getCity()),
                        () -> assertEquals("Chennai", owner.getAddress()),
                        () -> assertEquals("456987", owner.getTelephone())));
    }
}
