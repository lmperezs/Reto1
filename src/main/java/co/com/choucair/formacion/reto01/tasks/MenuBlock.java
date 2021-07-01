package co.com.choucair.formacion.reto01.tasks;

import co.com.choucair.formacion.reto01.userinterface.MenuBlockPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class MenuBlock implements Task {
    public static MenuBlock OnThePage(){
        return Tasks.instrumented(MenuBlock.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(

                Enter.theValue("laura perez").into(MenuBlockPage.REQUIRED),
                Enter.theValue("lmperezs@choucairtesting.com").into(MenuBlockPage.EMAIL),
                Enter.theValue("123456").into(MenuBlockPage.PASSWORDFORMS),
                Enter.theValue("123456").into(MenuBlockPage.CONFIRMPASS),
                Enter.theValue("23/06/2021").into(MenuBlockPage.DATE),
                Enter.theValue("https://operacion.choucairtesting.com/academy/course/view.php?id=484").into(MenuBlockPage.URL),
                Enter.theValue("1234").into(MenuBlockPage.DIGITS),
                Enter.theValue("8").into(MenuBlockPage.RANGE),
                Click.on(MenuBlockPage.ACEPTEPOLIICA),
                Click.on(MenuBlockPage.VALIDAR)
        );
    }
}



