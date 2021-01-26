package Steps;


import Actions.BEPUserEnrolment;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_BEP_UserEnrolment_Search {

    SharedDriver sharedDriver;
    BEPUserEnrolment bepUserEnrolment;

    public steps_BEP_UserEnrolment_Search(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        bepUserEnrolment = new BEPUserEnrolment(sharedDriver);
    }

    @Then("^i click on the User Enrolment menu$")
    public void iClickOnTheUserEnrolmentMenu() {
        bepUserEnrolment.clickUserEnrolmentMenu();
    }

    @And("^i click on the dropdown and select Client Number$")
    public void iClickOnTheDropdownAndSelectClientNumber() {
        bepUserEnrolment.clickDropdown();
        bepUserEnrolment.selectClientNumber();
    }

    @Then("^i insert the client number \"([^\"]*)\"$")
    public void iInsertTheClientNumber(String ClientID) {
        bepUserEnrolment.insertClientNumber(ClientID);
    }

    @Then("^Click on the Find Customer button$")
    public void clickOnTheFindCustomerButton() {
        bepUserEnrolment.clickSearch();
    }


    @And("^i click on the customer$")
    public void iClickOnTheCustomer() {
        bepUserEnrolment.clickFirstCustomer();
    }

    @And("^i click on the cancel button$")
    public void iClickOnTheCancelButton() {
        bepUserEnrolment.clickCancelCreateLegalEntity();
    }


}
