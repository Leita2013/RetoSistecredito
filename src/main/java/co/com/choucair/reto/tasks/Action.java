package co.com.choucair.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Action implements Task {
    public static Performable ImplicityWait() {
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {}
        return null;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        );
    }
}
