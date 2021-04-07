package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dashboard {

    SharedDriver sharedDriver;

    public Dashboard(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[1]/div[2]/div/button[1]/bb-product-kind/div")
    WebElement currentAcc;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[2]/div[2]/div/button/bb-product-kind/div")
    WebElement savings;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[2]/div[2]/div/button[3]")
    WebElement loans;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[3]/div[2]/div/button")
    WebElement creditCard;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[5]/div[2]/div/button[1]")
    WebElement debitCard;


    public void clickCurrentAccDashboard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(currentAcc)).click();
    }

    public void clickSavingsDashboard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(savings)).click();
    }

    public void clickLoanDashboard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(loans)).click();
    }

    public void clickCreditCardDashboard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(creditCard)).click();
    }

    public void clickDebitCardDashboard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(debitCard)).click();
    }


}
