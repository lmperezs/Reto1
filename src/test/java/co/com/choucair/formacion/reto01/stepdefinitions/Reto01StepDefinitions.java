package co.com.choucair.formacion.reto01.stepdefinitions;

import co.com.choucair.formacion.reto01.tasks.Login;
import co.com.choucair.formacion.reto01.tasks.MenuForms;
import co.com.choucair.formacion.reto01.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Reto01StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Laura quiere ingresar a la pagina colorlib")
    public void queLauraquiereingresaralapaginacolorlib(){
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(),(Login.OnThePage()),(MenuForms.OnThePage()));

    }

    @Cuando("Laura ingrese la funcionalidad Block Validation")
    public void LauraingreselafuncionalidadBlockValidation(){

    }

    @Entonces("Laura valida el correcto funcionamiento del formulario")
    public void Lauravalidaelcorrectofuncionamientodelformulario(){

    }
}