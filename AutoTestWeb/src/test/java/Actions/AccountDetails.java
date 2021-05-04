package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountDetails {
    SharedDriver sharedDriver;

    public AccountDetails(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);

    }

    @FindBy(how = How.ID, using = "tab_bb-tab-container-ang-_-b69b3259f929_1")
    WebElement accountDetailsTab;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(), ' General' ) ]")
    WebElement generalLabel;

    public void clickAccountDetailsTab() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountDetailsTab)).click();
    }

    public void accountDetailsLoaded() {
       sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabel));

    }


}
