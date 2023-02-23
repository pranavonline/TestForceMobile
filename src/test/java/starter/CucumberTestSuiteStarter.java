package starter;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {
        		"pretty",
        		"json:target/serenity-reports/SerenityTestReport.json",
        		"html:target/serenity-reports/SerenityHtmlReport.htm"
        },
        features = "src/test/resources/features",
        monochrome = true,
        tags = "@poc",
        glue = {"stepdefinitions"}
)

public class CucumberTestSuiteStarter {

}
