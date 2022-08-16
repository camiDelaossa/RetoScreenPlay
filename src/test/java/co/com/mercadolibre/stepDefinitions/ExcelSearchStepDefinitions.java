package co.com.mercadolibre.stepDefinitions;

import co.com.mercadolibre.question.NumberProductsQuestion;

import co.com.mercadolibre.task.ExcelSearchTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ExcelSearchStepDefinitions {

    @Before
    public void bf()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^quiero realizar tres busquedas desde un archivo de excel$")
    public void quieroRealizarTresBusquedas() {
        OnStage.theActorInTheSpotlight().attemptsTo(ExcelSearchTask.inMercadoLibre());
    }

    @Then("^valido que la cantidad de productos buscados sea 3$")
    public void validoLosProductos() {
        OnStage.theActorInTheSpotlight().should(seeThat("el actor compara la cantidad de productos buscados",
                NumberProductsQuestion.validar(), Matchers.equalTo(3)));
    }
}
