package pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class Homepage extends TestBase{

	@FindBy(xpath=".//li[@data-cy='roundTrip']/span")
	WebElement RoundTrip;
	
	@FindBy(xpath=".//label[@for='fromCity']")
	WebElement OpnFromFilter;
	
	@FindBy(xpath=".//div[@class='hsw_autocomplePopup autoSuggestPlugin']//input")
	WebElement FromAutoFilter;
	
	@FindBy(xpath=".//div[@class='fsw_inputBox searchToCity inactiveWidget activeWidget']")
	WebElement openToFilter;
	
	@FindBy(xpath=".//div[@class='hsw_autocomplePopup autoSuggestPlugin']//input")
	WebElement toAutoFilter;
	
	@FindBy(xpath=".//ul[@role='listbox']/li[1]")
	WebElement selectDest;
	
	@FindBy(xpath=".//ul[@role='listbox']/li[1]")
	WebElement selectArr;
	
	@FindBy(xpath=".//div[@class='fsw_inputBox dates inactiveWidget ']")
	WebElement clickDeptBtn;
	
	@FindBy(xpath="//p[contains(text(),'18')]")
	WebElement deptDate;
	
	@FindBy(xpath=".//div[@class='fsw_inputBox dates reDates inactiveWidget  shiftModal' ]/label")
	WebElement clickArrBtn;
	
	@FindBy(xpath="(//p[contains(text(),'19')])[2]")
	WebElement arrivalDate;
	
	@FindBy(xpath=".//p[@class='makeFlex vrtlCenter ']")
	WebElement ClickSearchBtn;
	
	
	public Homepage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public FlightPage CreateFlightTicket() throws IOException, InterruptedException {	
		
		
		RoundTrip.click();
		Thread.sleep(1000);
		OpnFromFilter.click();
		Thread.sleep(1000);
		FromAutoFilter.sendKeys(prop.getProperty("from"));
		Thread.sleep(1000);
		selectDest.click();
		Thread.sleep(1000);
		openToFilter.click();
		Thread.sleep(1000);
		toAutoFilter.sendKeys(prop.getProperty("destination"));
		Thread.sleep(1000);
		clickDeptBtn.click();
		Thread.sleep(1000);
		//selectArr.click();
		deptDate.click();
		Thread.sleep(1000);
		
		OpnFromFilter.click();
		Thread.sleep(1000);
		
		
		clickArrBtn.click();		
		Thread.sleep(1000);
		arrivalDate.click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		ClickSearchBtn.click();
		Thread.sleep(1000);		
		return new FlightPage();
		
		
	}
	
	
	
	
	
	
	
	
	

}
