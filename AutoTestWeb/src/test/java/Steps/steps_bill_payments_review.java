package Steps;

import Actions.BillPaymentsReview;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void i_am_in_transactions_page() {
        billPaymentsReview.iAmInBillPayments();
    }

    @Then("^i confirm i see \"([^\"]*)\" after inserting the entity number$")
    public void i_see_my_entity_search_results(String entitySearchResults) {
        billPaymentsReview.iSeeResultsForEntitySearch(entitySearchResults);
    }

    @And("^i select \"([^\"]*)\" the debit account for bills")
    public void iSelectDebitAccountBills(String account) {
        billPaymentsReview.iSelectBillDebitAccount(account);
    }

    @Then("^i confirm the details of the selected account are displaying well, the name \"([^\"]*)\" and the account \"([^\"]*)\"$")
    public void billDebitDisplayingCorrectly(String accountName, String accountNumber) {
        billPaymentsReview.iConfirmBillDebitAccountSelectedWithSuccess(accountName, accountNumber);
    }

}


