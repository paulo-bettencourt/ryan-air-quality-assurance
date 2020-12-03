package Steps;

import Actions.Business_Transactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_BusinessTransactions {

    SharedDriver sharedDriver;
    WebDriver driver;
    Business_Transactions business_transactions;

    public steps_BusinessTransactions(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
        driver = sharedDriver.getDriver();
        business_transactions = new Business_Transactions(sharedDriver);
    }

    @And("^i enter and confirm i am in transactions page$")
    public void i_am_in_transactions_page() {
        business_transactions.iAmInTransactions();
    }

    @Then("^i select an account in transactions$")
    public void transactions_select_account() {
        business_transactions.iChooseAccount();
    }

    @And("^i see and press the print button$")
    public void i_press_transactions_print_button() {
        business_transactions.iPressPrintButton();
    }
}
