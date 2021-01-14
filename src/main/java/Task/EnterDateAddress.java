package Task;

import UserInterfaces.Form;
import UserInterfaces.FormAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class EnterDateAddress implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // Enter.keyValues("Medellin").into(FormAddress.CITY),
                Enter.keyValues("245678").into(FormAddress.CODE_POSTAL),
                Click.on(FormAddress.NEXT_DEVICES));
    }

    public static EnterDateAddress is() {
        return new EnterDateAddress();
    }
}
