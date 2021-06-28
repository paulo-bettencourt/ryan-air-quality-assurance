package Steps;

import Actions.AccountDetails;
import Actions.AccountSelector;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_acc_selector {
    SharedDriver sharedDriver;
    AccountDetails accountDetails;
    AccountSelector accountSelector;

    public steps_acc_selector(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        accountDetails = new AccountDetails(sharedDriver);
        accountSelector = new AccountSelector(sharedDriver);
    }

    @Then("^select loan account from account selector$")
    public void selectLoanAccountFromAccountSelector() {
        accountSelector.SelectAccSelector();
        accountSelector.SelectLoanOptionAccSelector();
    }

    @And("^click account details tab$")
    public void clickAccountDetailsTab() {
        accountDetails.clickAccountDetailsTab();
    }

}
