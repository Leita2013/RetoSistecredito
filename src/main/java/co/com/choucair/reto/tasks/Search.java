package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.CheckoutStepOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class Search implements Task {
    public Search(String item) {
        this.item = item;
    }

    private String item;

    public static Search the(String item) {
        return Tasks.instrumented(Search.class,item);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(item).into((Target) CheckoutStepOnePage.INPUT_ITEM),
                Hit.the(Keys.ENTER).into(CheckoutStepOnePage.INPUT_ITEM));

    }
}
