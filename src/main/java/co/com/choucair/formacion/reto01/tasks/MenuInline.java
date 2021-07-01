package co.com.choucair.formacion.reto01.tasks;

import co.com.choucair.formacion.reto01.userinterface.MenuInlinePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class MenuInline implements Task {
    public static MenuInline OnThePage(){
        return Tasks.instrumented(MenuInline.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
    actor.attemptsTo(

            Enter.theValue("LAURA M").into(MenuInlinePage.REQUERIDO),
            Enter.theValue("lmperezs@ufso.edu.co").into(MenuInlinePage.CORREO),
            Enter.theValue("12345").into(MenuInlinePage.CONTRASEÑA),
            Enter.theValue("12345").into(MenuInlinePage.CONFIRMACONTRASEÑA),
            Enter.theValue("24/07/2021").into(MenuInlinePage.FECHA),
            Enter.theValue("https://github.com/lmperezs/Reto1").into(MenuInlinePage.DIRECCIONURL),
            Click.on(MenuInlinePage.ACEPTAR),
            Enter.theValue("oro").into(MenuInlinePage.MINIMO3),
            Enter.theValue("amor").into(MenuInlinePage.MAXIMO6),
            Enter.theValue("22").into(MenuInlinePage.MIN3),
            Enter.theValue("5").into(MenuInlinePage.MAX6),
            Click.on(MenuInlinePage.VALIDARBOTTON)
            );

    }
}
