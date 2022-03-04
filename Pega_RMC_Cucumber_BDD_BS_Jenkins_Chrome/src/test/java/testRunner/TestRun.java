package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = ".//Features/Campaign.feature",
		glue = "stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {
                "pretty",
                "html:results/html",
                "json:results/json/result.json",
                "junit:results/junit/cucumber.xml"
        }
		)
public class TestRun {

}
