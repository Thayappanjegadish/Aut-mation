package Components;

import java.util.ArrayList;
import java.util.TimerTask;

import javax.management.timer.Timer;

//import java.util.

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import drivers.baseclass;

public class CRM extends baseclass {


	JavascriptExecutor js = (JavascriptExecutor)driver;


	static String salesun = "demosalesmanager";
	static String salespwd = "crmsfa";

	public CRM() {

	}

	public CRM salesmanagerlogin() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@name='USERNAME'])[1]")).sendKeys(salesun);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(salespwd);
		type("//input[@name='PASSWORD']" ,salespwd);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		click("//input[@type='submit' and @value='Login']");
		Thread.sleep(5000);
		return this;
	}

	
	public CRM smlogin() {
		driver.findElement(By.id("username")).sendKeys(salesun);
		driver.findElement(By.id("password")).sendKeys(salespwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		return this;		
	}

	public CRM homepagenav() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='button']/a/img")));
		//		String a = driver.findElement(By.xpath("//div[@for='crmsfa']")).getText();	
		WebElement navbutton = driver.findElement(By.xpath("//div[@id='button']/a/img"));
		js.executeScript("arguments[0].click()", navbutton);
		//		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		//		System.out.println(a);
		return this;
	}
	
	public CRM accountpagenav() {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		return this;
	}
	
	public CRM accountdetailscraping() {
		String accinfo = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr)[1]")).getText();
	    System.out.println(accinfo);
	    ArrayList<String> account = new ArrayList<String>();
	    
	    return this;
	}

   public CRM storingaccountdetails() {
	 
	   
	   return this;
   }
	public CRM createaccount() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen619")).click();
		//		driver.navigate().to("http://leaftaps.com/crmsfa/control/createAccountForm");
		//		String currenturl = driver.getCurrentUrl();
		//		System.out.println(currenturl);
		return this;
	}
	
	public CRM createlead() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("http://leaftaps.com/crmsfa/control/createLeadForm");
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("sales");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("selenium");
		Select src = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")));
		src.selectByVisibleText("Website");
		Select campaign = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']")));
		campaign.selectByVisibleText("Automobile");
		driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("salutation");
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("07/10/1995");
		Select industry = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']")));
		industry.selectByVisibleText("Computer Software");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Create Lead']")).click();
		return this;
	}

	
	public CRM accountdetails() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Validation of account details has been started");
		String accountdetails = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr)[2]")).getText();
	    System.out.println(accountdetails);
	    return this;
	}



}
