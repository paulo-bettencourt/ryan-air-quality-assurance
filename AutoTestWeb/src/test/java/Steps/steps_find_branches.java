package Steps;

import Actions.LanguageSwitcher;
import Actions.Login;
import Actions.Logout;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class steps_find_branches {
    WebDriver driver;
    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;

    public steps_find_branches(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        languageSwitcher = new LanguageSwitcher(driver);

    }

    @Then("^want to find nearest branches$")
    public void want_to_find_nearest_branches() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("branch-link")).click();
    }

    @And("^found branches successfully$")
    public void foundBranchesSuccessfully() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        boolean found = false;
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().contains("https://www.google.com/maps/search/standard+bank+angola")) {
                found = true;
            }
        }
        if (!found) {
            driver.findElement(By.id("123"));
        }
    }
}
