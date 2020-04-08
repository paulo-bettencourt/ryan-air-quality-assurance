package Steps;

import Actions.*;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_logout {

    WebDriver driver;
    Logout logout;
    SharedDriver sharedDriver;

    public steps_logout(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        logout = new Logout(driver);
    }


    @And("^want to logout$")
    public void want_to_logout() throws Throwable {
        Thread.sleep(3000);
        logout.findDropdownLogout();
    }

    @And("^logout successfully$")
    public void logoutSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("username")).click();
    }

}
