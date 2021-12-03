package Scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.genericlib.Base;
import com.objectrep.Administration;
import com.objectrep.Login;


public class CreateUser extends Base{
	@Test(groups = {"regression"})
	public void ValidateUserCreation() throws Throwable {		
		Administration ad=PageFactory.initElements(driver, Administration.class);
		Login hp=PageFactory.initElements(driver, Login.class);
		//test=report.startTest("ValidateUserCreattion");
		//test.log(LogStatus.PASS,"Logged into SemiCab as "+fl.getDataFromProperty(prop, "username"));
		ad.getAdministration().click();
		ad.getAdministrationUsers().click();
		//test.log(LogStatus.PASS, "Navigated to Administration");
		cu.waitTillElementToBeClickable(driver, ad.getCreateUser());
		Thread.sleep(2000);
		ad.getCreateUser().click();
		//test.log(LogStatus.PASS, "Clicked on Create User");
		ad.getCreateUserFirstName().sendKeys(RandomStringUtils.randomAlphabetic(3));
		//test.log(LogStatus.PASS, "Entered First Name");
		ad.getCreateUserLastName().sendKeys(RandomStringUtils.randomAlphabetic(3));
		//test.log(LogStatus.PASS, "Entered Last Name");
		String email=RandomStringUtils.randomAlphabetic(3)+"@test.com";
		ad.getCreateUserEmail().sendKeys(email);
		//test.log(LogStatus.PASS, "Email has been entered");
		ad.getCreateUserOrg().click();
		ad.getCreateUserOrg().sendKeys(fl.getDataFromExel(exel, 44, 0, "LoadData"));
		ad.getCreateUserFirstOrg().click();
		//test.log(LogStatus.PASS, "Organization has been selected");
		ad.getCreateUserSave().click();
		//test.log(LogStatus.PASS, "User has been created");
		cu.Logout(driver);
		Thread.sleep(2000);
		//test.log(LogStatus.PASS, "Logged out of SemiCab");
		hp.getUsername().sendKeys(email);
		hp.getSignInWithCode().click();
		Thread.sleep(2000);
		//test.log(LogStatus.PASS, "Verificaion code has been sent");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		for(String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		cu.Login(driver);
		ad.getAdministration().click();
		Thread.sleep(2000);
		ad.getAdministrationToolbox().click();
		ad.getNotificationLogs().click();
		ad.getNotificationsLogFirst().click();
		String code=ad.getVerificationCode().getText();
		cu.Logout(driver);
		cu.waitTillElementToBeVisible(driver, hp.getUsername());
		driver.close();
		for(String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		hp.getCodebox().sendKeys(code);
		//test.log(LogStatus.PASS, "Verification code is fetched and entered");
		hp.getSignIn().click();
		/*
		 * test.log(LogStatus.PASS, "Logged in as "+email); test.log(LogStatus.PASS,
		 * "Verifed Auto-Activation process with verification code");
		 * Reporter.log("User creation has been verified successfully", true);
		 * test.log(LogStatus.PASS, "User creation has been verified successfully");
		 */
	}
}
