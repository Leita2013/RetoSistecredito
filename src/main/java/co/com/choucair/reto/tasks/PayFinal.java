package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterfaces.PayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PayFinal implements Task {
    public static PayFinal onThePage(){
        return Tasks.instrumented(PayFinal.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) PayPage.GO_TO_PAY));

    }
}
