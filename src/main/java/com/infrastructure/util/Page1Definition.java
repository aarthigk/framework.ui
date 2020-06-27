//package com.infrastructure.steps;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Page1Definition {
//	
//	WebDriver driver;
//	
//	@Given("^user is  on homepage$")
//	public void user_is_on_homepage() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver", "C:/Users/AarthiGk/Downloads/chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.get("http://automationpractice.com/index.php");
//	}
//
//	
//	@When("^user navigates to Login Page$")
//	public void user_navigates_to_Login_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.linkText("Sign in")).click();
//	}
//
//	@When("^user enters username and Password$")
//	public void user_enters_username_and_Password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
//        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
//        driver.findElement(By.id("SubmitLogin")).click(); 
//	}
//
//	@Then("^success message is displayed$")
//	public void success_message_is_displayed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		String exp_message = "There is 1 error";
//    	String actual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p")).getText();
//        Assert.assertEquals(exp_message, actual);
//        driver.quit();
//	}
//
//
//}
