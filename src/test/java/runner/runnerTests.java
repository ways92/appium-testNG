package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"tests"},
        plugin = {"html:test_output/HTML_report/HtmlReports.html"}
)



public class runnerTests extends AbstractTestNGCucumberTests {

}
