package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.By;
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

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Select context ')] | //h3[contains(text(), ' Selecionar Contexto ')]")
    WebElement selectContextTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Select context ')]")
    WebElement changeContextTitle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui//div[contains(text(), 'Hi')] | //*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui//div[contains(text(), 'Olá')]")
    WebElement helloMessage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), ' Hi Denise Silva ')]")
    WebElement helloMessagePortuguese;

    @FindBy(how = How.XPATH, using = "//*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui/div/button/div/div")
    WebElement contextDropdownButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui/div/div/div/bb-user-context-menu-dropdown/button[1]")
    WebElement changeContextButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"context-menu-dropdown\"]//bb-user-context-menu-dropdown/button[1]/div[2]/div[2]")
    WebElement currentContext;



    public void iAmInSelectContextPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(selectContextTitle));
    }
    
    public void iSelectContext(String serviceAgreementName) {
        sharedDriver.getDriver().findElement(By.xpath("//bb-service-agreement-item/div/div/div[text() = '"+serviceAgreementName+"']")).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(helloMessage));
    }
    public void iSelectContextPortuguese(String serviceAgreementName) {
        sharedDriver.getDriver().findElement(By.xpath("//bb-service-agreement-item/div/div/div[text() = '"+serviceAgreementName+"']")).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(helloMessagePortuguese));
    }

    public void selectContextDropdown(){
        contextDropdownButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(changeContextButton));
        changeContextButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(changeContextTitle));
    }

    public void verifySelectedContext(String context){
        contextDropdownButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(currentContext));
        sharedDriver.getDriver().findElement(By.xpath("//*[@id=\"context-menu-dropdown\"]//bb-user-context-menu-dropdown/button[1]/div[2]/div[contains(text(),'"+ context +"')]"));
    }

    public void verifyContextAndName(String loggedInUser, String context){
        sharedDriver.getDriver().findElement(By.xpath("//div[contains(text(), 'Hi CompanyB "+ loggedInUser +"')] | //div[contains(text(), 'Olá "+ loggedInUser +"')]"));
        this.verifySelectedContext(context);
    }
}
