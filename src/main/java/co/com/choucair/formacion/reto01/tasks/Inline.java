package co.com.choucair.formacion.reto01.tasks;

import co.com.choucair.formacion.reto01.userinterface.InlinePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Inline implements Task {
    public static Inline OnThePage(){
        return Tasks.instrumented(Inline.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
    actor.attemptsTo(
            Click.on(InlinePage.INLINE),
            Enter.theValue("LAURA M").into(InlinePage.REQUERIDO),
            Enter.theValue("lmperezs@ufso.edu.co").into(InlinePage.CORREO),
            Enter.theValue("12345").into(InlinePage.CONTRASEÑA),
            Enter.theValue("12345").into(InlinePage.CONFIRMACONTRASEÑA),
            Enter.theValue("24/07/2021").into(InlinePage.FECHA),
            Enter.theValue("https://github.com/lmperezs/Reto1").into(InlinePage.DIRECCIONURL),
            Click.on(InlinePage.ACEPTAR),
            Enter.theValue("oro").into(InlinePage.MINIMO3),
            Enter.theValue("amor").into(InlinePage.MAXIMO6),
            Enter.theValue("22").into(InlinePage.MIN3),
            Enter.theValue("5").into(InlinePage.MAX6),
            Click.on(InlinePage.VALIDARBOTTON)
            );

    }
}
