package co.com.choucair.certification.challenge.stepdefinitions;

import co.com.choucair.certification.challenge.model.DataPersonal;
import co.com.choucair.certification.challenge.questions.Response;
import co.com.choucair.certification.challenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairChallengeStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^since Jose Is Doing A Choucair Automation Challenge$")
    public void sinceJoseIsDoingAChoucairAutomationChallenge() {
        OnStage.theActorCalled("JOSE ALONSO").wasAbleTo(OpenUp.thePage());

    }

    @When("^he Search For The Automation Challenge On The Utest Page$")
    public void heSearchForTheAutomationChallengeOnTheUtestPage(List<DataPersonal> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillInPersonalInformation.thePage(data), FillInTheAddressInformation.thePage(data),
                FillDeviceInformation.thePage(data), FillFinalInformation.thePage(data)
        );

    }

    @Then("^he Complete The Automation Challenge Completely$")
    public void heCompleteTheAutomationChallengeCompletely(List<DataPersonal> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Response.To(data)));

    }

}
