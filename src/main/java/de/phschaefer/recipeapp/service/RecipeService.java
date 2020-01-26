package de.phschaefer.recipeapp.service;

import de.phschaefer.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long aLong);
}
