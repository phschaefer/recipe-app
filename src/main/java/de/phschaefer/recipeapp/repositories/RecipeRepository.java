package de.phschaefer.recipeapp.repositories;

import de.phschaefer.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
