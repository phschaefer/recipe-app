package de.phschaefer.recipeapp.repositories;

import de.phschaefer.recipeapp.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescriptionTeaspoon() {
        String test = "Teaspoon";

        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription(test);

        assertEquals(test, unitOfMeasure.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() {
        String test = "Cup";

        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription(test);

        assertEquals(test, unitOfMeasure.get().getDescription());
    }
}