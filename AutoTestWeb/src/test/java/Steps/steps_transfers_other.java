package Steps;

import Actions.TransfersOther;
import Actions.TransfersOwn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class steps_transfers_other {

    SharedDriver sharedDriver;
    TransfersOther transfersOther;
    TransfersOwn transfersOwn;

    public steps_transfers_other(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        transfersOther = new TransfersOther(sharedDriver);
        transfersOwn = new TransfersOwn(sharedDriver);
    }

    @And("^i select IBAN tab$")
    public void iSelectIBANTab() {
     transfersOther.OtherBankTab();
    }

    @And("^i insert \"([^\"]*)\" on the IBAN input$")
    public void iInsertOnTheIBANInput(String iban)  {
 transfersOther.InsertIban(iban);
    }

    @Then("^next button is disabled$")
    public void nextButtonIsDisabled() {
     transfersOwn.nextButtonIsDisabled();
    }


    @And("^i insert a recipients name \"([^\"]*)\"$")
    public void iInsertARecipientsName(String name) {
   transfersOther.InsertRecipientName(name);
    }

    @And("^i select \"([^\"]*)\" on the recipient name selector$")
    public void iSelectOnTheRecipientNameSelector(String recipient)  {
  transfersOwn.SelectRecipientList();
        transfersOther.InsertRecipientName(recipient);
        transfersOther.SelectFirstRecipient();
    }
}
