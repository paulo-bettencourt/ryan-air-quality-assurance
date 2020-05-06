package Steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class steps_find_branches {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_find_branches(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }

    @Then("^want to find nearest branches$")
    public void want_to_find_nearest_branches() throws Throwable {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.className("branch-link")).click();
    }

    @And("^found branches successfully$")
    public void foundBranchesSuccessfully() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String url = "https://www.google.com/maps/search/standard+bank+angola";
        boolean found = false;

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);

            if (driver.getCurrentUrl().contains(url))
            {
                found = true;
            }
        }
        //Makes the test fail if the drivers url doesn't contains the variable url
        Assert.assertTrue(found);
    }

}
