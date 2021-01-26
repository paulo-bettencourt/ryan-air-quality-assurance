package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BEPAudit {
    SharedDriver sharedDriver;

    public BEPAudit(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-spa-widget-ang/div/ul/li[2]/a/div/span")
    WebElement auditMenu;

    @FindBy(id = "bb_input_3")
    WebElement categoriesDropdown;

    @FindBy(xpath = "//*[@id=\"bb_input_3\"]/option[6]")
    WebElement contactOption;

    @FindBy(xpath = "//*[@id=\"bb_input_3\"]/option[11]")
    WebElement paymentOption;

    @FindBy(id = "bb_input_4")
    WebElement typeDropdown;

    @FindBy(xpath = "//*[@id=\"bb_input_4\"]/option[3]")
    WebElement paymentTypeOption;

    @FindBy(xpath = "//*[@id=\"bb_input_4\"]/option[2]")
    WebElement billPaymentTypeOption;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-search/div/div/form/div/div[4]/div[1]/button")
    WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-audit-query-widget/section/bb-audit-query-results/div[2]/bb-audit-query-results-list/div[1]/table/tbody/tr[1]")
    WebElement results;


    public void clickAuditMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(auditMenu)).click();
    }

    public void selectCategoriesDropdown() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(categoriesDropdown)).click();
    }

    public void selectTypeDropdown() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(typeDropdown)).click();
    }

    public void selectContactsOption() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(contactOption)).click();
    }

    public void selectPaymentsOption() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(paymentOption)).click();
    }

    public void selectTypePaymentsOption() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(paymentTypeOption)).click();
    }

    public void selectTypeBillPaymentsOption() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(billPaymentTypeOption)).click();
    }

    public void clickContinueButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(continueBtn)).click();
    }

    public void seeResults(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(results));
    }
}
