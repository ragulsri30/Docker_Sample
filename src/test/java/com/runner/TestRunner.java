package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(features = "src/test/resources/Feature",glue= {"com/steps"},tags = "")

public class TestRunner {

}
