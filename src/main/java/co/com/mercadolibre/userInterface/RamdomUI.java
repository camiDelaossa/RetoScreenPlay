package co.com.mercadolibre.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class RamdomUI {

    public static final Target BTN_COOKIES = Target.the("Aceptar Cookies").locatedBy("//button[contains(.,'Entendido')]");
    public static final Target BTN_LOGO = Target.the("logo mercado libre").locatedBy("//a[@class='nav-logo']");
    public static final Target BTN_CATEGORIAS= Target.the("boton a categorias").locatedBy("//a[@class='nav-menu-categories-link']");
    public static final Target BTN_TECNOLOGIA = Target.the("boton a categoria tecnologia").locatedBy("//a[contains(@data-order,'0')]");
    public static final Target BTN_CAMARAS = Target.the("boton a camaras")
            .locatedBy("//a[@href='https://listado.mercadolibre.com.co/camaras-accesorios/camaras/#menu=categories']");

    public static final Target BTN_PRODUCTS = Target.the("productos encontrados").locatedBy("//h2[@class='ui-search-item__title']");


}
