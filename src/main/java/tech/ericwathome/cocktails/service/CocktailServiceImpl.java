package tech.ericwathome.cocktails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ericwathome.cocktails.Cocktail;
import tech.ericwathome.cocktails.repository.CocktailRepository;

import java.util.List;

@Service
public class CocktailServiceImpl implements CocktailService{
    private final CocktailRepository cocktailRepository;

    @Autowired
    public CocktailServiceImpl(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    @Override
    public void addCocktail(Cocktail cocktail) {
        cocktailRepository.save(cocktail);
    }

    @Override
    public List<Cocktail> allCocktails() {
        return cocktailRepository.findAll();
    }

    @Override
    public Cocktail findCocktailByName(String name) {
        return cocktailRepository.findCocktailByName(name);
    }
}
