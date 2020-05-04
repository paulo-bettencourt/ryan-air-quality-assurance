package Steps;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import javax.management.ObjectName;
import java.io.File;
import java.io.FileReader;


@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        monochrome = true,
        glue = {"Steps"},
        plugin = {"json:target/cucumber.json"},
        tags = {"@testAll"}
)


public class TestRunner {

}
