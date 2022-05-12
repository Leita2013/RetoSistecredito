package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.SelectItem;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class AddBag implements Task {

    public static AddBag OnThePage() {
        return Tasks.instrumented(AddBag.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) SelectItem.SELECT_ITEM));

    }
}