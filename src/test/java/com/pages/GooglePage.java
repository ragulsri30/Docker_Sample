package com.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class GooglePage extends PageObject {


	@Step
	public void enter_the_search_value_in_search_box() throws InterruptedException {

		Thread.sleep(2000);
		$(By.id("APjFqb")).typeAndEnter("Laptop");
	}

}
