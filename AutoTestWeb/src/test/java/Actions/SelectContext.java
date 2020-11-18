package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectContext {

    SharedDriver sharedDriver;

    public SelectContext(SharedDriver sharedDriver) {

        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Select context ')]")
    WebElement selectContextTitle;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), ' Hi CompanyB User1 ')]")
    WebElement helloMessage;


    public void iAmInSelectContextPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(selectContextTitle));
    }
    
    public void iSelectContext(String serviceAgreementName) {
        sharedDriver.getDriver().findElement(By.xpath("//div[contains(text(), '" + serviceAgreementName + "')]")).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(helloMessage));
    }


}
