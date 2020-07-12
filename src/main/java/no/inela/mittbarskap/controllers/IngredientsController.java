package no.inela.mittbarskap.controllers;

import no.inela.mittbarskap.models.IngredientsList;
import no.inela.mittbarskap.services.CocktailDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {

    @Autowired
    CocktailDataService cocktailDataService;


    @GetMapping
    public IngredientsList getAllIngredients() { return cocktailDataService.getAllIngredients(); }
}
