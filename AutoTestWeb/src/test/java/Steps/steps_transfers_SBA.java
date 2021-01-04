package Steps;

import Actions.TransferDetails;
import Actions.TransfersOther;
import Actions.TransfersOwn;
import Actions.TransfersSBA;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

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
