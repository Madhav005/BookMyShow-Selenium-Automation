package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver = Hooks.driver;
	
	@Given("the user is on login page of Sauce Demo")
	public void the_user_is_on_login_page_of_sauce_demo() {
		
		String actResult = driver.getCurrentUrl();
		Assert.assertEquals(actResult, "https://www.saucedemo.com/");
	}

	@When("the user enters username and password and click login button")
	public void the_user_enters_username_and_password_and_click_login_button() {
		//System.out.println("user logged in");
	}

	@Then("validates the text {string} in the home page")
	public void validates_the_text_in_the_home_page(String string) {
		String validateText = driver.findElement(By.className("title")).getText();
		Assert.assertEquals(validateText, "Products");
	}
}
