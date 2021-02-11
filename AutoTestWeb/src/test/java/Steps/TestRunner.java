package Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        monochrome = true,
        glue = {"Steps", "Steps/business"},
        tags = {"@testAll"},
        plugin = {
        "json:target/cucumber.json", "rerun:target/failed_scenarios.txt"}
)

public class TestRunner {

}
