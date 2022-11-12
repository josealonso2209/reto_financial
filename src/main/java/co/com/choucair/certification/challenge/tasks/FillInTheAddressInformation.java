package co.com.choucair.certification.challenge.tasks;

import co.com.choucair.certification.challenge.model.DataPersonal;
import co.com.choucair.certification.challenge.userinterface.AddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillInTheAddressInformation implements Task {
    private List<DataPersonal> data;

    public FillInTheAddressInformation(List<DataPersonal> data) {
        this.data = data;
    }

    public static FillInTheAddressInformation thePage(List<DataPersonal> data) {
        return Tasks.instrumented(FillInTheAddressInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(AddressPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(AddressPage.CITY),
                Hit.the(Keys.ENTER).into(AddressPage.CITY),
                Enter.theValue(data.get(0).getStrZipCode()).into(AddressPage.ZIP_CODE),
                Click.on(AddressPage.CONTAINER_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(AddressPage.COUNTRY),
                Click.on(AddressPage.BUTTON_DEVICES)
        );

    }
}
