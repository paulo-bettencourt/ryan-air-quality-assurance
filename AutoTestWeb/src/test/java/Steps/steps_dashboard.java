package Steps;

import Actions.Dashboard;
import cucumber.api.java.en.*;
import org.openqa.selenium.support.PageFactory;

public class steps_dashboard {

    SharedDriver sharedDriver;
    Dashboard dashboard;

    public steps_dashboard(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        dashboard = new Dashboard(sharedDriver);

    }

    @Then("^i can click on a \"([^\"]*)\" account$")
    public void iCanClickOnAAccount(String accountType) {
        switch (accountType) {

            case "current":
                dashboard.clickCurrentAccDashboard();
                break;
            case "savings":
                dashboard.clickSavingsDashboard();
                break;
            case "loans":
                dashboard.clickLoanDashboard();
                break;
            case "credit":
                dashboard.clickCreditCardDashboard();
                break;
            case "debit":
                dashboard.clickDebitCardDashboard();
                break;
            default:

        }

    }
}
