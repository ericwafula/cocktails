package tech.ericwathome.cocktails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.ericwathome.cocktails.Cocktail;
import tech.ericwathome.cocktails.service.CocktailService;

import java.util.List;

@RestController
@RequestMapping("api/v1/cocktails")
public class CocktailController {
    private final CocktailService cocktailService;

    @Autowired
    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @PostMapping("/new")
    String addCocktail(@RequestBody Cocktail cocktail){
        cocktailService.addCocktail(cocktail);
        return "cocktail added";
    }

    @GetMapping
    List<Cocktail> allCocktails(){
        return cocktailService.allCocktails();
    }

    @GetMapping("/cocktail/{name}")
    Cocktail getCocktailByName(@PathVariable("name") String name){
        return cocktailService.findCocktailByName(name);
    }
}
