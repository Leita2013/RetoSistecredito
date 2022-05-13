package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterfaces.FillForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class DeliveryData implements Task {
    public static DeliveryData OnThePage() {
        return Tasks.instrumented(DeliveryData.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) FillForm.SELECT_REGION),
                Click.on((Target) FillForm.SELECT_ANTIOQUIA),
                Click.on((Target) FillForm.SELECT_CITY),
                Click.on((Target) FillForm.SELECT_MEDELLIN),
                Click.on((Target) FillForm.SELECT_DISTRICT),
                Click.on((Target) FillForm.DISTRICT_MEDELLIN),
                Click.on((Target) FillForm.CONTINUE_PAY)
        );

    }
}
