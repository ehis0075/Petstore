package com.petstore.repository;

import com.petstore.models.Pet;
import com.petstore.models.PetSex;
import com.petstore.models.PetType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PetRepositoryTest {

    Logger log = Logger.getLogger(getClass().getName());

    @Autowired
    PetRepository petRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createPetObject_thenSaveToDatabaseTest() {

        Pet pet = new Pet();

        pet.setAge(5);
        pet.setName("Lucky");
        pet.setSex(PetSex.MALE);
        pet.setTypes(PetType.DOG);
        pet.setBreed("bull dog");
        pet.getBirthDate(new Date());

        log.info("Created pet object --> "+ pet);
        assertThat(pet.getId()).isNull();

        // save pet object to the database
        pet = petRepository.save(pet);
        log.info("After saving pet object --> "+ pet);
        assertThat(pet.getId()).isNotNull();

    }
}