package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class LoginDataTableStepDef {

	WebDriver driver= Hooks.driver;
	
	@When("user enters username as {string} and password as {string} and click login button")
	public void user_enters_username_as_and_password_as_and_click_login_button(String userName, String password) throws InterruptedException {
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
	}
	
	
}