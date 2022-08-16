package co.com.mercadolibre.question;

import co.com.mercadolibre.userInterface.ProductoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductNameQuestion implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return ProductoUI.LBL_SELECT_PRODUCT.resolveFor(actor).getText();
    }

    public static Question validar(){
        return new ProductNameQuestion();
    }
}
