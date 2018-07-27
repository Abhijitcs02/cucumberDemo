package CucumberTest.CucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles"
		,glue={"stepDefinition",}
		,tags = {"@SmokeTest"}
		)
 
public class TestRunner {
 
}

