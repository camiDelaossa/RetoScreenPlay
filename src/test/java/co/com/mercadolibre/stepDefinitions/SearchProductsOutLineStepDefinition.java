package co.com.mercadolibre.stepDefinitions;

import co.com.mercadolibre.driver.DriverSC;
import co.com.mercadolibre.question.ProductNameQuestion;
import co.com.mercadolibre.question.ProductValidationQuestion;
import co.com.mercadolibre.task.SearchProductsOutLineTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;


public class SearchProductsOutLineStepDefinition {

    @Before
    public void bf()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en el buscador de mercado libre (.*)$")
    public void queMeEcuentroEnElBuscadorDeMercadoLibre(String url) {
        OnStage.theActorCalled("actor").can(BrowseTheWeb.with(DriverSC.chromeDriver(url)));
    }


    @When("^quiero buscar cinco productos (.*)$")
    public void quieroBuscarCincoProductos(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProductsOutLineTask.inMercadoLibre(producto));
    }

    @Then("^valido el nombre del producto (.*)$")
    public void validoElNombreDelProducto(String validacion) {

        OnStage.theActorInTheSpotlight().should(seeThat("el actor puede visualizar el nombre del producto",
                ProductValidationQuestion.validar(), Matchers.equalTo(true)));

        OnStage.theActorInTheSpotlight().should(seeThat("el actor compara el nombre del producto",
                ProductNameQuestion.validar(), Matchers.equalTo(validacion)));

    }
}
