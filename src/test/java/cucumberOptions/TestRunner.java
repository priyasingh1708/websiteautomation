package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/featuresFile",
        //tags={"@Emailerror"},
        glue="stepdefinations",
        monochrome = true,
        plugin = {"pretty",
       "html:test-output" }
)

public class TestRunner {
	 
}
