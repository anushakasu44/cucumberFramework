package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue="com.cucumberFrameworkStepDefinations",
tags="@CS",

//monochrome=true,
plugin= {"pretty","html:target/myreport"})


public class Runner {

}
