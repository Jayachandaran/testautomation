package com.demo.bdd.test;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"com.demo.bdd.stepdefinitions"}
		,format = {"pretty" ,"html:report" ,
                "json:report/cucumber.json" ,
                "junit:report/cucumber.xml"}
		)
public class TestRunner {

}