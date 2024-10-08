package JUnitRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
		glue = {"stepDefinations" },
		plugin = {"json:target/jsonReports/cucumber.json"}
		,tags = {"@tag11"}
		)

public class junitChromeRunner {

}
