package co.com.mercadolibre.stepDefinitions;

import co.com.mercadolibre.question.ProductValidationQuestion;
import co.com.mercadolibre.task.RandomSearchTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RandomSearchStepDefinition {

    @Before
    public void bf()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^quiero ingresar a la categoria de camaras y selecciono un producto de forma aleatoria$")
    public void quieroIngresarALaCategoriaDeCamarasYSeleccionoUnProductoDeFormaAleatoria() {
        OnStage.theActorInTheSpotlight().attemptsTo(RandomSearchTask.inMercadoLibre());
    }

    @Then("^valido que fue seleccionado un producto$")
    public void validoQueFueSeleccionadoUnProducto() {
        OnStage.theActorInTheSpotlight().should(seeThat("el actor puede visualizar el nombre del producto",
                ProductValidationQuestion.validar(), Matchers.equalTo(true)));
    }
}
