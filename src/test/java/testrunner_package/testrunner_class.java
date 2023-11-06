package testrunner_package;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/joyafolder"},
plugin = {"json:target/cucumber.json"},
glue = "stepdepination_package",tags = {"@araab"})


public class testrunner_class extends AbstractTestNGCucumberTests  {

}
