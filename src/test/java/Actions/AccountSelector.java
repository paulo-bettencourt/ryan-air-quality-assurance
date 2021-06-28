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

    @FindBy(className = "ng-arrow-wrapper")
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
