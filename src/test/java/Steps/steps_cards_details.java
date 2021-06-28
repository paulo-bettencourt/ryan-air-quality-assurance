package Steps;

import Actions.Cards;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_cards_details {
    SharedDriver sharedDriver;
    Cards cards;

    public steps_cards_details(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        cards = new Cards(sharedDriver);
    }

    @Then("^i click on cards on the nav bar$")
    public void iClickOnCardsOnTheNavBar() {
        cards.ClickCardsMenu();
    }

    @And("^i can see the card details$")
    public void iCanSeeTheCardDetails() {
        cards.SeeCardDetails();
    }
}
