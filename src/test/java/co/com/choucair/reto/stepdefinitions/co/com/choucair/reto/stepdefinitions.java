package co.com.choucair.reto.stepdefinitions.co.com.choucair.reto;

import co.com.choucair.reto.questions.Answer;
import co.com.choucair.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class stepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that a user enters the falabella web portal$")
    public void thatAUserEntersTheFalabellaWebPortal() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());

    }

    @When("^the pop-up is opened the user closes it$")
    public void thePopUpIsOpenedTheUserClosesIt() {
        OnStage.theActorInTheSpotlight().attemptsTo(Refresh.thePage());

    }


    @When("^he searchs (.*) on the portal web$")
    public void heSearchsCelularSamsungGalaxyA32128GBOnThePortalWeb(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(item));

    }

    @When("^add the bag$")
    public void addTheBag() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddBag.OnThePage());
    }

    @When("^click in button Ver Bolsa de Compras$")
    public void clickInButtonVerBolsaDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoCart.OnThePage());
    }


    @When("^check item selection$")
    public void checkItemSelection() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoPay.OnThePage());

    }

    @When("^fill form delivery$")
    public void fillFormDelivery() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeliveryData.OnThePage());

    }
    @When("^data for the shipment address (.*), type (.*) and continue$")
    public void dataForTheShipmentAddressAvSiempreVivaTypeApartamentoAndContinue(String address, String type) {
         OnStage.theActorInTheSpotlight().attemptsTo(Address.the(address, type));
    }
    @When("^continue payment$")
    public void continuePayment(){

        OnStage.theActorInTheSpotlight().attemptsTo(PayFinal.onThePage());
    }

    @Then("^Validate message payment (.*)$")
    public void validateMessage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));



    }


}








