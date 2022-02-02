package tech.ericwathome.cocktails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ericwathome.cocktails.Cocktail;

@Repository
public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
    Cocktail findCocktailByName(String name);
}
