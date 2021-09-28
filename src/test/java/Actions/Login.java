package Actions;

import Steps.SharedDriver;
import Config.ReadPropFile;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;
import java.util.Date;

public class Login {
    private static WebDriver driver;
    private SharedDriver sharedDriver;

    public Login(WebDriver driver, SharedDriver sharedDriver) {
        this.driver = driver;
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using = "email")
    WebElement txtBoxUsername;



    public void openBrowser() throws IOException, InterruptedException {
        String url = null;
        String domain = null;
        url = ReadPropFile.ReadConfig("url.mainPortal");
        domain = ReadPropFile.ReadConfig("url.identityDomain");
        driver.get(url);
    }

    //in this way we can set opening browsers in other realms (Bank Employee, Identity, etc.)
    public void openBrowser_BEP() throws IOException, InterruptedException {
        String url = null;
        String domain = null;
        domain = ReadPropFile.ReadConfig("url.identityDomain");
        url = ReadPropFile.ReadConfig("url.employeePortal");
        driver.get(url);
    }

    public void fillIn(String user, String pass) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(txtBoxUsername));
        txtBoxUsername.click();
    }
}
