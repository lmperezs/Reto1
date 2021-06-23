package co.com.choucair.formacion.reto01.tasks;

import co.com.choucair.formacion.reto01.userinterface.MenuFormsPage;
import cucumber.api.java.da.Men;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class MenuForms implements Task {
    public static MenuForms OnThePage(){
        return Tasks.instrumented(MenuForms.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(MenuFormsPage.FORMS),
                Click.on(MenuFormsPage.FORMS_VALIDATION),
                Click.on(MenuFormsPage.BLOCK_VALIDATION),
                Enter.theValue("laura perez").into(MenuFormsPage.REQUIRED),
                Enter.theValue("lmperezs@choucairtesting.com").into(MenuFormsPage.EMAIL),
                Enter.theValue("123456").into(MenuFormsPage.PASSWORDFORMS),
                Enter.theValue("123456").into(MenuFormsPage.CONFIRMPASS),
                Enter.theValue("23/06/2021").into(MenuFormsPage.DATE),
                Enter.theValue("https://operacion.choucairtesting.com/academy/course/view.php?id=484").into(MenuFormsPage.URL),
                Enter.theValue("1234").into(MenuFormsPage.DIGITS),
                Enter.theValue("8").into(MenuFormsPage.RANGE),
                Click.on(MenuFormsPage.ACEPTEPOLIICA),
                Click.on(MenuFormsPage.VALIDAR)
        );
    }
}



