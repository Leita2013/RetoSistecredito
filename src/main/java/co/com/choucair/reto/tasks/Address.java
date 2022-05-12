package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.AddressDelivery;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Address implements Task {
    private String address, type;

    public Address(String address, String type) {
        this.address = address;
        this.type = type;
    }

    public static Address the(String address, String type) {
        return Tasks.instrumented(Address.class, address, type);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(address).into((Target) AddressDelivery.ADDRESS),
                Enter.theValue(type).into((Target) AddressDelivery.TYPE_HOME),
                Click.on((Target) AddressDelivery.INPUT_ADDRESS)

        );

    }
}

