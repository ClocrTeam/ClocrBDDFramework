package testRunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
        , "html:target/Reports/cucumber"
        , "summary"
        , "me.jvt.cucumber.report.PrettyReports:target/Reports/cucumber-reports"}
        ,features = "src/test/resources/features/Digitalestate.feature"
        ,glue = "steps"
        ,tags = "@digitalestate"
        ,monochrome = true)
public class RunnerBase extends CutomizeTestNGCucmberRunner  {
}
