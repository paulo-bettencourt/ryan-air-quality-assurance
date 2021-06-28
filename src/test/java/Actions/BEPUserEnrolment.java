package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BEPUserEnrolment {

    SharedDriver sharedDriver;

    public BEPUserEnrolment(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div/sba-sba-employee-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-spa-widget-ang/div/ul/li[3]/a/div/span")
    WebElement userEnrolmentMenu;

    @FindBy(xpath = "//*[@id=\"bb_input_1\"]")
    WebElement idDropdown;

    @FindBy(xpath = "//*[@id=\"bb_input_1\"]/option[3]")
    WebElement clientNumberOption;

    @FindBy(id = "bb_input_2")
    WebElement clientNumberInput;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-search-widget-extended/bb-user-enrollment-search-widget/section/div/bb-user-enrollment-search/form/div[3]/button")
    WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-search-widget-extended/bb-user-enrollment-search-widget/section/div/bb-user-enrollment-search/div/div/bb-user-enrollment-search-results/div/table/tbody/tr")
    WebElement firstCustomer;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-enrollment-customer-details-widget-extended/bb-user-enrollment-customer-details-widget/bb-user-enrollment-customer-details-layout/bb-user-enrollment-customer-details-action-buttons/div/button[2]")
    WebElement cancelLegalEntity;

    public void clickUserEnrolmentMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(userEnrolmentMenu)).click();

    }

    public void clickDropdown() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(idDropdown)).click();
    }

    public void selectClientNumber() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(clientNumberOption)).click();
    }

    public void insertClientNumber(String clientNumber) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(clientNumberInput)).sendKeys(clientNumber);
    }

    public void clickSearch() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchBtn)).click();
    }

    public void clickFirstCustomer() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstCustomer)).click();
    }

    public void clickCancelCreateLegalEntity() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cancelLegalEntity)).click();
    }
}
