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

    @FindBy(id = "bb_input_0")
    WebElement searchInput;

    public void SearchEntity(String entity) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchInput)).sendKeys(entity);
    }

}
