package co.com.mercadolibre.task;

import co.com.mercadolibre.userInterface.SearchUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SearchProductsOutLineTask implements Task {

    private String products;

    public SearchProductsOutLineTask(String products) {
        this.products = products;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchUI.BTN_COOKIES),
                Enter.theValue(products).into(SearchUI.TXT_BARRA_DE_BUSQUEDA),
                Enter.keyValues(Keys.ENTER).into(SearchUI.TXT_BARRA_DE_BUSQUEDA),
                Click.on(SearchUI.BTN_SELECT_PRODUCT)
        );

    }

    public static Performable inMercadoLibre(String products){
        return Instrumented.instanceOf(SearchProductsOutLineTask.class).withProperties(products);
    }

}
