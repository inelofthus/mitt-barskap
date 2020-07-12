package no.inela.mittbarskap.controllers;

import no.inela.mittbarskap.models.Cocktail;
import no.inela.mittbarskap.models.CocktailList;
import no.inela.mittbarskap.models.IngredientsList;
import no.inela.mittbarskap.models.User;
import no.inela.mittbarskap.services.CocktailDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CocktailDataService cocktailDataService;

    @GetMapping("/{userId}/ingredients")
    IngredientsList getUserIngredients(@PathVariable("userId") String userId) {
        User user = new User(userId);
        user.getIngredients().add("Vodka");

        IngredientsList returnSet = new IngredientsList();
        returnSet.getIngredients().addAll(user.getIngredients());

        return returnSet;
    }

    @PostMapping("/ingredients")
    public void addUserIngredients(@RequestBody List<String> ingredient){
        //get user (userId) -> user.getIngredients().addAll(ingredients)
        //Eller localstorage? Vil vi ha brukere?
    }

    @GetMapping("/can-make/{userId}")
    public CocktailList getUserCocktails(@PathVariable("userId") String userId) {
        CocktailList userCocktails = new CocktailList();

        User user = new User(userId);
        user.setIngredients(Arrays.asList(
                "Gin", "Lemon Juice", "Grand Marnier", "Grenadine", "Tequila", "Tabasco sauce", "Vodka"
        ));

        List<Cocktail> list = cocktailDataService.getAllCocktailsList().stream()
                .filter(cocktail -> {
                    return cocktail.getIngredients().stream().allMatch(user.getIngredients()::contains);
                }).collect(Collectors.toList());

        userCocktails.setDrinks(list);
        return userCocktails;
    }
}
