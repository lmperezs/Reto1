package co.com.choucair.formacion.reto01.tasks;

import co.com.choucair.formacion.reto01.userinterface.MenuBlockPage;
import co.com.choucair.formacion.reto01.userinterface.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Menu implements Task {
    public static Menu OnThePage(){
        return Tasks.instrumented(Menu.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(MenuPage.FORMS),
                Click.on(MenuPage.FORMS_VALIDATION)

        );
    }
}
