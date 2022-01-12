package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import PageObject.CustomerPagee;
//import PageObject.Loginpagee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
WebDriver driver;
Loginpagee lp;
CustomerPagee cp;
	@Given("User Launches chrome browser")
	public void user_Launches_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new Loginpagee(driver);
		cp = new CustomerPagee(driver);
		
	}

	@When("user opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String eml, String pwd) {
		lp.enterUserName(eml);
	    lp.enterPassword(pwd);
	}

	@When("click on login button")
	public void click_on_login_button() throws Exception {
		lp.clickLoginButton();
	}

	@Then("Page Title should be {string} user able to view Dashboard")
	public void page_Title_should_be_user_able_to_view_Dashboard(String pgtitle) {
	   if( driver.getTitle().equals(pgtitle)){
		 System.out.println("Page title matched:"+ pgtitle);  
	    }
	   else {
		System.out.println("Page title not matched:" +pgtitle);
	}
	    }
	
	
	@When("User clicks on Customericon")
	public void User_clicks_on_Customericon() {
		cp.ClickCustomericon();
		    
		}
	@When("User clicks on AddNewData")
	public void User_clicks_on_AddNewData() throws InterruptedException, IOException {
		cp.CustomerTestData();
		    
		}
	

	@When("User clicks on Logout Button")
	public void user_clicks_on_Logout_Button() {
	    driver.findElement(By.linkText("Logout")).click();;
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException {
		Thread.sleep(2000);
	    driver.close();
	}
	}
