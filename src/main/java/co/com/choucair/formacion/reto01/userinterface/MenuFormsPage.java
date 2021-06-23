package co.com.choucair.formacion.reto01.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class MenuFormsPage extends PageObject {
    public static final Target FORMS = Target.the
            ("Seleccione Forms").located(By.xpath("//*[@id=\"menu\"]/li[6]/a/span[1]"));

    public static final Target  FORMS_VALIDATION = Target.the
            ("Seleccione la opcion Forms Validation").located(By.xpath("(//A[@href='form-validation.html'])[2]"));

    public static final Target BLOCK_VALIDATION = Target.the
            ("Seleccione la opcion BLOCK VALIDATION").located(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/header/h5"));

    public static final Target REQUIRED = Target.the
            ("Ingrese su Requerido").located(By.xpath("//*[@id=\"required2\"]"));

    public static final Target EMAIL = Target.the
            ("Ingrese su email").located(By.xpath("//INPUT[@id='email2']"));

    public static final Target PASSWORDFORMS = Target.the
            ("Ingrese su password").located(By.xpath("//INPUT[@id='password2']"));

    public static final Target CONFIRMPASS = Target.the
            ("Confirme su password").located(By.xpath("//INPUT[@id='confirm_password2']"));

    public static final Target DATE = Target.the
            ("Ingrese la fecha").located(By.xpath("//INPUT[@id='date2']"));

    public static final Target URL = Target.the
            ("Ingrese la URL").located(By.xpath("//INPUT[@id='url2']"));

    public static final Target DIGITS = Target.the
            ("Digite su ONLY").located(By.xpath("//INPUT[@id='digits']"));

    public static final Target RANGE = Target.the
            ("Ingrese su rango").located(By.xpath("//INPUT[@id='range']"));

    public static final Target ACEPTEPOLIICA = Target.the
            ("Acepte la politica").located(By.xpath("//*[@id=\"agree2\"]\n"));

    public static final Target VALIDAR = Target.the
            ("Seleccione el boton validar").located(By.xpath("(//INPUT[@type='submit'])[2]"));
}

