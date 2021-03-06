package co.com.choucair.reto.tasks;


import co.com.choucair.reto.userinterfaces.WatchBag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoCart implements Task {
    public static GoCart OnThePage() {

        return Tasks.instrumented(GoCart.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) WatchBag.SEE_BAG));

    }
}
