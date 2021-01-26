package Steps;

import Actions.AccountDetails;
import cucumber.api.java.en.And;
import org.openqa.selenium.support.PageFactory;

public class steps_account_details {

    SharedDriver sharedDriver;
    AccountDetails accountDetails;

    public steps_account_details(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        accountDetails = new AccountDetails(sharedDriver);
    }

    @And("^Account details are loaded$")
    public void accountDetailsAreLoaded() {
        accountDetails.accountDetailsLoaded();
    }


}
