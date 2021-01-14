package Task;

import UserInterfaces.FormAddress;
import UserInterfaces.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDateLastPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("Pruebaregistro123").into(LastPage.PASSWORD),
                Enter.keyValues("Pruebaregistro123").into(LastPage.CONFIRM_PASSWORD),
                Click.on(LastPage.ACCEPT),
                Click.on(LastPage.ACCEPT_POLICY),
                Click.on(LastPage.BUTTON_COMPLETE));
    }

    public static EnterDateLastPage is() {
        return new EnterDateLastPage();
    }
}
