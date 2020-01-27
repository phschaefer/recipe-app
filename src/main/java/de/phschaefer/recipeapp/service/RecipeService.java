package de.phschaefer.recipeapp.service;

import de.phschaefer.recipeapp.commands.RecipeCommand;
import de.phschaefer.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long aLong);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
