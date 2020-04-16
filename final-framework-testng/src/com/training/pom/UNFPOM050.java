package com.training.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UNFPOM050 {
private WebDriver driver; 

	
	public UNFPOM050(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='customer']/ul/li[1]/a")
	private WebElement customerClick;
		
	@FindBy(xpath="//*[@id='form-customer']/div/table/tbody/tr[3]/td[8]/a")
	private WebElement EditCustomer;

	@FindBy(xpath="//*[@id='input-firstname']")
	private WebElement inputFirstName;


	@FindBy(id="address_add")
	private WebElement addressAdd; 
	
	/*@FindBy(id="input_postcode1")
	private WebElement inputPostCode1; */

	@FindBy(xpath="//*[@id='form-customer']/ul/li[4]/a")
	private WebElement RewardPoints;
	
	@FindBy(xpath="//*[@id='address']/li[1]/a")
	private WebElement GeneralClick;
	
	@FindBy(xpath="	//*[@id='address']/li[2]/a")
	private WebElement ClickAddress1;

	@FindBy(xpath="//*[@id='input-postcode1']")
	private WebElement inputPostCode1;
	
	//*[@id="input-postcode1"]
	
	@FindBy(id="input-reward-description")
	private WebElement inputRewardDescription; 

	@FindBy(id="input-points")
	private WebElement inputRewardPoints; 

	@FindBy(id="button-reward")
	private WebElement AddbuttonReward; 

	@FindBy(css=".btn-primary")
	private WebElement SaveButton;
	
	
	//LOGIN Screen
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
				
				public void EditCustomer() {
					this.EditCustomer.click(); 
				}

				public void GeneralClick() {
					this.GeneralClick.click(); 
				}
				
				public void inputFirstName() {

					this.inputFirstName.clear();
					this.inputFirstName.sendKeys("chitra");
					this.inputFirstName.sendKeys(Keys.ENTER);
				}
				
				
				public void ClickAddress1() {
					this.ClickAddress1.click(); 
				}

				public void inputPostCode1() {
					this.inputPostCode1.clear(); 
					this.inputPostCode1.sendKeys("560097");
					this.inputPostCode1.sendKeys(Keys.ENTER);
				}


				public void RewardPoints() {
					this.RewardPoints.click(); 
				}


				public void inputRewardPoints() {
					this.inputRewardPoints.click();
					this.inputRewardPoints.clear();
					this.inputRewardPoints.sendKeys("20");
				}

				public void inputRewardDescription() {
					this.inputRewardDescription.click();
					this.inputRewardDescription.clear();
					this.inputRewardDescription.sendKeys("bonus");
				}

				public void AddbuttonReward() {
					this.AddbuttonReward.click(); 
				}
				
				public void SaveButton(){
					this.SaveButton.click(); 
					
				}
				
				
				
			public boolean UNF_050(){
					try {
						
						customer();
						Thread.sleep(3000);
						customerClick();
						Thread.sleep(1000);
						EditCustomer();
				//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//		Thread.sleep(1000);
				//		GeneralClick();
						inputFirstName();
						Thread.sleep(2000);
						EditCustomer();
						Thread.sleep(1000);
						ClickAddress1();
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,1000)");
		//				js.executeScript("arguments[0].scrollIntoView();", inputPostCode1);
						Thread.sleep(1000);
						inputPostCode1();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						Thread.sleep(3000);
						RewardPoints();
						Thread.sleep(1000);
						inputRewardDescription();
						Thread.sleep(1000);
						inputRewardPoints();
						Thread.sleep(1000);
						AddbuttonReward();
						Thread.sleep(1000);
						SaveButton();
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
