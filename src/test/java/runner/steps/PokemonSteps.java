package runner.steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class PokemonSteps {

    private String pokemon;
    private Response response;

    @Dado("que escolho o pokemon {string}")
    public void escolhePokemon(String pokemon){
        this.pokemon = pokemon;
    }

    @Quando("faço a busca na api de pokemons")
    public void fazerBuscarNaApi(){
        this.response = RestAssured
                .get("https://pokeapi.co/api/v2/pokemon/"+pokemon);
    }

    @Então("verifico se seu id é o {int}")
    public void receberInformacoes(int id){
        this.response.then().body("id", Matchers.equalTo(id));
    }

}
