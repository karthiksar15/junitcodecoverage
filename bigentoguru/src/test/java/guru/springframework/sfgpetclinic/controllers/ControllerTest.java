package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controllers")
public interface ControllerTest {
    @BeforeAll
    default void setUp() {
        System.out.println("Contoller test Before All");
    }
}
