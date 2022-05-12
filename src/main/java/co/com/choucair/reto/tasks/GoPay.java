package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.GoToPay;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoPay implements Task {
    public static GoPay OnThePage() {
        return Tasks.instrumented(GoPay.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) GoToPay.GO_PAY));

    }
}
