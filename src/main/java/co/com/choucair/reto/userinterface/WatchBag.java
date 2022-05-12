package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class WatchBag extends PageObject {
    public static final Target SEE_BAG = Target.the("see bag with product").located(By.id("linkButton"));

}
