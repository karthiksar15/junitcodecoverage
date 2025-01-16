package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.fauxspring.ModelMapImpl;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import guru.springframework.sfgpetclinic.fauxspring.Model;
import static org.assertj.core.api.Assertions.*;

public class VetControllerTest {

    VetService vetService;
    SpecialtyService specialtyService;
    VetController vetController;

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);
        vetController = new VetController(vetService);
        Vet vet = new Vet(1L, "Nakshu", "Karthik", null);
        Vet vet1 = new Vet(2L, "Nethra", "Karthik", null);
        vetService.save(vet);
        vetService.save(vet1);
    }

    @Test
    void testListVets() {
        Model map = new ModelMapImpl();
        String view = vetController.listVets(map);
        assertThat("vets/index").isEqualTo(view);
    }
}
