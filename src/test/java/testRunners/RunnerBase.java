package testRunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
        , "html:target/Reports/cucumber"
        , "summary"
        , "me.jvt.cucumber.report.PrettyReports:target/Cucumber-Reports"}
        ,features = "src/test/resources/features/Ecard.feature"
        ,glue = "src/test/java/steps"
        ,monochrome = true)

public class RunnerBase extends CutomizeTestNGCucmberRunner  {
}
