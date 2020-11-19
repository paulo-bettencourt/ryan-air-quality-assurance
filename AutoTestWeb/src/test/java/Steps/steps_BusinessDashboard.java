package Steps;

import Actions.Business_Dashboard;
import Actions.SelectContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class steps_BusinessDashboard {

    SharedDriver sharedDriver;
    WebDriver driver;
    Business_Dashboard dashboard;

    public steps_BusinessDashboard(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
        driver = sharedDriver.getDriver();
        dashboard = new Business_Dashboard(sharedDriver);
    }

    @And("^i am on the business dashboard$")
    public void i_am_in_business_dashboard() {
        dashboard.iAmInBusinessDashboard();
    }

    @And("^i confirm i am on the business dashboard in portuguese$")
    public void i_am_in_business_dashboard_pt() {
        dashboard.iAmInBusinessDashboardPortuguese();
    }

}
