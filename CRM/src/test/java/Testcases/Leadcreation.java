package Testcases;

import Components.CRM;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import drivers.baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Leadcreation extends CRM {

	@BeforeTest
	public void openchrome() {
		open("http://leaftaps.com/crmsfa/control/createLeadForm");
	}

	@Test
	public void signin() throws InterruptedException {
		new CRM()
		.salesmanagerlogin()
		.createlead();	
	}

	@Test
	public void leadcreation() throws InterruptedException {
		new CRM();
		
	}
}