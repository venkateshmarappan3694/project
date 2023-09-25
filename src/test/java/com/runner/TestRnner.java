package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Workspace\\JavaSelenim\\Cucumber\\src\\test\\resources\\Feature",
		glue="com.stepDefination",plugin = {"pretty","html:target/cucumber-reports.html"},
		dryRun=!true)

public class TestRnner {

}
