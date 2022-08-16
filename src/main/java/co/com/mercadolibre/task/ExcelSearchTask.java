package co.com.mercadolibre.task;

import co.com.mercadolibre.userInterface.BusquedaUI;
import co.com.mercadolibre.utils.DatosExcel;
import co.com.mercadolibre.utils.VariablesGlobales;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Map;


public class ExcelSearchTask implements Task {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = DatosExcel.readExcel("dataExcel.xlsx","Buscar");
        }catch (Exception e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(BusquedaUI.BTN_COOKIES));

        int contadorProductosBuscados = 0;

        for(int i = 0 ; i<leerExcel.size();i++) {
            actor.attemptsTo(
                    Enter.theValue(leerExcel.get(i).get("Buscar"))
                            .into(BusquedaUI.TXT_BARRA_DE_BUSQUEDA),
                    Enter.keyValues(Keys.ENTER).into(BusquedaUI.TXT_BARRA_DE_BUSQUEDA),
                    Click.on(BusquedaUI.BTN_SELECT_PRODUCT)
            );
            contadorProductosBuscados++;
        }
        VariablesGlobales.productosBuscados=contadorProductosBuscados;
    }

    public static Performable inMercadoLibre() {
        return Instrumented.instanceOf(ExcelSearchTask.class).withProperties();
    }
}
