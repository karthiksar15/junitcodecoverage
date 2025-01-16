package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

public class OwnerSDJpaServiceTest {

    OwnerSDJpaService ownerSDJpaService;

    @BeforeEach
    void setUp() {
        ownerSDJpaService = new OwnerSDJpaService(null, null, null);

    }

    @Test
    void testDelete() {

    }

    @Test
    void testDeleteById() {

    }

    @Test
    void testFindAll() {

    }

    @Test
    void testFindAllByLastNameLike() {

    }

    @Test
    void testFindById() {

    }

    @Disabled
    @Test
    void testFindByLastName() {
        Owner foundOwner = ownerSDJpaService.findByLastName("Karthik");

    }

    @Test
    void testSave() {

    }
}
