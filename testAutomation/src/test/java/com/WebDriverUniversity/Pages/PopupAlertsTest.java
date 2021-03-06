package com.WebDriverUniversity.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PopupAlertsTest extends FunctionalTest {
	@Given("^user opens Pop\\-up alerts page$")
	public void user_opens_popup_alerts_page() throws Throwable {
		driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
		PopupAlerts popupAlerts = new PopupAlerts(driver);
		popupAlerts.popupAlertsOne();
	}

	@When("^user clicks Click Me! button$")
	public void user_clicks_click_me_button() throws Throwable {
	        
	}

	@Then("^user clicks Ok on popup$")
	public void user_clicks_ok_on_popup() throws Throwable {
	        
	}
}
