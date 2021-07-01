package co.com.choucair.formacion.reto01.questions;

import co.com.choucair.formacion.reto01.userinterface.BuscarTituloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
public class Answer implements Question<Boolean> {

    private String question;
    public Answer(String question){

        this.question =question;
    }
    public static Answer tothe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String NameFormul = Text.of(BuscarTituloPage.Titulo).viewedBy(actor).asString();
        if (question.equals(NameFormul)){
            result= true;
        }
        else {
            result= false;
        }
        return result;
    }
}
