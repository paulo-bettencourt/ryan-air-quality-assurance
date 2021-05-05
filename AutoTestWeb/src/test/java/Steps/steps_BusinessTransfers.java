package Steps;

import Actions.Business_Transfers;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_BusinessTransfers {

    SharedDriver sharedDriver;
    WebDriver driver;
    Business_Transfers business_transfers;

    public steps_BusinessTransfers(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
        driver = sharedDriver.getDriver();
        business_transfers = new Business_Transfers(sharedDriver);
    }

    @And("^i enter and confirm i am in transfers page$")
    public void i_am_in_transfers_page() {
        business_transfers.iAmInTransfers();
    }

    @And("^i enter a beneficiary name \"([^\"]*)\" and account \"([^\"]*)\"$")
    public void i_enter_beneficiary_name_and_account(String benefactorName, String account) {
        business_transfers.fillInNameAndAccount(benefactorName, account);
    }

    @And("^i enter other bank beneficiary name \"([^\"]*)\" and account \"([^\"]*)\"$")
    public void i_enter_other_bank_beneficiary_name_and_account(String benefactorName, String account) throws InterruptedException {
        business_transfers.fillInNameAndAccountOtherBank(benefactorName, account);
    }

    @And("^i enter the amount \"([^\"]*)\" to transfer$")
    public void i_enter_transfer_amount(String amount) {
        business_transfers.fillAmount(amount);
    }

    @And("^i enter the amount \"([^\"]*)\" to transfer and description \"([^\"]*)\"$")
    public void i_enter_transfer_amount_and_description(String amount, String description) {
        business_transfers.fillAmountAndDescription(amount, description);
    }

    @And("^i enter the transfer description \"([^\"]*)\"$")
    public void i_enter_transfer_description(String description) throws InterruptedException {
        business_transfers.fillDescription(description);
    }

    @And("^i see and click the continue button$")
    public void i_click_continue_button() {
        business_transfers.clickContinueButton();
    }

    @And("^i confirm the transfer$")
    public void i_confirm_the_transfer() {
        business_transfers.clickTransferConfirmationButton();
    }
    @And("^i click on other bank option button$")
    public void i_click_other_bank_button() {
        business_transfers.clickOtherBankButton();
    }

    @And("^i see TOTP modal and enter the TOTP code$")
    public void i_see_and_enter_totp_code() {
        business_transfers.enterOTPCode();
        business_transfers.submitOTPTransfer();
    }

    @And("^i see and click the edit button$")
    public void i_see_and_click_edit_button() {
        business_transfers.clickEditButton();
    }

    @And("^i see and click the cancel transfer button$")
    public void i_see_and_click_cancel_button() {
        business_transfers.clickCancelButton();
        business_transfers.confirmCancelTransfer();
    }

    @Then("^i search and select the account \"([^\"]*)\"$")
    public void i_search_and_select_account(String accountName) throws InterruptedException {
        business_transfers.searchAndSelectAccount(accountName);
    }

    @And("^i verify transfer description \"([^\"]*)\"$")
    public void i_verifiy_transfer_description(String description) {
        business_transfers.verifyDescription(description);
    }
}

