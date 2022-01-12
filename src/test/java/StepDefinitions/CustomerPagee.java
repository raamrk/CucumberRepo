package StepDefinitions;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import Utility.Constants;
//import Utility.ExcelUtils;

public class CustomerPagee  {

	//private static final String RandomStringUtils = null;

	WebDriver driver;
	
	public CustomerPagee(WebDriver rdriver) {

		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// LoginPage - Identification
	// Method1
//  By txtEmail = By.id("Email");
//  By txtPass = By.name("Password");
//  By btnLogin = By.tagName("button");
//  By btnLogout = By.xpath("//a[contains(@href,'logout')]");

	// Method2 - PageFactory

	@FindBy(xpath = "//p[text()[normalize-space()='Customers']]")
	WebElement Customersicon;

	// Migrating from tool to another tool
//  @IdentifyBy(id = "Email")
//  IWebElement txt_Email;

	// Method3
	@FindBy(how = How.XPATH, using = "//p[text()=' Customers']")
	WebElement Customers;

	// Ruto- utility

	// @FindBy(how = How.TAG_NAME, using = "button")
	// private WebElement btnLogIn;

	@FindBy(xpath = "//h1[text()='Add a new customer']")
	WebElement AddNewTitle;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement AddNew;

	@FindBy(id = "FirstName")
	WebElement firstname;

	@FindBy(id = "LastName")
	WebElement lastname;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(id = "Gender_Male")
	WebElement gender;

	@FindBy(id = "userNumber")
	WebElement mobile;

	@FindBy(xpath = "//button[text()[normalize-space()='Save']]")
	WebElement submitBtn;

	@FindBy(id = "AdminComment")
	WebElement admincomment;
	
	@FindBy(xpath = "//button[@data-dismiss='alert']")
	WebElement closebtn;

	public void ClickCustomericon() {

		Customersicon.click();
		Customers.click();
	}
//public static String randomestrings(){
//		String genstr = RandomStringUtils.
//		return (genstr);
//	}
////		String generatedString2 = RandomStringUtils.randomAlphabetic(5);
////		return (generatedString2);
//		String genstr = Rand
//		}
//public static String randomestring(){
//String genStr = RandomStringUtils.randomAlphabetic(5);
//return (generatedString1);
//}
	
	
	
	public void CustomerTestData() throws InterruptedException, IOException {
		//excelUtils.setExcelFile(excelFilePath,"test");
		//for (int i = 1; i <= excelUtils.getRowCountInSheet(); i++) {
			// Enter the values read from Excel in firstname,lastname,mobile,email,address
			AddNew.click();
			Thread.sleep(4000);
			firstname.clear();
			firstname.sendKeys("RKJ");
			Thread.sleep(4000);
			lastname.clear();
			lastname.sendKeys("HGJ");
			Thread.sleep(4000);
			email.clear();
			String emails = randomestring() + "@gmail.com";
			email.sendKeys(emails);
			Password.clear();
			Password.sendKeys("PWD");
			//admincomment.clear();
			//admincomment.sendKeys(excelUtils.getCellData(i, 4));

			//String gen = excelUtils.getCellData(i, 3);
			//System.out.println("//label[text()[normalize-space()='"+gen+"']]");
			//driver.findElement(By.xpath("//label[text()[normalize-space()='"+gen+"']]")).click();
			//input[@name='Gender']
			
			// Click on the gender radio button using javascript
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", gender);

			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", submitBtn);
			WebElement confirmationMessage = driver
					.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));

			// check if confirmation message is displayed
			Thread.sleep(2000);
			if (confirmationMessage.isDisplayed()) {
				// if the message is displayed , write PASS in the excel sheet using the method
				// of ExcelUtils
			System.out.println("Message is crct");
				//excelUtils.setCellValue(i, 6, "PASS", excelFilePath);
			} else {
				// if the message is not displayed , write FAIL in the excel sheet using the
				// method of ExcelUtils
				System.out.println("Msg is wrong");
				//excelUtils.setCellValue(i, 6, "FAIL", excelFilePath);
			}

			// close the confirmation popup
			Thread.sleep(2000);
			//WebElement closebtn = driver.findElement(By.xpath("//button[@data-dismiss='alert']"));
			// closebtn.click();
			js.executeScript("arguments[0].click();", closebtn);
			
			 

	}
public static String randomestring() {
	// TODO Auto-generated method stub
	String gen = RandomStringUtils.randomAlphabetic(5);
	return gen;
}
}