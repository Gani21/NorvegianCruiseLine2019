package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        plugin = {
//                "json:target/cucumber.json",
//                "html:target/default-cucumber-reports",
//                "rerun:target/rerun.txt"
//        },

       features = "src/test/resources/features/destination.feature"




        //dryRun = true
)
public class CukesRunner {

}
