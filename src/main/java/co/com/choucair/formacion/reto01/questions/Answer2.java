package co.com.choucair.formacion.reto01.questions;

import co.com.choucair.formacion.reto01.userinterface.BuscarTituloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer2 implements Question<Boolean> {

    private String question2;
    public Answer2(String question2){

        this.question2 =question2;
    }
    public static Answer2 tothe(String question2) {
        return new Answer2(question2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String NameFormul = Text.of(BuscarTituloPage.Titulo2).viewedBy(actor).asString();
        if (question2.equals(NameFormul)){
            result= true;
        }
        else {
            result= false;
        }
        return result;
    }
}
