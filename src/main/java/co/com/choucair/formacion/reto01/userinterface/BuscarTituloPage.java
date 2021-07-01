package co.com.choucair.formacion.reto01.userinterface;

import net.serenitybdd.core.pages.PageObject;
        import net.serenitybdd.screenplay.targets.Target;
        import org.openqa.selenium.By;
public class BuscarTituloPage extends PageObject {

    public static final Target Titulo2 = Target.the("Buscar el titulo del formulario")
            .located(By.xpath("//H5[text()='Inline Validation']"));

    public static final Target Titulo = Target.the("Buscar el titulo del formulario")
            .located(By.xpath("//H5[text()='Block Validation']"));
}