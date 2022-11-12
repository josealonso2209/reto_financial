package co.com.choucair.certification.challenge.tasks;

import co.com.choucair.certification.challenge.model.DataPersonal;
import co.com.choucair.certification.challenge.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillDeviceInformation implements Task {
    private List<DataPersonal> data;

    public FillDeviceInformation(List<DataPersonal> data) {
        this.data = data;
    }
    public static Performable thePage(List<DataPersonal> data) {
        return Tasks.instrumented(FillDeviceInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicesPage.CONTAINER_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(DevicesPage.COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.CONTAINER_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(DevicesPage.VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.CONTAINER_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguage()).into(DevicesPage.LANGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.CONTAINER_MOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(DevicesPage.MOBILE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.CONTAINER_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(DevicesPage.MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.CONTAINER_OS),
                Enter.theValue(data.get(0).getStrOs()).into(DevicesPage.OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.BUTTON_LAST)
        );
    }
}


