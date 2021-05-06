package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Transactions {
    SharedDriver sharedDriver;

    public Transactions(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);

    }

    @FindBy(className = "transaction-title")
    WebElement firstTransaction;

    @FindBy(className = "bb-empty-state")
    WebElement emptyTransactions;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/div/div[2]/bb-transaction-details/div[1]/span")
    WebElement generalLabel;

    public void TransactionsPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstTransaction));
    }

    public void EmptyTransactionsPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(emptyTransactions));
    }

    public void SeeTransactionDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabel));
    }

    public void ClickFirstTransaction() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstTransaction)).click();
    }

}
