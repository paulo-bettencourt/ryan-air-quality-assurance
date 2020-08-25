package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class steps_bill_payments_review {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_bill_payments_review(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @Then("^i click on bill payments on the nav bar$")
    public void iClickOnBillPaymentsOnTheNavBar() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[1]/nav/ul/li[2]/a/i")).click();
    }

    @And("^search for the \"([^\"]*)\" entity on the search bar$")
    public void searchForTheEntityOnTheSearchBar(String entity) throws InterruptedException {
        //search for the entity code
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-home/div/div/div[2]/form/bb-search-box-ui/div/input")).sendKeys(entity);
        //select the entity from the search dropdown list
        //  driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-home/div/div/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-home/div/div/div[2]/div/div")).click();
        Thread.sleep(2000);
    }


    @Then("^I select an account$")
    public void iSelectAnAccount() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/button/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/div/button[1]")).click();
        Thread.sleep(2000);
    }

    @And("^i insert a reference$")
    public void iInsertAReference() {

        driver.findElement(By.xpath("//*[@id=\"reference\"]")).sendKeys("123456789");
    }

    @Then("^i select an amount$")
    public void iSelectAnAmount() throws InterruptedException {
        //select the amount dropdown
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[4]/div/sba-dropdown-ui/div/div")).click();
        //select the first amount form the dropdown
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[4]/div/sba-dropdown-ui/div/div[2]/button[1]")).click();
        Thread.sleep(2000);
    }

    @And("^i am able to click on Next button$")
    public void iAmAbleToClickOnNextButton() {
        //see if next button is enabled
        boolean enable = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[7]/bb-button-ui/button")).isEnabled();
        Assert.assertTrue(enable);
        //click on the next button
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[7]/bb-button-ui/button")).click();
    }

    @Then("^i am on the review page$")
    public void iAmOnTheReviewPage() {
        String url = "bill-payments/bill-pay/create/review";
        String s = driver.getCurrentUrl();
        //returns true if we are on the review page
        Assert.assertTrue(s.contains(url));
    }

    @Then("^I select an account for Reference$")
    public void iSelectAnAccountForReference() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-reference-payment/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-reference-payment/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/div/button")).click();
    }

    @Then("^i select an amount for Reference$")
    public void iSelectAnAmountForReference() throws InterruptedException {
        //insert the amount
        driver.findElement(By.xpath("//*[@id=\"bb_element_8\"]")).sendKeys("123");
        Thread.sleep(2000);
    }

    @And("^i am able to click on Next button for Reference$")
    public void iAmAbleToClickOnNextButtonForReference() {
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-reference-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[6]/bb-button-ui/button"));
        if (btn.isEnabled())
            btn.click();
    }

    @Then("^i select an amount \\(standard\\)$")
    public void iSelectAnAmountStandard() throws InterruptedException {
        //select the amount dropdown
        driver.findElement(By.xpath("//*[@id=\"bb_element_9\"]")).sendKeys("100");
    }

    @And("^i am able to click on Next button \\(standard\\)$")
    public void iAmAbleToClickOnNextButtonStandard() {
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[6]/bb-button-ui/button"));
        if (btn.isEnabled())
            btn.click();
    }

    @Then("^I select an account for state$")
    public void iSelectAnAccountForState() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/div/button")).click();

    }

    @Then("^I select an account for Rechargeable$")
    public void iSelectAnAccountForRechargeable() {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-recharge/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-recharge/form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/div/button")).click();

    }
}
