package Steps;

import Actions.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class steps_BEP_UserEnrolment_Search {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_BEP_UserEnrolment_Search(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i click on the User Enrolment menu$")
    public void iClickOnTheUserEnrolmentMenu() throws InterruptedException {
       // Thread.sleep(3000);

        Actions act =  new Actions(driver);
        //moveToElememt shift the mouse to the center of the element
        act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-spa-widget-ang/div/ul/li[3]/a/div"))).click().perform();
    }

    @And("^i click on the dropdown and select Client Number$")
    public void iClickOnTheDropdownAndSelectClientNumber() {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-search-widget-extended/bb-user-enrollment-search-widget/section/div/bb-user-enrollment-search/form/div[1]/bb-dropdown-single-select-ui/select")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-search-widget-extended/bb-user-enrollment-search-widget/section/div/bb-user-enrollment-search/form/div[1]/bb-dropdown-single-select-ui/select/option[3]")).click();
    }

    @Then("^i insert the client number \"([^\"]*)\"$")
    public void iInsertTheClientNumber(String ClientID) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-search-widget-extended/bb-user-enrollment-search-widget/section/div/bb-user-enrollment-search/form/div[2]/bb-search-box-ui/div/input")).sendKeys(ClientID);
    }

    @Then("^Click on the Find Customer button$")
    public void clickOnTheFindCustomerButton() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-search-widget-extended/bb-user-enrollment-search-widget/section/div/bb-user-enrollment-search/form/div[3]/button")).click();
    }


    @And("^i click on the customer$")
    public void iClickOnTheCustomer() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-search-widget-extended/bb-user-enrollment-search-widget/section/div/bb-user-enrollment-search/div/div/bb-user-enrollment-search-results/div/table/tbody/tr")).click();
    }

    @And("^i click on the cancel button$")
    public void iClickOnTheCancelButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-customer-details-widget-extended/bb-user-enrollment-customer-details-widget/bb-user-enrollment-customer-details-layout/bb-user-enrollment-customer-details-action-buttons/div/button[2]")).click();
    }


}
