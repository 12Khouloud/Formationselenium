package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith ( Cucumber.class)
@CucumberOptions (
		tags="",
		features="src/testassurance/features/cucumbertestassurance/demoassurance.feature",
		glue="Test.Assuranceauto",
		publish=true,
		plugin= {
				"pretty","html:target/rapport2.html","json:target/rapport2json.json" }
		)

public class runnerass {

}

		
		
		
		
		