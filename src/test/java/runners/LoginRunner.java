package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "classpath:features",//path of feature file
		glue="steps",  //the path of step definition file
		tags="@Scenario1",
		monochrome=true, //display the console output in proper readable format
		dryRun=false, // to check the mapping is proper between feature file and step definition file
		//strict = true, //it will check if any step is not defined in step definition file
		plugin= {
		"pretty",
		"html:target/cucumber",
		"json:target/cucumber.json"
		}
		
		)


public class LoginRunner {
	
	}
