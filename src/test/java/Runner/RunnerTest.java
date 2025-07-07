package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepsDefinition"},
        tags = "@addUser",
        plugin = {"pretty", "html:Reports/cucumber-reports.html", "json:target/cucumber.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
