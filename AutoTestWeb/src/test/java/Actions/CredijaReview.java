package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CredijaReview {
    SharedDriver sharedDriver;

    public CredijaReview(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-campaign-space-widget-ang/div/a")
    WebElement credijaBanner;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-sba-loans-dashboard/div/div[2]/div[2]/sba-loans-simulator/div/div[4]/bb-button-ui/button")
    WebElement nextBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-review/div[2]/div/div[2]/div[1]/h5")
    WebElement personalInformationString;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-review/div[2]/div/div[5]/a[2]/bb-button-ui/button")
    WebElement requestNowBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-contract/div/div/div[2]/div[2]/a/bb-button-ui/button")
    WebElement previewBtn;

    @FindBy(id = "contract-terms")
    WebElement checkBox1;

    @FindBy(id = "insurance-terms")
    WebElement checkBox2;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-contract/div/div/div[4]/a/bb-button-ui/button")
    WebElement authorizeBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-loans-widget/sba-loans-contract/div/div/div[4]/bb-button-ui/button")
    WebElement cancelBtn;


    public void ClickCredijaBanner() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(credijaBanner)).click();
    }

    public void ClickNextBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtn)).click();
    }

    public void ReviewPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(personalInformationString));
    }

    public void ClickRequestBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(requestNowBtn)).click();
    }

    public void ClickPreviewBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(previewBtn)).click();
        Set<String> handlesSet = sharedDriver.getDriver().getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);

        sharedDriver.getDriver().switchTo().window(handlesList.get(1));
        sharedDriver.getDriver().close();
        sharedDriver.getDriver().switchTo().window(handlesList.get(0));
    }

    public void CheckBoxes() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(checkBox1)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(checkBox2)).click();
    }

    public void AuthorizeEnable() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(authorizeBtn)).isEnabled();
    }

    public void ClickCancelBtn()  {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cancelBtn)).click();
    }

}
