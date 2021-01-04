package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BEPSearchUser {
    SharedDriver sharedDriver;

    public BEPSearchUser(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(id = "bb_input_0")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/sba-user-search-widget-extended/bb-user-search-widget/section/div[1]/bb-search-box-ui/div/div[1]/button")
    WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/sba-user-search-widget-extended/bb-user-search-widget/section/div[2]/div[2]/table/tbody/tr[1]")
    WebElement firstUser;


    public void searchUser(String user) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchField)).sendKeys(user);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchBtn)).click();
    }

    public void clickOnUser() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstUser)).click();
    }
}
