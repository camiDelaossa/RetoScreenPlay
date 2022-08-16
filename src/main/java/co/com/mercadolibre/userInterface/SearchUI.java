package co.com.mercadolibre.userInterface;

import net.serenitybdd.screenplay.targets.Target;


public class SearchUI {

    public static final Target BTN_COOKIES = Target.the(("Aceptar Cookies")).locatedBy("//button[contains(.,'Entendido')]");

    public static final Target TXT_BARRA_DE_BUSQUEDA = Target.the("Barra de busqueda de mercado libre")
            .locatedBy("//input[@id='cb1-edit']");

    public static final Target BTN_SELECT_PRODUCT = Target.the("Seleccionar producto").
            locatedBy("(//h2[@class='ui-search-item__title'])[1]");
}
