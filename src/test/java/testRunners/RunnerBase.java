package testRunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"
        , "html:target/Reports/cucumber"
        , "summary"
        , "me.jvt.cucumber.report.PrettyReports:target/Reports/cucumber-reports"}
        ,features = "src/test/resources/features/Ecard.feature"
        ,glue = "steps"
        ,tags = "@ecard"
        ,monochrome = true)
public class RunnerBase extends CutomizeTestNGCucmberRunner  {
}
