package no.inela.mittbarskap.services;

import no.inela.mittbarskap.models.Cocktail;
import no.inela.mittbarskap.models.CocktailList;
import no.inela.mittbarskap.models.IngredientsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CocktailDataService {

    @Value("${api.key}")
    private String apiKey;

    @Value("${api.url}")
    private String apiBaseUrl;

    @Autowired
    private RestTemplate restTemplate;

    private CocktailList allCocktails = new CocktailList();

    public CocktailList getAllCocktails() {
        return allCocktails;
    }

    public List<Cocktail> getAllCocktailsList() {
        return getAllCocktails().getDrinks();
    }

    private IngredientsList allIngredients = new IngredientsList();

    public IngredientsList getAllIngredients() {
        return allIngredients;
    }

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public void fetchCocktailData() {
        CocktailList newCocktails = new CocktailList();
        IngredientsList newIngredients = new IngredientsList();

        assignCocktailsStartingWithNumber(newCocktails, newIngredients);
        assignCocktailsStartingWithLetter(newCocktails, newIngredients);
        this.allCocktails = newCocktails;
        this.allIngredients = newIngredients;
    }

    private void assignCocktailsStartingWithNumber(CocktailList newCocktails, IngredientsList newIngredients) {
        for (int number = 0; number <= 9; number++) {
            assignCocktailsStartingWithAlphanumeric(newCocktails, newIngredients, String.valueOf(number));
        }
    }

    private void assignCocktailsStartingWithLetter(CocktailList newCocktails, IngredientsList newIngredients) {
        for (char letter='a'; letter <= 'z'; letter++) {
            assignCocktailsStartingWithAlphanumeric(newCocktails, newIngredients, String.valueOf(letter));
        }
    }

    private void assignCocktailsStartingWithAlphanumeric(CocktailList newCocktails, IngredientsList newIngredients, String alphanumeric) {
        String url = apiBaseUrl + apiKey + "/search.php?f=";
        CocktailList cocktailsForLetter = restTemplate.getForObject(url + alphanumeric, CocktailList.class);

        if (cocktailsForLetter != null) {
            if (cocktailsForLetter.getDrinks() != null) {
                for (Cocktail cocktail : cocktailsForLetter.getDrinks()) {
                    newCocktails.getDrinks().add(cocktail);
                    newIngredients.getIngredients().addAll(cocktail.getIngredients());
                }
            }
        }
    }

}
