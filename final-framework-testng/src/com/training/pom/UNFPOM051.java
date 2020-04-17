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


public class UNFPOM051 {
private WebDriver driver; 

	
	public UNFPOM051(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='customer']/ul/li[2]")
	private WebElement customerGroupsClick;
		
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement AddCustomerGroup;

	@FindBy(xpath="//*[@id='form-customer-group']/div[1]/div/div/input")
	private WebElement CustomerGroupName;


/*	@FindBy(id="address_add")
	private WebElement addressAdd; */
	
	/*@FindBy(id="input_postcode1")
	private WebElement inputPostCode1; */

	@FindBy(xpath="//*[@id='input-description1']")
	private WebElement CustomerGroupDescription;
	
	@FindBy(xpath="//*[@id='form-customer-group']/div[3]/div/label[1]/input")
	private WebElement ApproveNewCustomer;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveCustomerGroup;
	
//Add New Customer Details
	@FindBy(xpath="//*[@id='customer']/a/i")
	private WebElement customerAddClick;	
	
	@FindBy(xpath="//*[@id='customer']/ul/li[1]/a")
	private WebElement customerClick;	
	
	/*@FindBy(xpath="//*[@id='input-customer-group']")
	private WebElement customerClick;	*/
	
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement AddNewCustomer;	
	
	@FindBy(xpath="//*[@id='input-customer-group']")
	private WebElement CustomerGroupList;	
	
	
	@FindBy(xpath="//*[@id='input-firstname']")
	private WebElement InsertCustomerFirstName;	
	
	@FindBy(xpath="//*[@id='input-lastname']")
	private WebElement InsertCustomerLastName;	
	
	@FindBy(xpath="//*[@id='input-email']")
	private WebElement InsertCustomerEmail;	

	@FindBy(xpath="//*[@id='input-telephone']")
	private WebElement InsertCustomerTelephone;	
	
	@FindBy(xpath="//*[@id='input-password']")
	private WebElement InsertPassword;	
	
	@FindBy(xpath="//*[@id='input-confirm']")
	private WebElement InsertConfirmPassword;	

//add address details
	@FindBy(xpath="//*[@id='address']/li[2]/a")
	private WebElement AddAddress1;	
	
	@FindBy(xpath="//*[@id='input-firstname1']")
	private WebElement AddAddressFirstName;	
	
	@FindBy(xpath="//*[@id='input-lastname1']")
	private WebElement AddAddressLastName;	
	
	@FindBy(xpath="//*[@id='input-address-11']")
	private WebElement AddAddress11;	
	
	@FindBy(xpath="//*[@id='input-address-21']")
	private WebElement AddAddress12;	
	
	@FindBy(xpath="//*[@id='input-city1']")
	private WebElement CityName;	
	
	@FindBy(xpath="//*[@id='input-postcode1']")
	private WebElement PostCode;	
	
	@FindBy(xpath="//*[@id='input-country1']")
	private WebElement CountryCode;	
	
	@FindBy(xpath="	//*[@id='input-zone1']")
	private WebElement StateCode;	
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveAddress;	
	
	

	
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
				
				public void customerGroupsClick() {
					this.customerGroupsClick.click(); 
					
				}
				
				public void AddCustomerGroup() {
					this.AddCustomerGroup.click(); 
				}

	/*			public void GeneralClick() {
					this.GeneralClick.click(); 
				}*/
				
				public void CustomerGroupName() {

					this.CustomerGroupName.clear();
					this.CustomerGroupName.sendKeys("Premium Member");
				//	this.CustomerGroupName.sendKeys(Keys.ENTER);
				}
				
				public void CustomerGroupDescription() {

					this.CustomerGroupDescription.clear();
					this.CustomerGroupDescription.sendKeys("Premium Member");
			//		this.CustomerGroupDescription.sendKeys(Keys.ENTER);
				}
				
				
				public void ApproveNewCustomer() {
					this.ApproveNewCustomer.click(); 
				}
				
				public void SaveCustomerGroup() {
					this.SaveCustomerGroup.click(); 
				}

//Add Customer Details
				
				
				public void customerAddClick() {
					this.customerAddClick.click(); 
					
				}
				public void customerClick() {
					this.customerClick.click(); 
					
				}

