package co.com.mercadolibre.task;

import co.com.mercadolibre.interactions.ClickRandomInteraction;
import co.com.mercadolibre.interactions.MoveToElementInteraction;
import co.com.mercadolibre.userInterface.RamdomUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RandomSearchTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(RamdomUI.BTN_COOKIES),
                    MoveToElementInteraction.inMoveToElemente(RamdomUI.BTN_LOGO,RamdomUI.BTN_CATEGORIAS),
                    MoveToElementInteraction.inMoveToElemente(RamdomUI.BTN_CATEGORIAS,RamdomUI.BTN_TECNOLOGIA),
                    WaitUntil.the(RamdomUI.BTN_CAMARAS,isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(RamdomUI.BTN_CAMARAS),
                    ClickRandomInteraction.inClickRandom(RamdomUI.BTN_PRODUCTS)
            );
    }

    public static Performable inMercadoLibre(){
        return Instrumented.instanceOf(RandomSearchTask.class).withProperties();
    }
}
