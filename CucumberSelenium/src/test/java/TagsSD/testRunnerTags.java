package TagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(	
				features = "src/test/resources/TagsFF/TagsFeature.feature"
,glue= {"TagsSD"},
monochrome=true,
//dryRun=false,
//tags= {"@Smoke, @Regression"},
//tags= {"@Smoke","@Regression"},
//tags= {"@Regression"},

tags= {"@Smoke"},

plugin= {"pretty",
		"html:target/cucumber-tmlreport",
		"json:target/cucumber-report8.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
		
				
				}
)

public class testRunnerTags extends AbstractTestNGCucumberTests {

}
