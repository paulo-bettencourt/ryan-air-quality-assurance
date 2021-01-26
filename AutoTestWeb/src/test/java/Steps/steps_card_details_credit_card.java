package Steps;

import Actions.CreditCardDetails;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_card_details_credit_card {

    SharedDriver sharedDriver;
    CreditCardDetails creditCardDetails;

    public steps_card_details_credit_card(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        creditCardDetails = new CreditCardDetails(sharedDriver);
    }

    @Then("^i select one credit card$")
    public void iSelectOneCreditCard() {
 creditCardDetails.SelectCreditCard();
    }

}
