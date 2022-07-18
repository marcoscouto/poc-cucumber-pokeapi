package runner.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

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

    @Então("verifico que seu id é {int}")
    public void verificarPokemonId(int id) {
        this.response.then().body("id", equalTo(id));
    }

    @Então("verifico que seu id não é")
    public void verificarPokemonNaoId(DataTable dataTable) {
        dataTable.asMap().values().forEach(value ->  this.response.then().body("id", not(value)));
    }

    @Então("verifico que seu id não será")
    public void verificarPokemonNaoId(List list) {
        list.forEach(value ->  this.response.then().body("id", not(value)));
    }

}
