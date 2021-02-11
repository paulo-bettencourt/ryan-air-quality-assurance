package Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed_scenarios.txt",
        monochrome = true,
        glue = {"Steps", "Steps/business"},
        plugin = {
                "html:target1/cucumber-html-report",
                "json:target1/cucumber.json",
                "rerun:target1/failed_scenarios.txt"
        })
public class TestRunnerRerun {
}
