package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UNFPOM049 {
private WebDriver driver; 

	
	public UNFPOM049(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement username; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='text-right']/button")
	private WebElement loginBtn; 
	
	//******************TestinLogIN POM*******************************
	@FindBy(id="sale")
	private WebElement sale; 
	
	@FindBy(linkText="Returns")
	private WebElement Returns;
	
	@FindBy(xpath="//*[@id='form-return']/div/table/tbody/tr[1]/td[1]/input")
	private WebElement checkbox;
	
	@FindBy(css=".btn-danger")
	private WebElement btn; 

	@FindBy(css=".btn-primary")
	private WebElement Addbtn; 
	
	@FindBy(id="input-order-id")
	private WebElement inputOrderId; 
	@FindBy(id="input-firstname")
	private WebElement inputFirstName; 
	@FindBy(id="input-lastname")
	private WebElement inputLastName; 
	@FindBy(id="input-email")
	private WebElement inputEmail; 
	@FindBy(id="input-telephone")
	private WebElement inputTelephone; 
	@FindBy(id="input-product")
	private WebElement inputProduct; 
	@FindBy(id="input-model")
	private WebElement inputModel; 
	@FindBy(xpath="//*[@id='form-return']/div/table/tbody/tr[1]/td[1]")
	private WebElement SelectForDel;
	
	
	//*************************Test End Here***********************************************
	
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
	//	public  void LoginUser(String UserID, String Password){
		try {
			sendUserName(UserID);
			sendPassword(Password);
			clickLoginBtn();
			//***************Changes done in Method********************
			
			//*****************Changes Ends Here**************************
			
			return true;
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
			return false;
		}
		
		
	}
	
	// Test in LogIn POM************************************

	
				public void ClickSale() {
					this.sale.click();
					
				}
				
				public void ClickReturns() {
					this.Returns.click(); 
					
				}
				
				public void ClickChkBox(){
					this.checkbox.click(); 
					
				}
				
				public void ClickButton(){
					this.Returns.click();  
					
				}
				
				public void ClickDelBtn() {
					this.btn.click();
					
				}
				
				public void Addbtn() {
					this.Addbtn.click();
					
				}
				
				public void inputOrderId() {
					this.inputOrderId.sendKeys("25");
					
				}
				public void inputFirstName() {
					this.inputFirstName.sendKeys("Renu");
					
				}
				public void inputLastName() {
					this.inputLastName.sendKeys("Mathur");
					
				}
				public void inputEmail() {
					this.inputEmail.sendKeys("Renu.Mathur@gmail.com");
					
				}
				public void inputTelephone() {
					this.inputTelephone.sendKeys("9453234554");
					
				}
				public void inputProduct() {
					this.inputProduct.sendKeys("Blazer Girls");
					
				}
				public void inputModel() {
					this.inputModel.sendKeys("BLG-112");
					
				}
				
				public void SelectForDel() {
					this.SelectForDel.click();
					
				}			
				
				
			public boolean AddCustomer(){
					try {
						
						ClickSale();
						Thread.sleep(1000);
						ClickReturns();
						Thread.sleep(1000);
						Addbtn();
						Thread.sleep(1000);
						inputOrderId();
						inputFirstName();
						inputLastName();
						inputEmail();
						inputTelephone();
						inputProduct();
						inputModel();
						Addbtn();
						Thread.sleep(3000);
						SelectForDel();
						Thread.sleep(3000);
						
						WebElement ele1 = driver.findElement(By.cssSelector(".btn-danger"));
						driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
						ele1.click();
						Alert alert_box = driver.switchTo().alert();
						alert_box.accept(); 
					/*	Thread.sleep(3000);
						ClickDelBtn();*/
						
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
