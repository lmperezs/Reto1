package co.com.choucair.formacion.reto01.tasks;

import co.com.choucair.formacion.reto01.userinterface.ColorlibPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

 public class OpenUp implements Task {
    private ColorlibPage colorlibPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(colorlibPage));
    }
}
