package co.com.choucair.formacion.reto01.stepdefinitions;

import co.com.choucair.formacion.reto01.questions.Answer;
import co.com.choucair.formacion.reto01.questions.Answer2;
import co.com.choucair.formacion.reto01.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ColorStepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Laura quiere ingresar a la pagina colorlib$")
    public void queLauraQuiereIngresarALaPaginaColorlib() {
        OnStage.theActorCalled("LAURA").wasAbleTo(OpenUp.thePage(),(Login.OnThePage()));

    }

    @When("^busque el formulario en el menú y seleccione la opcion Validación de formulario$")
    public void busqueElFormularioEnElMenúYSeleccioneLaOpcionValidaciónDeFormulario() {
    OnStage.theActorInTheSpotlight().attemptsTo(Menu.OnThePage());
    }

    @Then("^validacion del formulacion (.*)$")
    public void validacionDelFormulacionBlockValidation(String question) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuBlock.OnThePage());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(question)));
    }

    @Then("^validacion del formulario (.*)$")
    public void validacionDelFormularioInlineValidation(String question2) {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuInline.OnThePage());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer2.tothe(question2)));
    }

    @Then("^Los valores del formulario Block Validation son incorrectos$")
    public void losValoresDelFormularioBlockValidationSonIncorrectos() {

    }

}
