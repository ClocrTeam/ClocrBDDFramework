package testRunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
        , "json:target/cucumber-reports/Cucumber.json"
        , "summary"
        , "me.jvt.cucumber.report.PrettyReports:target/cucumber-reports"}
        ,features = "src/test/resources/features/"
        ,glue = "steps")

public class RunnerBase extends CutomizeTestNGCucmberRunner {
}
