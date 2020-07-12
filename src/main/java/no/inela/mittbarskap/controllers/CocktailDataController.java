package no.inela.mittbarskap.controllers;

import no.inela.mittbarskap.models.Cocktail;
import no.inela.mittbarskap.models.CocktailList;
import no.inela.mittbarskap.services.CocktailDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cocktails")
public class CocktailDataController {

    @Autowired
    CocktailDataService cocktailDataService;


    @GetMapping
    public CocktailList getCocktails() {
        return cocktailDataService.getAllCocktails();
    }

    @GetMapping("/{idDrink}")
    public Cocktail getCocktail(@PathVariable("idDrink") String drinkId) {
        return cocktailDataService.getAllCocktailsList().stream()
                .filter(cocktail -> cocktail.getIdDrink().equals(drinkId))
                .findFirst().orElse(new Cocktail("-1","Cocktail not found"));
    }

    @GetMapping("/ingredients")
    public CocktailList getCocktailsFromIngredients(@RequestParam("i") List<String> ingredients) {
        List<Cocktail> list = cocktailDataService.getAllCocktailsList().stream()
                .filter(cocktail -> cocktail.getIngredients().stream().allMatch(ingredients::contains))
                .collect(Collectors.toList());
        return new CocktailList(list);
    }

}
