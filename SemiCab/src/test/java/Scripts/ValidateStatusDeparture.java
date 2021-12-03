package Scripts;

import java.text.SimpleDateFormat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericlib.Base;
import com.objectrep.LoadManagement;
import com.relevantcodes.extentreports.LogStatus;

public class ValidateStatusDeparture extends Base {
	@Test(groups = {"regression"} , priority = 1)
	public void ValidateDepartureStatus() throws Throwable {
		
		LoadManagement l =PageFactory.initElements(driver, LoadManagement.class);
		test=report.startTest("ValidateAppointment");
		test.log(LogStatus.PASS,"Logged into SemiCab as "+fl.getDataFromProperty(prop, "username"));
		l.getLoadManagement().click();
		test.log(LogStatus.PASS, "Navigated to Load Management");
		l.getCreateload().click();
		test.log(LogStatus.PASS, "Landed on Create Load Page");
		//Pickup Location
		l.getCreateStop().click();
		l.getActivity().click();
		l.getCreateStopPickup().click();
		l.getCreateStopName().sendKeys(fl.getDataFromExel(exel, 3, 1, "LoadData"));
		l.getCreateStopAdd1().sendKeys(fl.getDataFromExel(exel, 4, 1, "LoadData"));
		l.getCreateStopCity().sendKeys(fl.getDataFromExel(exel, 5, 1, "LoadData"));
		cu.keyBoardActionsTab(driver);
		cu.waitTillElementToBeClickable(driver, l.getCreateStopState());
		l.getCreateStopState().sendKeys(fl.getDataFromExel(exel, 6, 1, "LoadData"));
		l.getCreateStopStatefirstSuggetion().click();
		l.getCreateStopZip().sendKeys(fl.getDataFromExel(exel, 7, 1, "LoadData"));
		cu.keyBoardActionsBackspace(driver);
		cu.keyBoardActionsBackspace(driver);
		l.getCreateStopArraiveTime().click();
		l.getCreateStopEArraivalCalendar().click();
		l.getCreateStopCalendarOk().click();
		l.getCreateStopLArraivalCalendar().click();
		l.getCreateStopCalendarOk().click();
		l.getCreateStopSubmit().click();
		test.log(LogStatus.PASS, "Added Pickup Location");
		Reporter.log("Added Pickup location", true);
		//Drop Off Location
		l.getCreateStop().click();
		l.getActivity().click();
		l.getCreateStopDrop().click();
		l.getCreateStopName().sendKeys(fl.getDataFromExel(exel, 3, 2, "LoadData"));
		l.getCreateStopAdd1().sendKeys(fl.getDataFromExel(exel, 4, 2, "LoadData"));
		l.getCreateStopCity().sendKeys(fl.getDataFromExel(exel, 5, 2, "LoadData"));
		cu.keyBoardActionsTab(driver);
		cu.waitTillElementToBeClickable(driver, l.getCreateStopState());
		l.getCreateStopState().sendKeys(fl.getDataFromExel(exel, 6, 2, "LoadData"));
		l.getCreateStopStatefirstSuggetion().click();
		l.getCreateStopZip().sendKeys(fl.getDataFromExel(exel, 7, 2, "LoadData"));
		cu.keyBoardActionsBackspace(driver);
		cu.keyBoardActionsBackspace(driver);
		l.getCreateStopArraiveTime().click();
		l.getCreateStopEArraivalCalendar().click();
		l.getCreateStopCalendarOk().click();
		l.getCreateStopLArraivalCalendar().click();
		l.getCreateStopCalendarOk().click();
		l.getCreateStopSubmit().click();
		test.log(LogStatus.PASS, "Added Drop Off Location");
		Reporter.log("Added Drop Off location", true);
		//Customer
		Thread.sleep(2000);
		cu.waitTillElementToBeClickable(driver, l.getCreateLoadCustomer());
		l.getCreateLoadCustomer().sendKeys(fl.getDataFromExel(exel, 2, 2, "LoadData"));
		cu.waitTillElementToBeVisible(driver, l.getCreateLoadFirstCustomer());
		l.getCreateLoadFirstCustomer().click();
		test.log(LogStatus.PASS, "Customer has been added");
		l.getCreateLoadNum().clear();
		String LoadNum=cu.getCurrentDateTime();
		l.getCreateLoadNum().sendKeys(LoadNum);
		l.getCreateLoadNext().click();
		test.log(LogStatus.PASS, "Custom Load Number Entered==>"+LoadNum);
		//Shipment and Equipment
		l.getCreateLoadCreateShipment().click();
		l.getCreateShipmentCommodity().sendKeys(fl.getDataFromExel(exel, 11, 1, "LoadData"));
		l.getCreateShipmentWeight().sendKeys(fl.getDataFromExel(exel, 12, 1, "LoadData"));
		l.getCreateShipmentPickup().click();
		cu.waitTillElementToBeClickable(driver, l.getCreateShipmentSelectPickStop());
		Thread.sleep(2000);
		l.getCreateShipmentSelectPickStop().click();
		l.getCreateShipmentDrop().click();
		cu.waitTillElementToBeClickable(driver, l.getCreateShipmentSelectDropStop());
		Thread.sleep(2000);
		l.getCreateShipmentSelectDropStop().click();
		l.getCreateShipmentSubmit().click();
		test.log(LogStatus.PASS, "Added Shipment Details");
		l.getCreateLoadEquipment().click();
		l.getCreateLoadEquipmentFirstSuggetion().click();
		test.log(LogStatus.PASS, "Equipment type has been selected");
		l.getCreateLoadSubmit().click();
		cu.waitTillElementToBeVisible(driver, l.getCreateLoadOK());
		l.getCreateLoadOK().click();
		test.log(LogStatus.PASS, "Load Created Successfully");
		l.getSearchLoad().sendKeys(LoadNum,Keys.ENTER);
		for(int j=0;j<=1;j++) {
			if(l.getNoRecordsFound().isDisplayed()) {
				driver.navigate().refresh();
				l.getSearchLoad().sendKeys(LoadNum,Keys.ENTER);
			}
			else
				break;
		}
		cu.waitTillElementToBeVisible(driver, l.getGetLoadNumOfFirstSearchResult());
		String[] Load = l.getGetLoadNumOfFirstSearchResult().getText().split(" ");
		String LoadNum1=Load[1].toString();
		Reporter.log(LoadNum1, true);
		AssertJUnit.assertEquals(LoadNum1.equals(LoadNum), true);
		test.log(LogStatus.PASS, "Load Creation and Load status has been verified");
		Reporter.log("Load Created Successfully", true);
		//Departure
		l.getExpandLoadDetails().click();
		cu.waitTillElementToBeClickable(driver, l.getLoadStops());
		l.getLoadStops().click();
		cu.waitTillElementToBeClickable(driver, l.getEventStatusIcon());
		l.getEventStatusIcon().click();
		cu.waitTillElementToBeClickable(driver, l.getSelectStatusEvent());
		l.getSelectStatusEvent().click();
		cu.waitTillElementToBeClickable(driver, l.getSelectdeparture());
		l.getSelectdeparture().click();
		l.getDepartureCalender().click();
		l.getSelectDepartureCalenderOk().click();
		test.log(LogStatus.PASS, " departed event was submitted successfully ");
		String[] dt =l.getSelectdepartureTime().getAttribute("value").split(" ");
		l.getSelectArrivedSubmit().click();
		String[] vt=l.getVerifyDepartedTime().getText().split(",");
		SimpleDateFormat format1=new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date datedt = format1.parse(dt[0]);
		System.out.println(datedt);
		vt[0]=vt[0].replaceAll("th", "").replaceAll("2nd", "02").replaceAll("1st", "01").replaceAll("3rd", "03").replaceAll(" ", "-").replaceAll("Departed", "");
		vt[0]=vt[0].replace("\n", "");
		System.out.println(vt[0]);
		SimpleDateFormat format2 = new SimpleDateFormat("MMM-dd-yyyy");
		java.util.Date datevt = format2.parse(vt[0]);
		System.out.println(datevt);
		AssertJUnit.assertEquals(datevt.hashCode()==datedt.hashCode(), true);
		String timedt = dt[1]+" "+dt[2];
		String timevt=vt[1].replaceFirst(" ", "0");
		System.out.println("departed actual start date and time==>"+datedt+" "+timedt);
		System.out.println("departed expected start date and time==>"+datevt+" "+timevt);
		test.log(LogStatus.PASS, "departed actual start date and time==>"+datedt+" "+timedt);
		test.log(LogStatus.PASS, "departed expected start date and time==>"+datevt+" "+timevt);
		AssertJUnit.assertEquals(timedt.equals(timevt), true);
		test.log(LogStatus.PASS, "departed date and time has been verified");
		
}
}
