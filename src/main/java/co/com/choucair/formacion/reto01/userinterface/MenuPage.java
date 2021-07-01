package co.com.choucair.formacion.reto01.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage extends PageObject {

    public static final Target FORMS = Target.the
            ("Seleccione Forms").located(By.xpath("//*[@id=\"menu\"]/li[6]/a/span[1]"));

    public static final Target  FORMS_VALIDATION = Target.the
            ("Seleccione la opcion Forms Validation").located(By.xpath("(//A[@href='form-validation.html'])[2]"));

}
