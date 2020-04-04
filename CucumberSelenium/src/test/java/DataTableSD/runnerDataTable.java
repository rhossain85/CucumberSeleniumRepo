package DataTableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/DataTableFF/DataTableFeature.feature"
,glue= {"DataTableSD"},
monochrome=true,
dryRun=false,
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report3.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
		
				
				}
)

public class runnerDataTable extends AbstractTestNGCucumberTests {

}
