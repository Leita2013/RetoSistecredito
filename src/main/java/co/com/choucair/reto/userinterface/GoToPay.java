package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToPay extends PageObject {
    public static final Target GO_PAY = Target.the("go to pay").located(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));
}
