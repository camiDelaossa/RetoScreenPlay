package co.com.mercadolibre.task;

import co.com.mercadolibre.userInterface.ProductoUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SearchProductsBackgroundTask implements Task {

    private String productos;

    public SearchProductsBackgroundTask(String productos) {this.productos = productos;}

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductoUI.BTN_COOKIES),
                Enter.theValue(productos).into(ProductoUI.TXT_BARRA_DE_BUSQUEDA),
                Enter.keyValues(Keys.ENTER).into(ProductoUI.TXT_BARRA_DE_BUSQUEDA),
                Click.on(ProductoUI.BTN_SELECT_PRODUCT)
        );
    }
    public static Performable inMercadoLibre(String productos){
        return Instrumented.instanceOf(SearchProductsBackgroundTask.class).withProperties(productos);}
}
