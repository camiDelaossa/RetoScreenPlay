package co.com.mercadolibre.question;

import co.com.mercadolibre.utils.VariablesGlobales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NumberProductsQuestion implements Question {

    @Override
    public Integer answeredBy(Actor actor) {
        return VariablesGlobales.productosBuscados;
    }

    public static Question validar(){
        return new NumberProductsQuestion();
    }
}
