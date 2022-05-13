package co.com.choucair.reto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillForm extends PageObject {
    public static final Target SELECT_REGION = Target.the("select region").located(By.id("region"));
    public static final Target SELECT_ANTIOQUIA = Target.the("select option Antioquia")
            .located(By.xpath("//*[@id=\"region\"]/option[2]"));

    public static final Target SELECT_CITY = Target.the("select city").located(By.id("ciudad"));

    public static final Target SELECT_MEDELLIN = Target.the("select option Medellin")
            .located(By.xpath("//*[@id=\"ciudad\"]/option[40]"));

    public static final Target SELECT_DISTRICT = Target.the("select district")
            .located(By.id("comuna"));

    public static final Target DISTRICT_MEDELLIN = Target.the("select option Medellin")
            .located(By.xpath("//*[@id=\"comuna\"]/option[2]"));

    public static final Target CONTINUE_PAY = Target.the("continue")
            .located(By.xpath("//*[@id=\"fbra_checkoutRegionAndComuna\"]/div/section/section/form/div/div[4]/div/button"));


}
