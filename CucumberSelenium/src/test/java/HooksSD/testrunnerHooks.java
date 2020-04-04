package HooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/HooksFF/HooksFeature.feature"
,glue= {"HooksSD"},
monochrome=true,
//dryRun=false,
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report4.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
		
				
				}
)

public class testrunnerHooks extends AbstractTestNGCucumberTests {

}
