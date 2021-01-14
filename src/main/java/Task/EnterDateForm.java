package Task;

import UserInterfaces.Form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class EnterDateForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Form.NEW_REGISTER),
                Enter.keyValues("Deisy").into(Form.NAME),
                Enter.keyValues("Mosquera").into(Form.LAST_NAME),
                Enter.keyValues("deisy.mosquera@gmail.com").into(Form.EMAIL),
                SelectFromOptions.byVisibleText("October").from(Form.MOUNT),
                SelectFromOptions.byVisibleText("8").from(Form.DAY),
                SelectFromOptions.byVisibleText("1995").from(Form.YEAR),
                Click.on(Form.NEXT_CONTINUO));



    }

    public static EnterDateForm is(){
        return new EnterDateForm();
    }
}
