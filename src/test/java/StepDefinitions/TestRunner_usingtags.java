package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/FeaturewithTags",
        glue= {"StepDefinitions"},
        monochrome = true,
        //plug-in = {"pretty", "html:target/HtmlReports/test_report.html"}, // HTML report
        //plugin = {"pretty", "json:target/JSONReports/test_report.json"} // JSON report
        //plugin = {"pretty", "junit:target/XMLReports/test_report.xml"} // junit xml report
        plugin = {"pretty",
                "html:target/HtmlReports/test_report.html",
                "json:target/cucumber.json", // needs to under target folder for maven-cucumber-reporting to work
                "junit:target/XMLReports/test_report.xml"
        },
        tags="@stability or @regression" // runs features with tag of stability or regression
//        ags="@stability and @regression" // runs features with tag of stability and regression
//        tags="@stability" // runs features with tag of stability
)
public class TestRunner_usingtags {
}
