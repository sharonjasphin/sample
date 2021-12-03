package com.genericlib;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	public FileLib fl = new FileLib();
	public String prop="C:\\Users\\Sharon Jasphin\\eclipse-workspace\\SC\\SemiCabWeb\\SemiCabWeb\\SemiCab\\src\\main\\resources\\commondata.properties";
	public String exel="C:\\Users\\Sharon Jasphin\\eclipse-workspace\\SC\\SemiCabWeb\\SemiCabWeb\\SemiCab\\src\\main\\resources\\TestDataSemiCab.xlsx";	
	
	public void mouseHover(WebDriver driver,WebElement e) {
		Actions act = new Actions(driver);
		act.moveToElement(e).build().perform();
	}
	
	public void waitTillElementToBeClickable(WebDriver driver,WebElement e) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		
	}
	
	public void waitTillElementToBeVisible(WebDriver driver,WebElement e) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(e));
		
	}
	
	public void keyBoardActionsBackspace(WebDriver driver) {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.chord(Keys.BACK_SPACE)).build().perform();
	}

	public void keyBoardActionsTab(WebDriver driver) {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.chord(Keys.TAB)).build().perform();
	}
	
	public String getCurrentDateTime() {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		LocalDateTime ld=LocalDateTime.now();
		return df.format(ld);
		
	}
	
	public String captureSS(WebDriver driver) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Samartha\\eclipse-workspace\\SemiCab\\test-output\\Screenshot\\"+System.currentTimeMillis()+".png");
		String path=dest.getAbsolutePath();
		FileUtils.copyFile(src, dest);
		return path;
	}
	
	public void SwithToNewWindow(WebDriver driver) {
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> nt = ids.iterator();
			String pid = nt.next();
			String cid = nt.next();
			driver.switchTo().window(cid);
	}
	
	public void CreatePrivateWindowChrome() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
	}
	
	public void Login(WebDriver driver) throws Throwable {
		driver.get(fl.getDataFromProperty(prop, "URL"));
		driver.findElement(By.id("username")).sendKeys(fl.getDataFromProperty(prop, "username"));
		driver.findElement(By.xpath("//a[text()='Sign In with Password']")).click();
		driver.findElement(By.id("password")).sendKeys(fl.getDataFromProperty(prop, "password"),Keys.ENTER);
	}
	
	public void Logout(WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
}
