package co.com.choucair.certification.challenge.tasks;

import co.com.choucair.certification.challenge.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
public class OpenUp implements Task {
    private HomePage homePage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage),
                Click.on(HomePage.LOGIN_BUTTON)
        );
    }
}
