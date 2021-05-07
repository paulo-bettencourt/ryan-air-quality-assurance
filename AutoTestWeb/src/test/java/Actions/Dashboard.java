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

    @FindBy(how = How.XPATH, using = "//div[contains(text(), '1004111008')]")
    WebElement currentAcc;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), '1000873773')]")
    WebElement savings;

    @FindBy(how = How.XPATH, using = "//div[contains (text(), 'LD1923308750')]")
    WebElement loans;

    @FindBy(how = How.XPATH, using = "//div[contains (text(), '**** **** ****  2415')]")
    WebElement creditCard;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), '**** **** ****  8330')]")
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
