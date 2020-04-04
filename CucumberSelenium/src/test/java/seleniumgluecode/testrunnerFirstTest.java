package seleniumgluecode;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/features/myFirstFeature.feature"
,glue= {"seleniumgluecode"},
monochrome=true,
dryRun=false,
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report7.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
	
		
				
				}
)

public class testrunnerFirstTest extends AbstractTestNGCucumberTests {

}
