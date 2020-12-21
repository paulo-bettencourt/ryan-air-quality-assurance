package Steps;

import Actions.TransferDetails;
import cucumber.api.java.en.Then;
import gherkin.lexer.Sr_cyrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_my_transfers_details {
    WebDriver driver;
    SharedDriver sharedDriver;
    TransferDetails transferDetails;

    public steps_my_transfers_details(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        transferDetails = new TransferDetails(sharedDriver);
    }

    @Then("^i click on My Transfers$")
    public void i_click_on_My_Transfers()  {
    transferDetails.ClickMyTransfers();
    }


    @Then("^i am on My Transfers Page$")
    public void i_am_on_My_Transfers_Page()  {
        transferDetails.OnMyTransfers();
    }
}
