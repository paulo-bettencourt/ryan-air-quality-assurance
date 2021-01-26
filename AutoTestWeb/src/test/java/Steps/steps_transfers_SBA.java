package Steps;

import Actions.TransfersOther;
import Actions.TransfersSBA;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_transfers_SBA {

    SharedDriver sharedDriver;
    TransfersSBA transfersSBA;
    TransfersOther transfersOther;

    public steps_transfers_SBA(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        transfersSBA = new TransfersSBA(sharedDriver);
        transfersOther = new TransfersOther(sharedDriver);
    }


    @Then("^i insert a wrong BBAN \"([^\"]*)\"$")
    public void iInsertAWrongBBAN(String bban) {
        transfersSBA.InsertBBAN(bban);
    }

    @And("^a error message appears$")
    public void aErrorMessageAppears() {
        transfersSBA.SeeErrorMessage();
    }

    @And("^i select \"([^\"]*)\" on the selector$")
    public void iSelectOnTheSelector(String contact) {
        transfersOther.InsertRecipientName(contact);
        transfersOther.SelectFirstRecipient();
    }
}
