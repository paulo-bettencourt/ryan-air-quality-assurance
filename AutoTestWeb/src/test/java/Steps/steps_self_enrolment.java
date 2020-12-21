package Steps;

import Actions.SelfEnrolment;
import Actions.UserProfile;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class steps_self_enrolment {

    SharedDriver sharedDriver;
    SelfEnrolment selfEnrolment;

    public steps_self_enrolment(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        selfEnrolment = new SelfEnrolment(sharedDriver);
    }


    @Then("^I click on the Register button$")
    public void iClickOnTheRegisterButton() {
        selfEnrolment.ClickRegisterBtn();
    }

    @And("^i choose a client number from the dropdown$")
    public void iChooseAClientNumberFromTheDropdown() {
  selfEnrolment.ClickClientNumber();
    }

    @Then("^i insert \"([^\"]*)\" as a client number$")
    public void iInsertAsAClientNumber(String num) {
        selfEnrolment.InsertClientNumber(num);
    }


    @And("^i click the next button success$")
    public void iClickTheNextButtonSuccess() {
  selfEnrolment.ClickNextBtn();
    }

    @And("^i am in the verification page$")
    public void iAmInTheVerificationPage() {
  selfEnrolment.OnVerificationPage();
    }

    @And("^next button is disabled on SE$")
    public void nextButtonIsDisabledOnSE() {
        Assert.assertFalse(selfEnrolment.NextBtnEnable());
    }
}

