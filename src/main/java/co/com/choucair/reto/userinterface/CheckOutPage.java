package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPage extends PageObject {
    public static final Target CHECKOUT_PAGE_PAY = Target.the("check pay")
            .located(By.xpath("/html/body/div[3]/div[1]/div[1]/h2"));


}
