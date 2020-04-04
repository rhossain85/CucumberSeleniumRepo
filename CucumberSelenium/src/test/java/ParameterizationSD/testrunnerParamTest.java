package ParameterizationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/ParameterizationFF/ParameterizationFF.feature"
,glue= {"ParameterizationSD"},
monochrome=true,
dryRun=false,
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report6.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
				
				}
)

public class testrunnerParamTest extends AbstractTestNGCucumberTests {


}
