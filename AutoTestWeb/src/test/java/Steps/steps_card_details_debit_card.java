package Steps;

import Actions.Cards;
import Actions.DebitCardDetails;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Ca;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class steps_card_details_debit_card {


    SharedDriver sharedDriver;
    DebitCardDetails debitCardDetails;


    public steps_card_details_debit_card(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        debitCardDetails = new DebitCardDetails(sharedDriver);
    }


    @Then("^i select one debit card$")
    public void iSelectOneDebitCard(){
        debitCardDetails.SelectDebitCard();
    }

}
