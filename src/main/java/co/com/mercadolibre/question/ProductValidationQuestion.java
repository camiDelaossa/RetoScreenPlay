package co.com.mercadolibre.question;

import co.com.mercadolibre.userInterface.ProductoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ProductValidationQuestion implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
                return ProductoUI.LBL_SELECT_PRODUCT.resolveFor(actor).isVisible();
    }

    public static Question validar(){
        return new ProductValidationQuestion();
    }
}
