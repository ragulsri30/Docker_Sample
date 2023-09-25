package com.steps;

import org.openqa.selenium.WebDriver;

import com.pages.GooglePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Google_Steps {

	@Managed
	WebDriver driver;
	
	@Steps
	GooglePage g;
	
	@Given("Open the Google website")
	public void open_the_google_website() {
	   
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	}
	@When("Enter the search value in search box")
	public void enter_the_search_value_in_search_box() throws InterruptedException {
	   
		g.enter_the_search_value_in_search_box();
		
	}

	
}
