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

    @Then("^i click on the kebab menu of documentary collection account$")
    public void i_click_on_kebab_menu_of_documentary_collection_account() {
        dashboard.iClickOnDocumentaryCollectionAccountKebabMenu();
    }

    @Then("^i click to see details on the kebab$")
    public void on_kebab_click_see_details() {
        dashboard.iChooseSeeDetailsKebabMenu();
    }

    @Then("^i click to see details on the documentary collection kebab$")
    public void on_documentary_collection_kebab_click_see_details() {
        dashboard.iChooseSeeDocumentaryCollectionKebabMenuDetails();
    }

    @Then("^i can view account selector$")
    public void i_can_view_account_selector() {
        dashboard.viewAccountSelector();
    }
    @And("^i print the account details$")
    public void i_print_account_details() throws Exception {
        dashboard.iPrintAccountDetails();
    }

    @Then("^i click on the kebab menu of savings account$")
    public void i_click_on_kebab_menu_of_savings_account() {
        dashboard.iClickOnSavingsAccountKebabMenu();
    }

    @Then("^i click to see details on the loan kebab$")
    public void on_loan_kebab_click_see_details() {
        dashboard.iChooseLoanKebabMenuDetails();
    }

    @Then("^i click on the kebab menu of loan account$")
    public void i_click_on_kebab_menu_of_loan_account() {
        dashboard.iClickOnLoanAccountKebabMenu();
    }

    @Then("^i click to see details on the debit kebab$")
    public void on_debit_kebab_click_see_details() {
        dashboard.iChooseDebitKebabMenuDetails();
    }

    @Then("^i click on the kebab menu of debit account$")
    public void i_click_on_kebab_menu_of_debit_account() {
        dashboard.iClickOnDebitAccountKebabMenu();
    }

    @Then("^i click on the kebab menu of bank guarantee account$")
    public void i_click_on_kebab_menu_of_bank_guarantee() {
        dashboard.iClickOnBankGuaranteeAccountKebabMenu();
    }

    @Then("^i click to see details on the bank guarantee kebab$")
    public void on_bank_guarantee_kebab_click_see_details() {
        dashboard.iChooseBankGuaranteeKebabMenuDetails();
    }

    @Then("^i click on the kebab menu of letter of credit account$")
    public void i_click_on_kebab_menu_of_letter_of_credit() {
        dashboard.iClickOnLetterOfCreditAccountKebabMenu();
    }

    @Then("^i click to see details on the letter of credit kebab$")
    public void on_bank_letters_of_Credit_kebab_click_see_details() {
        dashboard.iChooseLetterOfCreditKebabMenuDetails();
    }
}
