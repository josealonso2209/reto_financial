package co.com.choucair.certification.challenge.questions;

import co.com.choucair.certification.challenge.model.DataPersonal;
import co.com.choucair.certification.challenge.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Response implements Question<Boolean> {
    private List<DataPersonal> data;

    public Response(List<DataPersonal> data) {
        this.data = data;
    }

    public static Response To(List<DataPersonal> data) {
        return  new Response(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Button_Complete = Text.of(FinalPage.BUTTON_COMPLETE).viewedBy(actor).asString();
        return data.get(0).getStrComplete().equals(Button_Complete);
    }
}
