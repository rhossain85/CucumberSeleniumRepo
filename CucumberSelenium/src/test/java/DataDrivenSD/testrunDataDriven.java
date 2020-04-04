package DataDrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/DataDrivenFF/DataDrivenFeature.feature"
,glue= {"DataDrivenSD"},
monochrome=true,
dryRun=false,
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report2.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
		
				
				}
)

public class testrunDataDriven extends AbstractTestNGCucumberTests {

}
