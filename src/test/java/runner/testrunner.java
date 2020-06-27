package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json"},
		features = {"features/"}, //the path of the feature files
		glue={"com.infrastructure.steps"}, //the path of the step definition files
		monochrome = true, //display the console output in a proper readable format
		strict = true,//it will check if any step is not defined in step definition file
		tags = {"@smoketest"}			
		)
 
public class testrunner {

}
