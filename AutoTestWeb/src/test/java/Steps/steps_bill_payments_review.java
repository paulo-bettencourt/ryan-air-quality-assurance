package Steps;

import Actions.BillPaymentsReview;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_bill_payments_review {

    SharedDriver sharedDriver;
    BillPaymentsReview billPaymentsReview;

    public steps_bill_payments_review(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        billPaymentsReview = new BillPaymentsReview(sharedDriver);
    }


    @Then("^i click on bill payments on the nav bar$")
    public void iClickOnBillPaymentsOnTheNavBar() {
        billPaymentsReview.ClickBillPaymentsMenu();
    }

    @And("^search for the \"([^\"]*)\" entity on the search bar$")
    public void searchForTheEntityOnTheSearchBar(String entity) {
        billPaymentsReview.InputSearchBar(entity);
        billPaymentsReview.SelectFirstEntity();

    }


    @And("^i insert a reference \"([^\"]*)\"$")
    public void iInsertAReference(String reference) {
        billPaymentsReview.InsertReferenceRechargeable(reference);
    }

    @Then("^i am on the review page$")
    public void iAmOnTheReviewPage() {
        billPaymentsReview.ReviewPageCheck();
    }


    @And("^i am able to click on Next button for Reference$")
    public void iAmAbleToClickOnNextButtonForReference() throws InterruptedException {
        Thread.sleep(3000);
        billPaymentsReview.ClickNextBtnReference();
    }

//    @Then("^i select an amount \\(standard\\)$")
//    public void iSelectAnAmountStandard() throws InterruptedException {
//        //select the amount dropdown
//        driver.findElement(By.xpath("//*[@id=\"bb_element_9\"]")).sendKeys("100");
//    }

//    @And("^i am able to click on Next button \\(standard\\)$")
//    public void iAmAbleToClickOnNextButtonStandard() {
//        WebElement btn = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[6]/bb-button-ui/button"));
//        if (btn.isEnabled())
//            btn.click();
//    }


    @And("^i am able to click on Next button for Rechargeable$")
    public void iAmAbleToClickOnNextButtonForRechargeable() throws InterruptedException {
        Thread.sleep(3000);
        billPaymentsReview.ClickNextBtnRechargeable();
    }

    @Then("^i select an amount rechargeable$")
    public void iSelectAnAmountRechargeable() {
        billPaymentsReview.SelectFirstAmountRechargeable();
    }


    @Then("^i insert an amount \"([^\"]*)\" for Reference$")
    public void iInsertAnAmountForReference(String amount) {
        billPaymentsReview.InsertAmountReference(amount);
    }


    @And("^i am able to click on Next button for State Configurable$")
    public void iAmAbleToClickOnNextButtonForStateConfigurable() throws InterruptedException {
        Thread.sleep(3000);
        billPaymentsReview.ClickNextBtnStateConfig();
    }

    @And("^i am able to click on Next button for State Standard$")
    public void iAmAbleToClickOnNextButtonForStateStandard() throws InterruptedException {
        Thread.sleep(3000);
        billPaymentsReview.ClickNextBtnStateStandard();
    }

    @Then("^i select an amount for State Configurable$")
    public void iSelectAnAmountForStateConfigurable() {
        billPaymentsReview.SelectFirstAmountStateConfig();
    }

    @Then("^i insert an amount \"([^\"]*)\" for State Standard$")
    public void iInsertAnAmountForStateStandard(String amount) {
        billPaymentsReview.InsertAmountStateStandard(amount);
    }

    @And("^in business search for the \"([^\"]*)\" entity on the search bar$")
    public void businessSearchForTheEntityOnTheSearchBar(String entity) {
        billPaymentsReview.inputSearchBarBusiness(entity);
        billPaymentsReview.businessSelectFirstEntity();
    }

    @And("^i enter and confirm i am in bill payments page$")
    public void i_am_in_bill_payments_page() {
        billPaymentsReview.iAmInBillPayments();
    }

    @And("^i select a current account from selector dropdown$")
    public void i_select_a_current_account_from_dropdown() {
        billPaymentsReview.selectCurrentAccount();
    }


    @And("^i select \"([^\"]*)\" the debit account for bills")
    public void i_select_debit_account_bills(String account) {
        billPaymentsReview.iSelectBillDebitAccount(account);
    }

    @Then("^i confirm account name \"([^\"]*)\" and the account number \"([^\"]*)\" are displayed$")
    public void bill_debit_displaying_correctly(String accountName, String accountNumber) {
        billPaymentsReview.iConfirmBillDebitAccountSelectedWithSuccess(accountName, accountNumber);
    }

    @Then("^i confirm i see \"([^\"]*)\" after inserting the entity number$")
    public void i_see_my_entity_search_results(String entitySearchResults) {
        billPaymentsReview.iSeeResultsForEntitySearch(entitySearchResults);
    }

}


