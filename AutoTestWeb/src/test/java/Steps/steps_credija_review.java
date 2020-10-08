package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class steps_credija_review {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_credija_review(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i click on the credijá banner$")
    public void iClickOnTheCredijáBanner() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-campaign-space-widget-ang/div/a")).click();
        Thread.sleep(3000);
    }

    @And("^i change the monthly amount to \"([^\"]*)\"$")
    public void iChangeTheMonthlyAmountTo(String amount) throws Throwable {
        WebElement input = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-sba-loans-dashboard/div/div[2]/div[2]/sba-loans-simulator/div/div[2]/sba-loans-simulator-range[1]/div/div[2]/div[2]/input"));

        int i = 10;

        while (i > 0) {
            input.sendKeys(Keys.BACK_SPACE);
            i--;
        }

        input.sendKeys(amount);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-sba-loans-dashboard/div/div[2]/div[2]/sba-loans-simulator/div/div[3]/div[2]/a[1]/bb-button-ui/button")).click();
        Thread.sleep(3000);
    }


    @Then("^i click on the life insurance contract$")
    public void iClickOnTheLifeInsuranceContract() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-sba-loans-dashboard/div/div[2]/div[2]/sba-loans-simulator/div/div[3]/div[2]/a[1]/bb-button-ui/button")).click();
        Thread.sleep(5000);
    }

    @And("^i am redirected to the life insurance contract$")
    public void iAmRedirectedToTheLifeInsuranceContract() {
        String str = "seguro_terms.pdf";
        boolean found = false;

        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);

        driver.switchTo().window(handlesList.get(1));
        if (driver.getCurrentUrl().contains(str)) {
            found = true;
            driver.close();
            driver.switchTo().window(handlesList.get(0));
            Assert.assertTrue(found);
        }
    }


    @Then("^i click on the product sheet contracts$")
    public void iClickOnTheProductSheetContracts() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-sba-loans-dashboard/div/div[2]/div[2]/sba-loans-simulator/div/div[3]/div[2]/a[2]/bb-button-ui/button")).click();
        Thread.sleep(2000);
    }

    @And("^i am redirected to the product sheet contract$")
    public void iAmRedirectedToTheProductSheetContract() {
        String str = "credija_staff.pdf";
        boolean found = false;

        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);

        driver.switchTo().window(handlesList.get(1));
        if (driver.getCurrentUrl().contains(str)) {
            found = true;
            driver.close();
            driver.switchTo().window(handlesList.get(0));
            Assert.assertTrue(found);
        }
    }

    @Then("^i click on the next button$")
    public void iClickOnTheNextButton() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-sba-loans-dashboard/div/div[2]/div[2]/sba-loans-simulator/div/div[4]/bb-button-ui/button")).click();

    }

    @And("^i am on the credija review page$")
    public void iAmOnTheCredijaReviewPage() throws InterruptedException {
        String str = "Personal";
        Thread.sleep(3000);
        String info = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-review/div[2]/div/div[2]/div[1]/h5")).getText();

        Assert.assertTrue(info.contains(str));
    }

    @Then("^i click on the request button$")
    public void iClickOnTheRequestButton() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-review/div[2]/div/div[5]/a[2]/bb-button-ui/button")).click();
    }

    @Then("^i click on the Preview button$")
    public void iClickOnThePreviewButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-contract/div/div/div[2]/div[2]/a/bb-button-ui/button")).click();
        Thread.sleep(1000);

        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);

        driver.switchTo().window(handlesList.get(1));
        driver.close();
        driver.switchTo().window(handlesList.get(0));

    }

    @And("^i check the boxes$")
    public void iCheckTheBoxes() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"contract-terms\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"insurance-terms\"]")).click();
        Thread.sleep(5000);
    }

    @Then("^The authorize button is enable$")
    public void theAuthorizeButtonIsEnable() {
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-contract/div/div/div[4]/a/bb-button-ui/button"));
        Assert.assertTrue(btn.isEnabled());
    }

    @And("^Click on the cancel button$")
    public void clickOnTheCancelButton() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-contract/div/div/div[4]/bb-button-ui/button")).click();
        //click YES on the pop up
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/button[2]")).click();
    }
}
