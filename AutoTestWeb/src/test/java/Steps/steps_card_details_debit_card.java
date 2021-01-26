package Steps;

import Actions.DebitCardDetails;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

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
