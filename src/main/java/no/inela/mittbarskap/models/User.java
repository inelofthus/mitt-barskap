package no.inela.mittbarskap.models;

import java.util.List;

public class User {

    private String userId;
    private List<String> ingredients;

    public User(String userId) {
        this.userId = userId;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
