package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressDelivery extends PageObject {
    public static final Target ADDRESS = Target.the("input address").located(By.id("address"));
    public static final Target TYPE_HOME = Target.the("input type home")
            .located(By.id("departmentNumber"));

    public static final Target INPUT_ADDRESS = Target.the("button useAddress").located(By.xpath("//*[@id=\"fbra_checkoutDeliverAndCollect\"]/div/div/div[1]/div/div[2]/div/div/form/section/div/div[4]/button"));

}
