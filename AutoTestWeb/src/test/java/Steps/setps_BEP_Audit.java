package Steps;

import Actions.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class setps_BEP_Audit {

    SharedDriver sharedDriver;
    BEPAudit bepAudit;

    public setps_BEP_Audit(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        bepAudit = new BEPAudit(sharedDriver);
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @Then("^i click on the Audit menu$")
    public void iClickOnTheAuditMenu() {
        bepAudit.clickAuditMenu();
    }

    @And("^i click on My Categories dropdown$")
    public void iClickOnMyCategoriesDropdown() throws InterruptedException {
        Thread.sleep(2000);
        bepAudit.selectCategoriesDropdown();
    }

    @Then("^i select Contacts option$")
    public void iSelectContactsOption() {
        bepAudit.selectContactsOption();
    }

    @Then("^i select Payments option$")
    public void iSelectPaymentsOption() {
        bepAudit.selectPaymentsOption();
    }

    @And("^i click on the continue button$")
    public void iClickOnTheContinueButton() {
        bepAudit.clickContinueButton();
    }


    @And("^i click on Type dropdown$")
    public void iClickOnTypeDropdown() {
        bepAudit.selectTypeDropdown();
    }


    @And("^i select Payments option Type dropdown$")
    public void iSelectPaymentsOptionTypeDropdown() {
        bepAudit.selectTypePaymentsOption();
    }


    @And("^i select Bill Payments on Type dropdown$")
    public void iSelectBillPaymentsOnTypeDropdown() {
        bepAudit.selectTypeBillPaymentsOption();
    }


    @And("^i can see the list with results$")
    public void iCanSeeTheListWithResults() {
        bepAudit.seeResults();
    }

}
