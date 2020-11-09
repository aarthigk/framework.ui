package com.infrastructure.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
    WebDriver driver;

    public SigninPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        @FindBy(id="passwd")
        public WebElement password;
        
        @FindBy(id="email")
        public WebElement email;
                
        @FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
        public WebElement signin ;
        
        public void enter_emailpasswd()
        {
        	email.sendKeys("cse.snippet@gmail.com");
        	password.sendKeys("Password");
        }
        
        public void click_Signon()
        {
        	signin.click();
        }
    

}
