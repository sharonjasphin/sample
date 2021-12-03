package com.objectrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadManagement {
	@FindBy(xpath = "//a[text()='Load Management']")
	private WebElement LoadManagement;
	
	@FindBy(linkText =  "Accounting")
	private WebElement Accounting;
	
	@FindBy(xpath = "//div[text()='Create']")
	private WebElement Createload ;
	
	@FindBy(xpath = "//div[text()='Create']")
	private WebElement CreateStop ;
	
	@FindBy(xpath = "//div[contains(text(),'Activity')]/parent::div/descendant::input")
	private WebElement Activity ;
	
	@FindBy(xpath = "//span[text()='Drop']")
	private WebElement CreateStopDrop;
	
	@FindBy(xpath = "//span[text()='Pickup']")
	private WebElement CreateStopPickup;
	
	@FindBy(id = "stopName")
	private WebElement CreateStopName;
	
	@FindBy(id = "location.address1")
	private WebElement CreateStopAdd1;
	
	@FindBy(xpath = "//div[contains(text(),'City')]/parent::div/descendant::input")
	private WebElement CreateStopCity;
	
	@FindBy(xpath = "//div[contains(text(),'State')]/parent::div/descendant::input")
	private WebElement CreateStopState;
	
	@FindBy(id = "react-autowhatever-location.state--item-0")
	private WebElement CreateStopStatefirstSuggetion;
	
	@FindBy(xpath = "//div[contains(text(),'Country')]/parent::div/descendant::input")
	private WebElement CreateStopCountry;
	
	@FindBy(id="location.zip")
	private WebElement CreateStopZip;
	
	@FindBy(id="arriveTimeLocal")
	private WebElement CreateStopArraiveTime;
	
	@FindBy(xpath = "//div[contains(text(),'Earliest Arrival')]/following-sibling::div/descendant::button//*[name()='svg']")
	private WebElement CreateStopEArraivalCalendar;
	
	@FindBy(xpath = "//div[contains(text(),'Latest Arrival')]/following-sibling::div/descendant::button//*[name()='svg']")
	private WebElement CreateStopLArraivalCalendar;
	
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement CreateStopCalendarOk;
	
	@FindBy(id="departTimeLocal")
	private WebElement CreateStopDepartTime;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement CreateStopSubmit;
	
	@FindBy(xpath = "//div[contains(text(),'Customer')]/parent::div/descendant::input")
	private WebElement CreateLoadCustomer;
	
	@FindBy(xpath = "//li[@id='react-autowhatever-customerOrg--item-0']/div")
	private WebElement CreateLoadFirstCustomer;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement CreateLoadNext;
	
	@FindBy(xpath = "//div[text()='No shipments are created.']/parent::div/descendant::div[text()='Create']")
	private WebElement CreateLoadCreateShipment;
	
	@FindBy(id = "commodity")
	private WebElement CreateShipmentCommodity;
	
	@FindBy(id = "weight")
	private WebElement CreateShipmentWeight;
	
	@FindBy(xpath = "//div[contains(text(),'Pickup at')]/parent::div/descendant::input")
	private WebElement CreateShipmentPickup;
	
	@FindBy(xpath = "//div[contains(text(),'Drop at')]/parent::div/descendant::input")
	private WebElement CreateShipmentDrop;
	
	@FindBy(xpath = "//li[@id='react-autowhatever-pick--item-0']/div")
	private WebElement CreateShipmentSelectPickStop;
	
	@FindBy(xpath = "//li[@id='react-autowhatever-drop--item-0']/div")
	private WebElement CreateShipmentSelectDropStop;
	
	@FindBy(xpath = "//div[@role='dialog']/descendant::span[text()='Submit']")
	private WebElement CreateShipmentSubmit;
	
	@FindBy(xpath = "//div[contains(text(),'Equipment')]/parent::div/descendant::input")
	private WebElement CreateLoadEquipment;
	
	@FindBy(xpath = "//div[@id='react-autowhatever-equipmentClass']/ul/li")
	private WebElement CreateLoadEquipmentFirstSuggetion;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement CreateLoadSubmit;
	
	@FindBy(xpath = "//span[text()='OK']/parent::button")
	private WebElement CreateLoadOK;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement SearchLoad;
	
	@FindBy(xpath = "//div[@class='LoadList_container__1tb6o']/descendant::span")
	private WebElement GetLoadNumOfFirstSearchResult;
	
	@FindBy(xpath = "//div[contains(text(),'Load#')]/parent::div/following-sibling::div/descendant::input")
	private WebElement CreateLoadNum;
	
	@FindBy(xpath = "//div[@class='LoadSummary_header__3iTHq']/descendant::span//*[name()='svg']")
	private WebElement LoadEllispsis;
	
	@FindBy(xpath = "//span[text()='Accept']")
	private WebElement AcceptLoad;
	
	@FindBy(xpath = "//div[text()='Accepted']")
	private WebElement Accepted;
	
	@FindBy(xpath = "//span[text()='Mark In Transit']")
	private WebElement MarkInTransit;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement MarkInTransitSubmit;
	
	@FindBy(xpath = "//div[text()='In Transit']")
	private WebElement InTransit;
	
	@FindBy(xpath = "//div[text()='Delivered']")
	private WebElement Delivered;
	
	@FindBy(xpath = "//span[text()='Mark Delivered']")
	private WebElement MarkDelivered;
	
	@FindBy(xpath = "//span[text()='Delivered']")
	private WebElement MarkDeliveredDelivered;
	
	@FindBy(xpath = "//div[@class='MuiSnackbar-root MuiSnackbar-anchorOriginBottomLeft']")
	private WebElement SuccessMessageTile;
	
	@FindBy(xpath = "//div[text()='EXPAND']")
	private WebElement ExpandLoadDetails;
	
	@FindBy(xpath = "(//div[text()='Must Respond by ']/parent::div/following-sibling::div//*[name()='svg'])[2]")
	private WebElement LoadStops;
	
	@FindBy(xpath = "//span[text()='Schedule']")
	private WebElement ScheduleAppointment;
	
	@FindBy(xpath = "//div[contains(text(),'Appointment Type')]/parent::div/descendant::input")
	private WebElement AppointmentType;
	
	@FindBy (xpath = "//div[contains(text(),'Start Time')]/parent::div/descendant::span//*[name()='svg']")
	private WebElement AppointmentStartTimeCalendar;
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement AppointmentCalendarOk;
	
	@FindBy(xpath = "//div[contains(text(),'Start Time')]/parent::div/descendant::input")
	private WebElement AppointmentStartTime;
	
	@FindBy(xpath = "//div[contains(text(),'End Time')]/parent::div/descendant::span//*[name()='svg']")
	private WebElement AppointmentEndTimeCalendar;
	
	@FindBy(xpath = "//div[contains(text(),'End Time')]/parent::div/descendant::input")
	private WebElement AppointmentEndTime;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement AppointmentSubmit;
	
	@FindBy(id = "appointmentNumber")
	private WebElement AppointmentNumber;
	
	@FindBy(xpath = "//div[text()='Appointment Only']/following-sibling::span//*[name()='svg']")
	private WebElement EditAppointment;
	
	@FindBy(xpath = "//div[text()='Appointment Only']/following-sibling::span//*[name()='svg'][2]")
	private WebElement DeleteAppointment;
	
	@FindBy(xpath = "//div[text()='Appointment Only']/parent::div/following-sibling::div")
	private WebElement VerifyStartTimeAppointment;
	
	@FindBy(xpath = "//div[text()='Appointment Only']/parent::div/following-sibling::div[2]")
	private WebElement VerifyEndTimeAppointment;
	
	@FindBy(xpath = "//span[text()='Assign Carrier']")
	private WebElement AssignCarrier;
	
	@FindBy(xpath = "//div[@role='combobox']/descendant::input")
	private WebElement AssignCarrierCarrier;
	
	@FindBy(xpath = "//ul/li/div")
	private WebElement AssignCarrierFirstCarrierSuggetion;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement AssignCarrierSubmit;
	
	@FindBy(xpath = "//span[text()='Assign Driver']")
	private WebElement AssignDriver;
	
	@FindBy(xpath = "//p[text()='Add New Driver']")
	private WebElement AddNewDriver;
	
	@FindBy(id = "firstName")
	private WebElement AddNewDriverFirstName;
	
	@FindBy(id = "lastName")
	private WebElement AddNewDriverLastName;
	
	@FindBy(id = "email")
	private WebElement AddNewDriverEmail;
	
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement AddNewDriverAdd;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement AssignDriverSubmit;
	
	@FindBy(id = "tractorNumber")
	private WebElement AssignDriverTruckNumber;
	
	@FindBy(xpath = "//p[text()='No records found']")
	private WebElement NoRecordsFound;
	
	@FindBy(xpath = "//div[text()='Pickup']/parent::div/parent::div/parent::div/parent::div/following-sibling::div/descendant::*[name()='svg']")
	private WebElement EventStatusIcon;
	
	@FindBy(xpath = "//div[text()='Status Event*']/following-sibling::div/child::div/descendant::div/child::input")
	private WebElement SelectStatusEvent;
	
	@FindBy(xpath = "//span[text()='Arrived']")
	private WebElement SelectArrivedStatus;
	
	@FindBy(xpath="//div[contains(text(),'Event Time')]/parent::div/descendant::span//*[name()='svg']")
	private WebElement SelectCalender;
	
	@FindBy(xpath ="//span[text()='OK']")
	private WebElement SelectArrivedCalenderOk;
	
	@FindBy(xpath="//span[text()='OK']")
	private WebElement SelectDepartureCalenderOk;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement SelectArrivedSubmit;
	
	@FindBy(id="eventTime")
	private WebElement SelectArrivedTime;
	
	@FindBy(id="eventTime")
	private WebElement SelectdepartureTime;
	
	@FindBy(xpath = "//div[contains(text(),'Arrived')]")
	private WebElement VarifyArrivedTime;
	
	@FindBy(xpath = "//div[contains(text(),'Departed')]")
	private WebElement VerifyDepartedTime;
	

	@FindBy(xpath = "//span/p[text()='15']")
	private WebElement Calender15;
	
	@FindBy(xpath = "//span[text()='Departed']")
	private WebElement Selectdeparture;
	
	@FindBy(xpath = "//div[contains(text(),'Event Time')]/parent::div/descendant::span//*[name()='svg']")
	private WebElement DepartureCalender;
	
	@FindBy(xpath = "//div[contains(text(),'Estimated Time of Departure')]")
	private WebElement VerifyEstimatedTimeOfDeparture;
	
	@FindBy(xpath = "//span[text()='Estimated Time of Departure']")
	private WebElement EstimatedTimeOfDeparture;
	
	@FindBy(xpath = "//span[text()='Estimated Time of Arrival']")
	private WebElement EstimatedTimeOfArrival;
	
	@FindBy(xpath = "//div[contains(text(),'Estimated Time of Arrival')]")
	private WebElement VerifyEstimatedOfArrival;
	
	@FindBy(xpath = "//span[text()='Loaded']")
	private WebElement SelectLoaded;
	
	@FindBy(id = "eventTime")
	private WebElement SelectLoadedTime;
	
	
	@FindBy(xpath = "//div[contains(text(),'Loaded')]")
	private WebElement VerifyloadedTime;
	
	@FindBy(xpath = "//div[text()='Drop-off']/parent::div/parent::div/parent::div/parent::div/following-sibling::div/descendant::*[name()='svg']")
	private WebElement DropOffStatusIcon;
	
	@FindBy(xpath = "//span[text()='Unloaded']")
	private WebElement SelectUnloadedStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Unloaded')]")
	private WebElement VerifyUnloadedTime;
	//Getters


	public WebElement getAssignDriverTruckNumber() {
		return AssignDriverTruckNumber;
	}

	public WebElement getEstimatedTimeOfArrival() {
		return EstimatedTimeOfArrival;
	}

	public WebElement getEstimatedTimeOfDeparture() {
		return EstimatedTimeOfDeparture;
	}

	public WebElement getVerifyEstimatedTimeOfDeparture() {
		return VerifyEstimatedTimeOfDeparture;
	}

	public WebElement getNoRecordsFound() {
		return NoRecordsFound;
	}

	public WebElement getAssignCarrier() {
		return AssignCarrier;
	}

	public WebElement getAssignCarrierCarrier() {
		return AssignCarrierCarrier;
	}

	public WebElement getAssignCarrierFirstCarrierSuggetion() {
		return AssignCarrierFirstCarrierSuggetion;
	}

	public WebElement getAssignCarrierSubmit() {
		return AssignCarrierSubmit;
	}

	public WebElement getAssignDriver() {
		return AssignDriver;
	}

	public WebElement getAddNewDriver() {
		return AddNewDriver;
	}

	public WebElement getAddNewDriverFirstName() {
		return AddNewDriverFirstName;
	}

	public WebElement getAddNewDriverLastName() {
		return AddNewDriverLastName;
	}

	public WebElement getAddNewDriverEmail() {
		return AddNewDriverEmail;
	}

	public WebElement getAddNewDriverAdd() {
		return AddNewDriverAdd;
	}

	public WebElement getAssignDriverSubmit() {
		return AssignDriverSubmit;
	}

	public WebElement getExpandLoadDetails() {
		return ExpandLoadDetails;
	}

	public WebElement getLoadStops() {
		return LoadStops;
	}

	public WebElement getScheduleAppointment() {
		return ScheduleAppointment;
	}

	public WebElement getAppointmentType() {
		return AppointmentType;
	}

	public WebElement getAppointmentStartTimeCalendar() {
		return AppointmentStartTimeCalendar;
	}

	public WebElement getAppointmentCalendarOk() {
		return AppointmentCalendarOk;
	}

	public WebElement getAppointmentStartTime() {
		return AppointmentStartTime;
	}

	public WebElement getAppointmentEndTimeCalendar() {
		return AppointmentEndTimeCalendar;
	}

	public WebElement getAppointmentEndTime() {
		return AppointmentEndTime;
	}

	public WebElement getAppointmentSubmit() {
		return AppointmentSubmit;
	}

	public WebElement getAppointmentNumber() {
		return AppointmentNumber;
	}

	public WebElement getEditAppointment() {
		return EditAppointment;
	}

	public WebElement getDeleteAppointment() {
		return DeleteAppointment;
	}

	public WebElement getVerifyStartTimeAppointment() {
		return VerifyStartTimeAppointment;
	}

	public WebElement getVerifyEndTimeAppointment() {
		return VerifyEndTimeAppointment;
	}

	public WebElement getLoadManagement() {
		return LoadManagement;
	}

	public WebElement getCreateload() {
		return Createload;
	}

	public WebElement getCreateStop() {
		return CreateStop;
	}

	public WebElement getActivity() {
		return Activity;
	}

	public WebElement getCreateStopDrop() {
		return CreateStopDrop;
	}

	public WebElement getCreateStopPickup() {
		return CreateStopPickup;
	}

	public WebElement getCreateStopName() {
		return CreateStopName;
	}

	public WebElement getCreateStopAdd1() {
		return CreateStopAdd1;
	}

	public WebElement getCreateStopCity() {
		return CreateStopCity;
	}

	public WebElement getCreateStopState() {
		return CreateStopState;
	}

	public WebElement getCreateStopStatefirstSuggetion() {
		return CreateStopStatefirstSuggetion;
	}

	public WebElement getCreateStopCountry() {
		return CreateStopCountry;
	}

	public WebElement getCreateStopZip() {
		return CreateStopZip;
	}

	public WebElement getCreateStopArraiveTime() {
		return CreateStopArraiveTime;
	}

	public WebElement getCreateStopDepartTime() {
		return CreateStopDepartTime;
	}

	public WebElement getCreateStopSubmit() {
		return CreateStopSubmit;
	}

	public WebElement getCreateLoadCustomer() {
		return CreateLoadCustomer;
	}

	public WebElement getCreateLoadNext() {
		return CreateLoadNext;
	}

	public WebElement getCreateLoadCreateShipment() {
		return CreateLoadCreateShipment;
	}

	public WebElement getCreateShipmentCommodity() {
		return CreateShipmentCommodity;
	}

	public WebElement getCreateShipmentWeight() {
		return CreateShipmentWeight;
	}

	public WebElement getCreateShipmentPickup() {
		return CreateShipmentPickup;
	}

	public WebElement getCreateShipmentSubmit() {
		return CreateShipmentSubmit;
	}

	public WebElement getCreateLoadEquipment() {
		return CreateLoadEquipment;
	}

	public WebElement getCreateLoadEquipmentFirstSuggetion() {
		return CreateLoadEquipmentFirstSuggetion;
	}

	public WebElement getCreateLoadSubmit() {
		return CreateLoadSubmit;
	}

	public WebElement getCreateStopEArraivalCalendar() {
		return CreateStopEArraivalCalendar;
	}

	public WebElement getCreateStopLArraivalCalendar() {
		return CreateStopLArraivalCalendar;
	}

	public WebElement getCreateStopCalendarOk() {
		return CreateStopCalendarOk;
	}

	public WebElement getCreateLoadFirstCustomer() {
		return CreateLoadFirstCustomer;
	}

	public WebElement getCreateLoadNum() {
		return CreateLoadNum;
	}

	public WebElement getCreateShipmentDrop() {
		return CreateShipmentDrop;
	}

	public WebElement getCreateShipmentSelectPickStop() {
		return CreateShipmentSelectPickStop;
	}

	public WebElement getCreateShipmentSelectDropStop() {
		return CreateShipmentSelectDropStop;
	}

	public WebElement getCreateLoadOK() {
		return CreateLoadOK;
	}

	public WebElement getSearchLoad() {
		return SearchLoad;
	}

	public WebElement getGetLoadNumOfFirstSearchResult() {
		return GetLoadNumOfFirstSearchResult;
	}

	public WebElement getLoadEllispsis() {
		return LoadEllispsis;
	}

	public WebElement getAcceptLoad() {
		return AcceptLoad;
	}

	public WebElement getAccepted() {
		return Accepted;
	}

	public WebElement getMarkInTransit() {
		return MarkInTransit;
	}

	public WebElement getMarkInTransitSubmit() {
		return MarkInTransitSubmit;
	}

	public WebElement getInTransit() {
		return InTransit;
	}

	public WebElement getDelivered() {
		return Delivered;
	}

	public WebElement getMarkDelivered() {
		return MarkDelivered;
	}

	public WebElement getMarkDeliveredDelivered() {
		return MarkDeliveredDelivered;
	}

	public WebElement getSuccessMessageTile() {
		return SuccessMessageTile;
	}

	public WebElement getAccounting() {
		return Accounting;
	}
	
	public WebElement getEventStatusIcon() {
		return EventStatusIcon;
		
	}

	public WebElement getSelectStatusEvent() {
		return SelectStatusEvent;
	}

	public WebElement getSelectArrivedStatus() {
		return SelectArrivedStatus;
	}

	public WebElement getSelectCalender() {
		return SelectCalender;
	}

	public WebElement getSelectArrivedCalenderOk() {
		return SelectArrivedCalenderOk;
	}

	public WebElement getSelectArrivedSubmit() {
		return SelectArrivedSubmit;
	}

	public WebElement getVarifyArrivedDate() {
		return VarifyArrivedTime;
	}

	public WebElement getSelectArrivedTime() {
		return SelectArrivedTime;
	}

	public WebElement getVarifyArrivedTime() {
		return VarifyArrivedTime;
	}

	public WebElement getCalender15() {
		return Calender15;
	}

	public WebElement getSelectdeparture() {
		return Selectdeparture;
	}

	public WebElement getDepartureCalender() {
		return DepartureCalender;
	}

	public WebElement getSelectDepartureCalenderOk() {
		return SelectDepartureCalenderOk;
	}

	public WebElement getVerifyDepartedTime() {
		return VerifyDepartedTime;
	}

	public WebElement getSelectdepartureTime() {
		return SelectdepartureTime;
	}

	public WebElement getVerifyEstimatedOfArrival() {
		return VerifyEstimatedOfArrival;
	}

	public WebElement getSelectLoaded() {
		return SelectLoaded;
	}

	public WebElement getSelectLoadedTime() {
		return SelectLoadedTime;
	}

	public WebElement getVerifyloadedTime() {
		return VerifyloadedTime;
	}

	public WebElement getDropOffStatusIcon() {
		return DropOffStatusIcon;
	}

	public WebElement getSelectUnloadedStatus() {
		return SelectUnloadedStatus;
	}

	public WebElement getVerifyUnloadedTime() {
		return VerifyUnloadedTime;
	}
	
	

	
	
	
	
	
	


}
