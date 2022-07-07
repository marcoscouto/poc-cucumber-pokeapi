package runner.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class PokemonSteps {

    private String pokemon;
    private Response response;

    @Dado("que escolho o pokemon {string}")
    public void escolherPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    @Quando("faço a busca na api de pokemons")
    public void buscarPokemons() {
        this.response = RestAssured
                .get("https://pokeapi.co/api/v2/pokemon/" + pokemon);
    }

    @Então("verifico se seu id é o {int}")
    public void verificarPokemonId(int id) {
        this.response.then().body("id", equalTo(id));
    }

}
