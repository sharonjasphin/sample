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

public class ValidateStatusEvents extends Base {
	@Test(groups = {"regression"} , priority = 1)
	public void ValidateAppointment() throws Throwable {
		
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
		//Scheduling an appointment
		l.getExpandLoadDetails().click();
		cu.waitTillElementToBeClickable(driver, l.getLoadStops());
		l.getLoadStops().click();
		l.getScheduleAppointment().click();
		l.getAppointmentStartTimeCalendar().click();
		l.getCalender15().click();
		l.getAppointmentCalendarOk().click();
		l.getAppointmentEndTimeCalendar().click();
		l.getCalender15().click();
		l.getAppointmentCalendarOk().click();
		test.log(LogStatus.PASS, "Appointment has been scheduled successfully ");
		String[] st1=l.getAppointmentStartTime().getAttribute("value").split(" ");
		String[] et1=l.getAppointmentEndTime().getAttribute("value").split(" ");
		l.getAppointmentSubmit().click();
		String[] st=l.getVerifyStartTimeAppointment().getText().split(",");
		String[] et=l.getVerifyEndTimeAppointment().getText().split(",");
		SimpleDateFormat format1=new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date datest1 = format1.parse(st1[0]);
		java.util.Date dateet1 = format1.parse(et1[0]);
		System.out.println(datest1+" "+dateet1);
		et[0]=et[0].replaceAll("th", "").replaceAll(" ", "-");
		st[0]=st[0].replaceAll("th", "").replaceAll(" ", "-");
		SimpleDateFormat format2=new SimpleDateFormat("MMM-dd-yyyy");
		java.util.Date datest=format2.parse(st[0]);
		java.util.Date dateet=format2.parse(et[0]);
		System.out.println(datest+" "+dateet);
		AssertJUnit.assertEquals(datest.hashCode()==datest1.hashCode(), true);
		AssertJUnit.assertEquals(dateet.hashCode()==dateet1.hashCode(), true);
		String timest1 = st1[1]+" "+st1[2];
		String timest=st[1].replaceFirst(" ", "");
		if(timest1.equals(timest)) {
			
		}
		
		else
			timest='0'+timest;
		String timeet1=et1[1]+" "+et1[2];
		String timeet=et[1].replaceFirst(" ", "");
		if(timeet1.equals(timeet)) {
		
		}
		else
			timeet="0"+timeet;
		test.log(LogStatus.PASS, "Appointment actual start date and time==>"+datest1+" "+timest1);
		test.log(LogStatus.PASS, "Appointment expected start date and time==>"+datest+" "+timest);
		test.log(LogStatus.PASS, "Appointment actual end date date and time==>"+dateet1+" "+timeet1);
		test.log(LogStatus.PASS, "Appointment expected end date and time==>"+dateet+" "+timeet);
		AssertJUnit.assertEquals(timest1.equals(timest), true);
		AssertJUnit.assertEquals(timeet1.equals(timeet), true);
		test.log(LogStatus.PASS, "Appointment date and time has been verified");

}
}