				public void AddNewCustomer() {
					this.AddNewCustomer.click(); 
					
				}
				
				public void CustomerGroupList() {

					//this.CustomerGroupList.clear();
					this.CustomerGroupList.sendKeys("Premium Member");
					this.CustomerGroupList.click();
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}

				public void InsertCustomerFirstName() {

					this.InsertCustomerFirstName.clear();
					this.InsertCustomerFirstName.sendKeys("Reena");
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}		
				
				public void InsertCustomerLastName() {

					this.InsertCustomerLastName.clear();
					this.InsertCustomerLastName.sendKeys("Sharma");
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}		
				
				public void InsertCustomerEmail() {

					this.InsertCustomerEmail.clear();
					this.InsertCustomerEmail.sendKeys("reenasharma@gmail.com");
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}		
				
				public void InsertCustomerTelephone() {

					this.InsertCustomerTelephone.clear();
					this.InsertCustomerTelephone.sendKeys("9765433214");
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}		
				
				public void InsertPassword() {

					this.InsertPassword.clear();
					this.InsertPassword.sendKeys("reenas123");
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}		
				
				public void InsertConfirmPassword() {

					this.InsertConfirmPassword.clear();
					this.InsertConfirmPassword.sendKeys("reenas123");
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}		
				
//Add address Details
				public void AddAddress1() {

					this.AddAddress1.click();
				}		
				
				public void AddAddressFirstName() {

					this.AddAddressFirstName.clear();
					this.AddAddressFirstName.sendKeys("Reena");
					//this.CustomerGroupList.sendKeys(Keys.ENTER);
				}						
				
				public void AddAddressLastName() {

					this.AddAddressLastName.clear();
					this.AddAddressLastName.sendKeys("Sharma");
				}						
				
				public void AddAddress11() {

					this.AddAddress11.clear();
					this.AddAddress11.sendKeys("4th Block");
				}						
				
				public void AddAddress12() {

					this.AddAddress12.clear();
					this.AddAddress12.sendKeys("Jayanagar");
				}					

				public void CityName() {

					this.CityName.clear();
					this.CityName.sendKeys("bangalore");
				}					

				public void PostCode() {

					this.PostCode.clear();
					this.PostCode.sendKeys("560014");
				}			
				
				public void CountryCode() {

					//this.CountryCode.clear();
					this.CountryCode.sendKeys("India");
				}	
				
				public void StateCode() {

					//this.StateCode.clear();
					this.StateCode.sendKeys("Karnataka");
				}	
				
				public void SaveAddress() {

					this.SaveAddress.click();
				}		
				
				
			public boolean UNF_051(){
					try {
						JavascriptExecutor js = (JavascriptExecutor) driver;
						customer();
						Thread.sleep(3000);
						customerGroupsClick();
						Thread.sleep(1000);
						AddCustomerGroup();
						Thread.sleep(1000);
						CustomerGroupName();
						Thread.sleep(1000);
						CustomerGroupDescription();
						Thread.sleep(1000);
						ApproveNewCustomer();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						SaveCustomerGroup();
//add new customer
						Thread.sleep(3000);
						customerAddClick();
						Thread.sleep(1000);
						customerClick();
						Thread.sleep(1000);
						AddNewCustomer();
						Thread.sleep(1000);
						CustomerGroupList();
						Thread.sleep(1000);
						InsertCustomerFirstName();
						Thread.sleep(1000);
						InsertCustomerLastName();
						Thread.sleep(1000);
						InsertCustomerEmail();
						Thread.sleep(1000);
						InsertCustomerTelephone();
						Thread.sleep(1000);
						InsertPassword();
						Thread.sleep(1000);
						InsertConfirmPassword();
						js.executeScript("window.scrollBy(0,-1000)");
						Thread.sleep(1000);
						
//Add address details
						AddAddress1();
						AddAddressFirstName();
						AddAddressLastName();
						AddAddress11();
						AddAddress12();
						CityName();
						PostCode();
						CountryCode();
						Thread.sleep(1000);
						StateCode();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						SaveAddress();
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
