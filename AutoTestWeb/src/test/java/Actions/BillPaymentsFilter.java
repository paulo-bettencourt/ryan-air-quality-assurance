package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BillPaymentsFilter {
    SharedDriver sharedDriver;

    public BillPaymentsFilter(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(id = "tab_bb-tab-container-ang-_-dff5de7c15b3_1")
    WebElement myPaymentsTab;

    @FindBy(xpath = "//button[contains(text(), ' Filter ')]")
    WebElement filterBtn;

    @FindBy(id = "bb_input_1")
    WebElement paymentTypeDropdown;

    @FindBy(xpath = "//*[@id=\"bb_input_1\"]/option[3]")
    WebElement statePaymentOption;

    @FindBy(xpath = "//*[@id=\"tabPanel_bb-tab-container-ang-_-dff5de7c15b3\"]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-payment-history-widget/sba-filter-form-ui/div/form/div/div[4]/bb-button-ui[3]/button/span")
    WebElement applyBtn;

    @FindBy(className = "history-entity-icon")
    WebElement results;

    public void clickMyPaymentsTab() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(myPaymentsTab)).click();
    }

    public void ClickFilterBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(filterBtn)).click();
    }

    public void SelectStatePaymentType() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(paymentTypeDropdown)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(statePaymentOption)).click();
    }

    public void ClickApplyBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(applyBtn)).click();
    }

    public void ShowResults() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(results));
    }
}
