package no.inela.mittbarskap.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cocktail {

    private String idDrink;
    private String strDrink;
    private String strGlass;
    private String strDrinkThumb;

    private String strIngredient1;
    private String strIngredient2;
    private String strIngredient3;
    private String strIngredient4;
    private String strIngredient5;
    private String strIngredient6;
    private String strIngredient7;
    private String strIngredient8;
    private String strIngredient9;
    private String strIngredient10;
    private String strIngredient11;
    private String strIngredient12;
    private String strIngredient13;
    private String strIngredient14;
    private String strIngredient15;

    private String strMeasure1;
    private String strMeasure2;
    private String strMeasure3;
    private String strMeasure4;
    private String strMeasure5;
    private String strMeasure6;
    private String strMeasure7;
    private String strMeasure8;
    private String strMeasure9;
    private String strMeasure10;
    private String strMeasure11;
    private String strMeasure12;
    private String strMeasure13;
    private String strMeasure14;
    private String strMeasure15;

    public Cocktail() {
    }

    public Cocktail(String idDrink, String strDrink) {
        this.idDrink = idDrink;
        this.strDrink = strDrink;
    }

    public String getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public void setStrIngredient7(String strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public void setStrIngredient8(String strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public void setStrIngredient9(String strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public void setStrIngredient10(String strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public void setStrIngredient11(String strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public void setStrIngredient12(String strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public void setStrIngredient13(String strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public void setStrIngredient14(String strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public void setStrIngredient15(String strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    public void setStrMeasure6(String strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    public void setStrMeasure7(String strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    public void setStrMeasure8(String strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    public void setStrMeasure9(String strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    public void setStrMeasure10(String strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    public void setStrMeasure11(String strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    public void setStrMeasure12(String strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    public void setStrMeasure13(String strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    public void setStrMeasure14(String strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    public void setStrMeasure15(String strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }

    public List<String> getIngredients() {
        List<String> list = new ArrayList<>();

        if (strIngredient1 != null) { list.add(strIngredient1); }
        if (strIngredient2 != null) { list.add(strIngredient2); }
        if (strIngredient3 != null) { list.add(strIngredient3); }
        if (strIngredient4 != null) { list.add(strIngredient4); }
        if (strIngredient5 != null) { list.add(strIngredient5); }
        if (strIngredient6 != null) { list.add(strIngredient6); }
        if (strIngredient7 != null) { list.add(strIngredient7); }
        if (strIngredient8 != null) { list.add(strIngredient8); }
        if (strIngredient9 != null) { list.add(strIngredient9); }
        if (strIngredient10 != null) { list.add(strIngredient10); }
        if (strIngredient11 != null) { list.add(strIngredient11); }
        if (strIngredient12 != null) { list.add(strIngredient12); }
        if (strIngredient13 != null) { list.add(strIngredient13); }
        if (strIngredient14 != null) { list.add(strIngredient14); }
        if (strIngredient15 != null) { list.add(strIngredient15); }

        return list;
    }

    public List<String> getMeasures() {
        List<String> list = new ArrayList<>();

        if (strMeasure1 != null) { list.add(strMeasure1); }
        if (strMeasure2 != null) { list.add(strMeasure2); }
        if (strMeasure3 != null) { list.add(strMeasure3); }
        if (strMeasure4 != null) { list.add(strMeasure4); }
        if (strMeasure5 != null) { list.add(strMeasure5); }
        if (strMeasure6 != null) { list.add(strMeasure6); }
        if (strMeasure7 != null) { list.add(strMeasure7); }
        if (strMeasure8 != null) { list.add(strMeasure8); }
        if (strMeasure9 != null) { list.add(strMeasure9); }
        if (strMeasure10 != null) { list.add(strMeasure10); }
        if (strMeasure11 != null) { list.add(strMeasure11); }
        if (strMeasure12 != null) { list.add(strMeasure12); }
        if (strMeasure13 != null) { list.add(strMeasure13); }
        if (strMeasure14 != null) { list.add(strMeasure14); }
        if (strMeasure15 != null) { list.add(strMeasure15); }

        return list;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "idDrink='" + idDrink + '\'' +
                ", strDrink='" + strDrink + '\'' +
                '}';
    }
}
