package tech.ericwathome.cocktails.service;

import tech.ericwathome.cocktails.Cocktail;

import java.util.List;

public interface CocktailService {
    void addCocktail(Cocktail cocktail);

    List<Cocktail> allCocktails();

    Cocktail findCocktailByName(String name);
}
