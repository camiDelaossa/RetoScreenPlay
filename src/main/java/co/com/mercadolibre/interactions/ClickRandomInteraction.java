package co.com.mercadolibre.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;


import java.util.List;
import java.util.Random;

public class ClickRandomInteraction implements Interaction {

    private Target products;

    public ClickRandomInteraction(Target products) {
        this.products = products;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        List<WebElementFacade> listProducts = products.resolveAllFor(actor);
        int numberRandom = random.nextInt(listProducts.size());
        listProducts.get(numberRandom).click();
    }

    public static Performable inClickRandom(Target products) {
        return Instrumented.instanceOf(ClickRandomInteraction.class).withProperties(products);
    }

}
