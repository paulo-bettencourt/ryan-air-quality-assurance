package Steps;

import Actions.Business_Dashboard;
import Actions.SelectContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class steps_BusinessDashboard {

    SharedDriver sharedDriver;
    WebDriver driver;
    Business_Dashboard dashboard;

    public steps_BusinessDashboard(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
        driver = sharedDriver.getDriver();
        dashboard = new Business_Dashboard(sharedDriver);
    }

    @And("^i am on the business dashboard$")
    public void i_am_in_business_dashboard() {
        dashboard.iAmInBusinessDashboard();
    }

    @And("^i can see the navigation bar$")
    public void i_can_see_the_navigation_bar() {
        dashboard.viewNavigationBar();
    }

    @And("^i can view the accounts list view$")
    public void i_can_see_the_accounts_list_view() {
        dashboard.viewAccountsListView();
    }

    @And("^i can view the accounts cards view$")
    public void i_can_see_the_accounts_cards_view() {
        dashboard.viewAccountsCardsView();
    }

    @And("^i confirm i am on the business dashboard in portuguese$")
    public void i_am_in_business_dashboard_pt() {
        dashboard.iAmInBusinessDashboardPortuguese();
    }

    @Then("^i click on the kebab button of the first account$")
    public void i_click_on_first_account_kebab_button() {
        dashboard.iClickOnFirstAccountKebabMenu();
    }

    @Then("^i click to see details on the kebab$")
    public void on_kebab_click_see_details() {
        dashboard.iChooseSeeDetailsKebabMenu();
    }

}
