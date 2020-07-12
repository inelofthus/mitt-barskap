package no.inela.mittbarskap.models;

import java.util.*;

public class IngredientsList {

    private SortedSet<String> ingredients;

    public IngredientsList() {
        this.ingredients = new TreeSet<>(Comparator.naturalOrder());
    }

    public IngredientsList(SortedSet<String> ingredients) {
        this.ingredients = ingredients;
    }

    public SortedSet<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(SortedSet<String> ingredients) {
        this.ingredients = ingredients;
    }
}
