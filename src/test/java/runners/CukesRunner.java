package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber",
				//"pretty",
				"json:target/cucumber.json"},
		features="src/test/resources/features",
		glue= {"com.nwbank.step_definitions"}, 
		tags= "@main"
//	    ,dryRun=true
		)
public class CukesRunner {

}
