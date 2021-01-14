package Task;
import UserInterfaces.FormDevices;
import UserInterfaces.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterDateFormDevices implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormDevices.NEXT_LAST_PAGE));
    }
    public static EnterDateFormDevices is() {
        return new EnterDateFormDevices();

    }
}