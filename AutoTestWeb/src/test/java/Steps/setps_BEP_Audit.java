package Steps;

import Actions.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class setps_BEP_Audit {
    WebDriver driver;
    SharedDriver sharedDriver;

    public setps_BEP_Audit(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i click on the Audit menu$")
    public void iClickOnTheAuditMenu() {
        Actions act = new Actions(driver);
        //moveToElememt shift the mouse to the center of the element
        act.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-spa-widget-ang/div/ul/li[2]/a/div"))).click().perform();

    }

    @And("^i click on My Categories dropdown$")
    public void iClickOnMyCategoriesDropdown() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-search/div/div/form/div/div[3]/div/div[1]/bb-dropdown-single-select-ui/select")).click();
    }

    @Then("^i select Contacts option$")
    public void iSelectContactsOption() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-search/div/div/form/div/div[3]/div/div[1]/bb-dropdown-single-select-ui/select/option[4]")).click();
        Thread.sleep(3000);
    }

    @And("^i click on the continue button$")
    public void iClickOnTheContinueButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-search/div/div/form/div/div[4]/div[1]/button")).click();
        Thread.sleep(3000);
    }

    @Then("^i select Payments option$")
    public void iSelectPaymentsOption() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-search/div/div/form/div/div[3]/div/div[1]/bb-dropdown-single-select-ui/select/option[9]")).click();
    }


    @And("^i select Payments on Type dropdown$")
    public void iSelectPaymentsOnTypeDropdown() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-search/div/div/form/div/div[3]/div/div[2]/bb-dropdown-single-select-ui/select/option[3]")).click();
        Thread.sleep(3000);
    }

    @And("^i select Bill Payments on Type dropdown$")
    public void iSelectBillPaymentsOnTypeDropdown() {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-search/div/div/form/div/div[3]/div/div[2]/bb-dropdown-single-select-ui/select/option[2]")).click();
    }
}
