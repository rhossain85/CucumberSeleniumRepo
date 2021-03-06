package MultiScenerioGluecode;

import org.junit.runner.RunWith;
#comment

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/multipleFeatures/MyltipleSenerio.feature"
,glue= {"MultiScenerioGluecode"},
monochrome=true,
dryRun=false,
plugin= {"pretty",
		"html:target/cucumber-htmlreport",		
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
	
		
				
				}
)

public class runnerMultiScenario extends AbstractTestNGCucumberTests {

}
