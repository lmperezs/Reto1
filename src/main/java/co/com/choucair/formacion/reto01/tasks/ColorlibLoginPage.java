package co.com.choucair.formacion.reto01.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorlibLoginPage extends PageObject {
    public static final Target USER_NAME = Target.the
            ("Escriba su usuario").located(By.xpath("(//INPUT[@type='text'])[1]"));

    public static final Target PASSWORD = Target.the
            ("Digite su contraseña").located(By.xpath("//*[@id=\"login\"]/form/input[2]"));

    public static final Target BOTON_LOGUIN =
            Target.the("Seleccione el boton LOGIN").located(By.xpath("//BUTTON[@class='btn btn-lg btn-primary btn-block'][text()='Sign in']"));
}
