package BackgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/BackgroundFF/BackgroundFeature.feature"
,glue= {"BackgroundSD"},
monochrome=true,
dryRun=false,
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report1.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		
				
				}
)

public class testrunBackgroundTest extends AbstractTestNGCucumberTests {

}
