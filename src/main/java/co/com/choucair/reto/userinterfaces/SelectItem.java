package co.com.choucair.reto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectItem extends PageObject {

    public static final Target SELECT_ITEM = Target.the("select phone")
        .located(By.id("testId-Pod-action-prod11390143"));


}
