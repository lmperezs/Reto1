package co.com.choucair.formacion.reto01.tasks;

import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
    actor.attemptsTo(
            Enter.theValue("demo").into(ColorlibLoginPage.USER_NAME),
            Enter.theValue("demo").into(ColorlibLoginPage.PASSWORD),
            Click.on(ColorlibLoginPage.BOTON_LOGUIN)
    );
    }

}
