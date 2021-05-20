package Steps;

import Actions.BillPaymentsFilter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_bill_payments_filter {

    SharedDriver sharedDriver;
    BillPaymentsFilter billPaymentsFilter;

    public steps_bill_payments_filter(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        billPaymentsFilter = new BillPaymentsFilter(sharedDriver);
    }


    @Then("^i filter for the State Payments Payment type$")
    public void iFilterForTheStatePaymentsPaymentType() {
        billPaymentsFilter.ClickFilterBtn();
        billPaymentsFilter.SelectStatePaymentType();
    }


    @And("^it shows the results$")
    public void itShowsTheResults() {
        billPaymentsFilter.ShowResults();

    }

    @And("^i click on the apply button$")
    public void iClickOnTheApplyButton() {
        billPaymentsFilter.ClickApplyBtn();
    }
}
