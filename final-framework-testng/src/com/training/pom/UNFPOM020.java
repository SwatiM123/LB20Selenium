package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UNFPOM020 {
private WebDriver driver; 

	
	public UNFPOM020(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement username; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='text-right']/button")
	private WebElement loginBtn; 
	
	

//POM020	
	@FindBy(id="customer")
	private WebElement customer; 
	
	@FindBy(xpath="//*[@id='customer']/a/i")
	private WebElement customerClick;
	
	@FindBy(id="input-name")
	private WebElement inputName; 
	
	@FindBy(id="button-filter")
	private WebElement buttonFilter; 

	@FindBy(id="input-email")
	private WebElement inputEmail; 

	
	
	public void sendUserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public boolean LoginUser(String UserID, String Password){
	
		try {
			sendUserName(UserID);
			sendPassword(Password);
			clickLoginBtn();

			
			return true;
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
			return false;
		}
		
		
	}
	
	// Test in LogIn POM************************************

	
				public void customer() {
					this.customer.click();
					
				}
				
				public void customerClick() {
					this.customerClick.click(); 
					
				}
				
				public void inputName(){
					this.inputName.sendKeys("Neha"); 
					
				}
				
				public void buttonFilter(){
					this.buttonFilter.click();  
					
				}
				
				public void inputEmail() {
					this.inputEmail.sendKeys("Neha@ab.com");
					
				}
				
			public boolean CustomerIcon(){
					try {
						
						customer();
						Thread.sleep(3000);
						customerClick();
						Thread.sleep(3000);
						inputName();
						Thread.sleep(3000);
						buttonFilter();
						Thread.sleep(3000);
						inputEmail();
						Thread.sleep(1000);
						buttonFilter();
						return true;
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						System.out.println(ex.getMessage());
						return false;
					} 
					
				} 
	
	public WebDriver getDriver()
	{
		return driver;
	}
}
