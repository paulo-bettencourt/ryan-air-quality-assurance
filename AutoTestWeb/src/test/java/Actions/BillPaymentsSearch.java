package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BillPaymentsSearch {
    SharedDriver sharedDriver;

    public BillPaymentsSearch(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div/div/div[2]/form/bb-search-box-ui/div/input")
    WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-payment-history-widget/sba-filter-form-ui/div/div/div[1]/div/bb-search-box-ui/div/div/button")
    WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-payment-history-widget/div[1]/div[1]/div[2]")
    WebElement results;

    public void SearchEntity(String entity) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchInput)).sendKeys(entity);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchBtn)).click();
    }

    public void SeeSearchResults() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(results));
    }
}
