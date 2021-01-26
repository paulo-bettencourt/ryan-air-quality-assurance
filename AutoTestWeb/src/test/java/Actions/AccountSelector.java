package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountSelector {
    SharedDriver sharedDriver;

    public AccountSelector(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-selector-extended-widget/bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/div/span")
    WebElement accSelector;

    @FindBy(className = "loan-account")
    WebElement loanAccSelector;

    public void SelectAccSelector() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accSelector)).click();
    }

    public void SelectLoanOptionAccSelector() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(loanAccSelector)).click();
    }
}
