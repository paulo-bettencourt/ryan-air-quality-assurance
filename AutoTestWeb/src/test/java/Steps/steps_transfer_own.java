package Steps;

import Actions.TransferDetails;
import Actions.TransfersOwn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_transfer_own {

    SharedDriver sharedDriver;
    TransferDetails transferDetails;
    TransfersOwn transfersOwn;

    public steps_transfer_own(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        transferDetails = new TransferDetails(sharedDriver);
        transfersOwn = new TransfersOwn(sharedDriver);
    }

    @Then("^i can click on new transfer on the quick action button$")
    public void iCanClickOnNewTransferOnTheQuickActionButton() {
        transferDetails.ClickTransfersQuickActions();
    }


    @And("^i am redirected to the new transfer page$")
    public void iAmRedirectedToTheNewTransferPage() throws InterruptedException {
        transferDetails.OnNewTransferPage();
    }


    @And("^i select a current account on the to selector$")
    public void iSelectACurrentAccountOnTheToSelector() {
        transfersOwn.SelectRecipientList();
        transfersOwn.SelectCurrentAcc();
    }

    @And("^i insert \"([^\"]*)\" on the amount input$")
    public void iInsertOnTheAmountInput(String amount) {
        transfersOwn.InsertAmount(amount);
    }

    @Then("^i click on next button$")
    public void iClickOnNextButton() {
        transfersOwn.ClickNextBtn();
    }

    @And("^i am redirected to the review page$")
    public void iAmRedirectedToTheReviewPage() {
        transfersOwn.OnReviewPage();
    }


    @Then("^i click on the authorize button$")
    public void iClickOnTheAuthorizeButton() {
        transfersOwn.ClickAuthorizeBtn();
    }


    @And("^transfers was successfully made$")
    public void transfersWasSuccessfullyMade() {
        transfersOwn.TransferSuccess();
    }


}
