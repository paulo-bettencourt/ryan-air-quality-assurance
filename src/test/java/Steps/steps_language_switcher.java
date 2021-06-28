package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class steps_language_switcher {

    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;

    public steps_language_switcher(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        languageSwitcher = new LanguageSwitcher(sharedDriver);

    }

    @Then("^want to change language$")
    public void want_to_change_language() {
        languageSwitcher.ChangeLang();

    }

    @Then("^i change the language to \"([^\"]*)\"$")
    @And("^i change the language to english$")
    public void iChangeTheLanguageToEnglish() {
        languageSwitcher.ChangeLang();
    }

    @And("^change language successfully$")
    public void changeLanguageSuccessfully() {
        Assert.assertTrue(languageSwitcher.isEN());
    }

    @Then("^i change to english language successfully$")
    public void i_select_english_language() {
        languageSwitcher.iChangeToEnglishLanguageSuccessfully();
    }

    @And("^i press to change language in dashboard$")
    public void iChangeLanguageDashboard() {
        languageSwitcher.changeLanguageDashboard();
    }


}
