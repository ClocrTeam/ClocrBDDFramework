package testRunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
        , "html:target/Reports/cucumber"
        , "summary"
        , "me.jvt.cucumber.report.PrettyReports:target/cucumber-reports"}
        ,features = "src/test/resources/features/"
        ,glue = "src/test/java/steps"
        ,monochrome = true)

public class RunnerBase extends CutomizeTestNGCucmberRunner  {
}
