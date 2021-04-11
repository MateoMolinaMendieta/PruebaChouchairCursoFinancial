package co_com_choucair_certification_proyectouno.tasks;



import co_com_choucair_certification_proyectouno.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
