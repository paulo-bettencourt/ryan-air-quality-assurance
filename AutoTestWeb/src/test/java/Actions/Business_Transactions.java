package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Business_Transactions {

    SharedDriver sharedDriver;

    public Business_Transactions(SharedDriver sharedDriver) {

        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Transacções')]")
    WebElement transactionsNavBar;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Transacções ')]")
    WebElement transactionsTitle;

    @FindBy(how = How.CLASS_NAME, using = "bb-account-selector-ui")
    WebElement transactionsSelector;

    @FindBy(how = How.ID, using = "0")
    WebElement firstAccountList;

    @FindBy(how = How.CLASS_NAME, using = "print-button")
    WebElement transactionsPrintButton;

    public void iAmInTransactions() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsNavBar));
        transactionsNavBar.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsTitle));
    }

    public void iChooseAccount() {
        transactionsSelector.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstAccountList)).click();
        transactionsTitle.click();
    }

    public void iPressPrintButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsPrintButton));
        transactionsPrintButton.click();

    }


}
