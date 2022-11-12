package co.com.choucair.certification.challenge.tasks;

import co.com.choucair.certification.challenge.model.DataPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.challenge.userinterface.PersonalPage.*;

public class FillInPersonalInformation implements Task {

    private List<DataPersonal> data;

    public FillInPersonalInformation(List<DataPersonal> data) {
        this.data = data;
    }

    public static FillInPersonalInformation thePage(List<DataPersonal> data) {
        return Tasks.instrumented(FillInPersonalInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrFirstName()).into(FIRSTNAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LASTNAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonthBirth()).from(MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDayBirth()).from(DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrYearBirth()).from(YEAR),
                Click.on(BUTTON_ADDRESS)
        );
    }
}
