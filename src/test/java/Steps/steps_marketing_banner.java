package Steps;


import Actions.Login;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_marketing_banner {
    WebDriver driver;
    SharedDriver sharedDriver;
    Login login;

    public steps_marketing_banner(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        PageFactory.initElements(driver, this);
        login = new Login (driver, sharedDriver);

    }

    @And("^click on banner$")
    public void clickOnBanner() {
     login.clickBanner();
    }


    @And("^redirect successfully$")
    public void redirectSuccessfully() {
        String url = "heroisdeazul";
        boolean found = false;

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);

            if (driver.getCurrentUrl().contains(url)) {
                found = true;
            }
        }

        //Makes the test fail if the drivers url doesn't contains the variable url
        Assert.assertTrue(found);
    }


}
