package com.genericlib;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {

	public FileLib fl = new FileLib();
	public static ExtentReports report= new ExtentReports(System.getProperty("user.dir")+"\\SemiCab.html");
	public static ExtentTest test;
	public static WebDriver driver;
	public static CommonUtils cu=new CommonUtils();
	public String prop="C:\\Users\\Sharon Jasphin\\eclipse-workspace\\SemiCab\\src\\test\\resources\\commondata.properties";
	public String exel="C:\\Users\\Sharon Jasphin\\eclipse-workspace\\SemiCab\\src\\test\\resources\\TestDataSemiCab.xlsx";	
	
	
@BeforeSuite(groups = {"smoke","regression"})
public void configBC() throws Throwable {
	report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	if(fl.getDataFromProperty(prop,"browser").equals("chrome")){
		driver=new ChromeDriver();
	}
	if(fl.getDataFromProperty(prop,"browser").equals("edge")){
		driver=new InternetExplorerDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(fl.getDataFromProperty(prop, "URL"));
}

@BeforeMethod(groups = {"smoke","regression"})
public void configBM(Method m) throws Throwable {
	driver.findElement(By.id("username")).sendKeys(fl.getDataFromProperty(prop, "username"));
	driver.findElement(By.xpath("//a[text()='Sign In with Password']")).click();
	driver.findElement(By.id("password")).sendKeys(fl.getDataFromProperty(prop, "password"),Keys.ENTER);
	Reporter.log("Logged in successfully", true);
}

@BeforeTest(groups = {"smoke","regression"})
public void configBT() {
	
}
//@AfterMethod(groups = {"smoke","regression"})
public void configAM() {
	cu.waitTillElementToBeClickable(driver, driver.findElement(By.xpath("//a[text()='Logout']")));
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	Reporter.log("Logged Out", true);
	//test.log(LogStatus.PASS,"Logged out from SemiCab");
	cu.waitTillElementToBeClickable(driver, driver.findElement(By.xpath("//a[text()='Sign In with Password']")));
	//report.endTest(test);
}

@AfterSuite(groups = {"smoke","regression"})
public void conficAC() {
	//driver.close();
	//driver.quit();
	//report.flush();
	}

}


