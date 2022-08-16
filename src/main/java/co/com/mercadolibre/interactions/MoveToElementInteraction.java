package co.com.mercadolibre.interactions;

import net.serenitybdd.core.steps.Instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementInteraction implements Interaction {

    private Target primerTarget;
    private Target segundoTarget;

    public MoveToElementInteraction(Target primerTarget, Target segundoTarget) {
        this.primerTarget = primerTarget;
        this.segundoTarget = segundoTarget;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Actions browserActions = BrowseTheWeb.as(actor).withAction();
        browserActions.moveToElement(primerTarget.resolveFor(actor)).
                moveToElement(segundoTarget.resolveFor(actor)).build().perform();

    }

    public static Performable inMoveToElemente(Target primero, Target segundo){
        return Instrumented.instanceOf(MoveToElementInteraction.class).withProperties(primero,segundo);
    }

}
