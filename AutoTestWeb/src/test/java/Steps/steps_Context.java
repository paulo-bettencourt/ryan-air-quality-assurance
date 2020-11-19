package Steps;

import Actions.SelectContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_Context {

        SharedDriver sharedDriver;
        WebDriver driver;
        SelectContext selectContext;

        public steps_Context(SharedDriver sharedDriver) {
                this.sharedDriver = sharedDriver;
                PageFactory.initElements(driver, this);
                driver = sharedDriver.getDriver();
                selectContext = new SelectContext(sharedDriver);
        }

        @And("i confirm i am in select context page$")
        public void i_am_in_select_context_page() {
                selectContext.iAmInSelectContextPage();
        }
        
        @Then("i select the context \"([^\"]*)\"$")
        public void i_select_context(String serviceAgreement) {
                selectContext.iSelectContext(serviceAgreement);
        }
        @And("^i want to change context$")
        public void i_want_to_change_context() {
                selectContext.selectContextDropdown();
        }
        @And("^i change context successfully \"([^\"]*)\"$")
        public void i_change_context_successfully(String contextUser) {
                selectContext.verifySelectedContext(contextUser);
        }



}
