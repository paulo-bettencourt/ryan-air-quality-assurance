package Steps;

import Actions.BillPaymentsFilter;
import Actions.BillPaymentsSearch;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_bill_payments_search {

    SharedDriver sharedDriver;
    BillPaymentsFilter billPaymentsFilter;
    BillPaymentsSearch billPaymentsSearch;

    public steps_bill_payments_search(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        billPaymentsFilter = new BillPaymentsFilter(sharedDriver);
        billPaymentsSearch = new BillPaymentsSearch(sharedDriver);
    }


    @And("^i select the My Payments tab$")
    public void iSelectTheMyPaymentsTab() {
        billPaymentsFilter.clickMyPaymentsTab();

    }

    @Then("^i search for the \"([^\"]*)\" payment$")
    public void iSearchForThePayment(String entity) {
        billPaymentsSearch.SearchEntity(entity);
    }

    @And("^it shows the results for the search$")
    public void itShowsTheResultsForTheSearch() {
        billPaymentsSearch.SeeSearchResults();
    }
}
