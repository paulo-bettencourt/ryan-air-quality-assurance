package Steps;

import Actions.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_login {

    WebDriver driver;
    Login login;
    SharedDriver sharedDriver;

    public steps_login(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        PageFactory.initElements(driver, this);
        login = new Login(driver, sharedDriver);
    }

    @Given("^i am in the index page$")
    public void i_am_in_index_page() throws Throwable {
        login.openBrowser();
    }

    @Then("^i want to travel from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void i_want_to_travel_from_to(String fromTrip, String toTrip) throws InterruptedException {
        login.fillIn(fromTrip, toTrip);
    }

    @And("^i want to select the trips$")
    public void i_wanto_to_select_the_trips() {
        login.selectTheTrips();
    }

    @And("^i want to continue with the value price$")
    public void i_want_to_continue_with_value_price() {
        login.valuePrice();
    }

    @Then("^i want to login later$")
    public void iWantToLoginLater() {
        login.loginLater();
    }

    @And("^i want to write down the pax names")
    public void i_want_to_write_down_the_pax_names() {
        login.paxNames();
    }

    @Then("^i want to take a small luggage$")
    public void i_want_to_take_a_small_luggage() {
        login.smallLugage();
    }

    @Then("^i dont want to take any more luggage$")
    public void i_dont_want_to_take_any_more_luggages() {
        login.noMoreLuggage();
    }

    @And("^i want to select seats later$")
    public void i_want_to_select_seats_later() {
        login.selectSeatsLater();
    }

    @And("^i am sure that everything is ok with my trip$")
    public void everything_is_ok() {
        login.everythingOk();
    }

}