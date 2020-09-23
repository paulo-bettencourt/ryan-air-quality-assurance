package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class steps_language_switcher {

    WebDriver driver;
    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;

    public steps_language_switcher(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        languageSwitcher = new LanguageSwitcher(driver);

    }

    @Then("^want to change language$")
    public void want_to_change_language() {
        languageSwitcher.ChangeLang();

    }

    @And("^change language successfully$")
    public void changeLanguageSuccessfully() throws InterruptedException {
        boolean x = languageSwitcher.isEN();
        Assert.assertTrue(x);

    }
}
