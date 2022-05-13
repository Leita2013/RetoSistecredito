package co.com.choucair.reto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PayPage extends PageObject {
    public static final Target GO_TO_PAY = Target.the("continue payment")
            .located(By.xpath("//*[@id=\"fbra_checkoutDeliveryActions\"]/div/div/span/div/div/div/div[2]/button"));

}
