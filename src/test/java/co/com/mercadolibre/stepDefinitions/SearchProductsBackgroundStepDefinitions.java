package co.com.mercadolibre.stepDefinitions;

import co.com.mercadolibre.question.ProductNameQuestion;
import co.com.mercadolibre.question.ProductValidationQuestion;
import co.com.mercadolibre.task.SearchProductsBackgroundTask;
import co.com.mercadolibre.utils.Models;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchProductsBackgroundStepDefinitions {

    @Before
    public void bf()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^quiero buscar tres productos en mercado libre$")
    public void quieroBuscarTresProductosEnMercadoLibre(List<Models> parametro) {
       OnStage.theActorInTheSpotlight().attemptsTo(SearchProductsBackgroundTask.inMercadoLibre(parametro.get(0).getProductomeli()));
    }

    @Then("^valido el producto$")
    public void validoElProducto(List<Models> parametro) {
        OnStage.theActorInTheSpotlight().should(seeThat("el actor puede visualizar el nombre del producto",
                ProductValidationQuestion.validar(), Matchers.equalTo(true)));

        OnStage.theActorInTheSpotlight().should(seeThat("el actor compara el nombre del producto",
                ProductNameQuestion.validar() , Matchers.equalTo(parametro.get(0).getProductomeli())));

    }

}
