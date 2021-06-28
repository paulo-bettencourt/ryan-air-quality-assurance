package Steps;


import Actions.FindBranches;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_find_branches {
    SharedDriver sharedDriver;
    FindBranches findBranches;

    public steps_find_branches(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        findBranches = new FindBranches(sharedDriver);

    }

    @Then("^want to find nearest branches$")
    public void want_to_find_nearest_branches() {
        findBranches.ClickFindBranches();
    }

    @And("^found branches successfully$")
    public void foundBranchesSuccessfully() {
        findBranches.OnFindBranchesPage();
    }

}
