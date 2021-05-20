package Steps;

import Actions.CredijaReview;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_credija_review {

    SharedDriver sharedDriver;
    CredijaReview credijaReview;

    public steps_credija_review(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        credijaReview = new CredijaReview(sharedDriver);
    }

    @Then("^i click on the credijá banner$")
    public void iClickOnTheCredijáBanner() {
        credijaReview.ClickCredijaBanner();
    }


    @Then("^i click on the next button$")
    public void iClickOnTheNextButton() {
        credijaReview.ClickNextBtn();
    }

    @And("^i am on the credija review page$")
    public void iAmOnTheCredijaReviewPage() {
        credijaReview.ReviewPage();
    }

    @Then("^i click on the request button$")
    public void iClickOnTheRequestButton() {
        credijaReview.ClickRequestBtn();
    }

    @Then("^i click on the Preview button$")
    public void iClickOnThePreviewButton() {
        credijaReview.ClickPreviewBtn();
    }

    @And("^i check the boxes$")
    public void iCheckTheBoxes() {
        credijaReview.CheckBoxes();
    }

    @Then("^The authorize button is enable$")
    public void theAuthorizeButtonIsEnable() {
        credijaReview.AuthorizeEnable();
    }

    @And("^Click on the cancel button$")
    public void clickOnTheCancelButton() {
        credijaReview.ClickCancelBtn();
    }
}
