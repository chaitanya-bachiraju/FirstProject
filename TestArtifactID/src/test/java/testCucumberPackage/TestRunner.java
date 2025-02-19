package testCucumberPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/testCucumberPackage",
			glue = "testCucumberPackage",
			// tags = "@TestCaseNo:1 or @TestCaseNo:2 or @TestCaseNo:3"
			tags ="@Regression",
			plugin = { "pretty", "html:target/CucumberReport.html"}
			)
	
	public class TestRunner {
	}
	

