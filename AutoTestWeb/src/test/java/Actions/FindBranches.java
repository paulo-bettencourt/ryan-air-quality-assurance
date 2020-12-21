package Actions;

import Steps.SharedDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindBranches {
    SharedDriver sharedDriver;

    public FindBranches(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(className = "branch-link")
    WebElement findBranchesLink;

    @FindBy(id = "searchbox-searchbutton")
    WebElement searchBtnGoogleMaps;


    public void ClickFindBranches() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(findBranchesLink)).click();
    }

    public void OnFindBranchesPage() {
        String url = "https://www.google.com/maps/search/standard+bank+angola";
        boolean found = false;

        for (String handle : sharedDriver.getDriver().getWindowHandles()) {
            sharedDriver.getDriver().switchTo().window(handle);

            if (sharedDriver.getDriver().getCurrentUrl().contains(url))
                found = true;

        }
        //Makes the test fail if the drivers url doesn't contains the variable url
        Assert.assertTrue(found);
    }


}
