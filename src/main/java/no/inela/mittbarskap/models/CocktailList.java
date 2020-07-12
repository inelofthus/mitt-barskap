package no.inela.mittbarskap.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class CocktailList {

    @JsonProperty("drinks")
    private List<Cocktail> drinks;

    public CocktailList() {
        this.drinks = new ArrayList<>();
    }

    public CocktailList(List<Cocktail> drinks) {
        this.drinks = drinks;
    }

    public List<Cocktail> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Cocktail> drinks) {
        this.drinks = drinks;
    }
}
