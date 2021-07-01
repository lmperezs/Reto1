package co.com.choucair.formacion.reto01.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuInlinePage extends PageObject {

    public static final Target INLINE = Target.the
            ("Seleccione INLINE VALIDATION").located(By.xpath("//H5[text()='Inline Validation']"));

    public static final Target REQUERIDO = Target.the
            ("Ingrese su requerido").located(By.xpath("//INPUT[@id='required']"));

    public static final Target CORREO = Target.the
            ("Ingrese su correo").located(By.xpath("//INPUT[@id='email']"));

    public static final Target CONTRASEÑA = Target.the
            ("Ingrese su contraseña").located(By.xpath("//INPUT[@id='password']"));

    public static final Target CONFIRMACONTRASEÑA = Target.the
            ("Confirme su contraseña").located(By.xpath("//INPUT[@id='confirm_password']"));

    public static final Target FECHA = Target.the
            ("Ingrese la fecha").located(By.xpath("//INPUT[@id='date']"));

    public static final Target DIRECCIONURL = Target.the
            ("Ingrese su direccion URL").located(By.xpath("//INPUT[@id='url']"));

    public static final Target ACEPTAR = Target.the
            ("Aceptar politica de privacidad").located(By.xpath("//INPUT[@id='agree']"));

    public static final Target MINIMO3 = Target.the
            ("Ingrese minimo 3 caracteres ").located(By.xpath("//INPUT[@id='minsize']"));

    public static final Target MAXIMO6 = Target.the
            ("Ingrese maximo 6 caracteres").located(By.xpath("//INPUT[@id='maxsize']"));

    public static final Target MIN3 = Target.the
            ("Ingrese minimo 3").located(By.xpath("//INPUT[@id='minNum']"));

    public static final Target MAX6 = Target.the
            ("Ingrese maximo 6").located(By.xpath("//INPUT[@id='maxNum']"));

    public static final Target VALIDARBOTTON = Target.the
            ("Seleccione el boton validar ").located(By.xpath("(//INPUT[@type='submit'])[3]"));
}
