package co_com_choucair_certification_proyectouno.stepdefinitions;

import co_com_choucair_certification_proyectouno.model.AcademyChoucairData;
import co_com_choucair_certification_proyectouno.questions.Answer;
import co_com_choucair_certification_proyectouno.tasks.Login;
import co_com_choucair_certification_proyectouno.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChouairData) throws Exception  {
       OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.onThePage(academyChouairData.get(0).getStrUser(),academyChouairData.get(0).getStrPassword()));
    }

    @When("^she search for the course on the Choucair Academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChouairData) throws Exception{
OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChouairData.get(0).getStrCourse()));
    }

    @Then("^she finds the course called$")
    public void sheFindsTheCalledResourcesRecursosAtomatizacionBancolombia(List<AcademyChoucairData> academyChouairData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChouairData.get(0).getStrCourse())));

    }
}
