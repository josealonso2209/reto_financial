package co.com.choucair.certification.challenge.tasks;

import co.com.choucair.certification.challenge.model.DataPersonal;
import co.com.choucair.certification.challenge.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FillFinalInformation implements Task {
    private List<DataPersonal> data;

    public FillFinalInformation(List<DataPersonal> data) {
        this.data = data;
    }
    public static Performable thePage(List<DataPersonal> data) {
        return Tasks.instrumented(FillFinalInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(FinalPage.PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(FinalPage.CONFIRM_PASSWORD),
                Click.on(FinalPage.CHECK_STAY),
                Click.on(FinalPage.CHECK_READ_1),
                Click.on(FinalPage.CHECK_READ_2),
                Click.on(FinalPage.BUTTON_COMPLETE)
        );
    }
}
