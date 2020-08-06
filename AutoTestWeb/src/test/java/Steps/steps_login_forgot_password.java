package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_login_forgot_password {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_login_forgot_password(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @And("^i forgot my password, so i click on the link$")
    public void iForgotMyPasswordSoIClickOnTheLink() {

        driver.findElement(By.linkText("Click Here")).click();
    }

    @Then("^i am redirected to the forgot password page$")
    public void iAmRedirectedToTheForgotPasswordPage() {
        String url = "login-actions/reset-credentials";
        String x = driver.getCurrentUrl();

        Assert.assertTrue(x.contains(url));
    }
}
