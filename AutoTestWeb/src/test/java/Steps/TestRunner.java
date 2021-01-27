package Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        monochrome = true,
        glue = {"Steps", "Steps/business"},
        plugin = {"json:target/cucumber.json"},
        tags = {"@testAll"}
)

public class TestRunner {

}
