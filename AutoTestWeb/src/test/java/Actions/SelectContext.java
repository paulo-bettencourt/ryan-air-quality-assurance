package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectContext {

    SharedDriver sharedDriver;

    public SelectContext(SharedDriver sharedDriver) {

        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Select context ')]")
    WebElement selectContextTitle;

    public void iAmInSelectContextPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(selectContextTitle));

    }

}
