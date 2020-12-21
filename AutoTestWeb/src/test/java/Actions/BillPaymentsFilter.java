package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BillPaymentsFilter {
    SharedDriver sharedDriver;

    public BillPaymentsFilter(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]")
    WebElement myPaymentsTab;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-payment-history-widget/sba-filter-form-ui/div/div/div[2]/bb-button-ui/button")
    WebElement filterBtn;

    @FindBy(id = "bb_input_2")
    WebElement paymentTypeDropdown;

    @FindBy(xpath = "//*[@id=\"bb_input_2\"]/option[3]")
    WebElement statePaymentOption;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-payment-history-widget/sba-filter-form-ui/div/form/div/div[4]/bb-button-ui[3]/button")
    WebElement applyBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-payment-history-widget/div[1]/div/div[2]")
    WebElement results;

    public void ClickMyPaymentsTab() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(myPaymentsTab)).click();
    }

    public void ClickFilterBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(filterBtn)).click();
    }

    public void SelectStatePaymentType() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(paymentTypeDropdown)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(statePaymentOption)).click();
    }

    public void ClickApplyBtn(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(applyBtn)).click();
    }

    public void ShowResults() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(results));
    }
}
