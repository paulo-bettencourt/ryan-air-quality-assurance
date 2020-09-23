package Steps;

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
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_self_enrolment(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @Then("^I click on the Register button$")
    public void iClickOnTheRegisterButton() {
        driver.findElement(By.xpath("//*[@id=\"kc-enrollment\"]")).click();
    }

    @And("^i choose a client number from the dropdown$")
    public void iChooseAClientNumberFromTheDropdown() throws InterruptedException {
        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"bb_input_0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"bb_input_0\"]/option[3]")).click();
    }

    @Then("^i insert \"([^\"]*)\" as a client number$")
    public void iInsertAsAClientNumber(String num) {

        driver.findElement(By.xpath("//*[@id=\"bb_input_1\"]")).sendKeys(num);
    }


    @And("^i click the next button success$")
    public void iClickTheNextButtonSuccess() throws InterruptedException {
        Thread.sleep(1000);
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"606f7742-fb56-49e4-ad61-9d66ab64f7f1\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-self-enrollment-identification-widget-extended/bb-self-enrollment-identification-widget/bb-self-enrollment-identification-ui/div[2]/bb-load-button-ui/button"));

        Assert.assertTrue(btn.isEnabled());
        //if the button is not enabled, it fail in the assert step and never do the btn.click()
        btn.click();

    }

    @And("^i click the next button error$")
    public void iClickTheNextButtonError() throws InterruptedException {
        Thread.sleep(1000);
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"606f7742-fb56-49e4-ad61-9d66ab64f7f1\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-self-enrollment-identification-widget-extended/bb-self-enrollment-identification-widget/bb-self-enrollment-identification-ui/div[2]/bb-load-button-ui/button"));

        Assert.assertFalse(btn.isEnabled()); //this line will pass if the condition btn.isEnalbed() is false
    }


    @And("^i am in the verification page$")
    public void iAmInTheVerificationPage() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"code0\"]")).sendKeys("0");
    }
}

