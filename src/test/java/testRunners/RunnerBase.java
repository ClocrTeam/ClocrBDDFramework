package testRunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
        , "html:target/Reports/cucumber"
        , "summary"
        , "me.jvt.cucumber.report.PrettyReports:target/test-output/Cucumber-Reports"}
        ,features = "src/test/resources/features/"
        ,glue = "steps"
        ,monochrome = true)

public class RunnerBase extends CutomizeTestNGCucmberRunner  {
}
