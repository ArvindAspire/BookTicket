package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class FlightPage extends TestBase {
	
	@FindBy(xpath="//div[@class='splitVw-sctn pull-left']//button[@class='btn dropdown-toggle']")
	WebElement sortByBtnDest;
	
	@FindBy(xpath=".//ul[@class='dropdown-menu custom-scroll']/li/a/p")
	WebElement lowTohighDest;
	
	@FindBy(xpath="(.//div[@class='dropdown pull-right c-dropdown sortby-dropdown '])[2]")
	WebElement sortByBtnArr;
	
	@FindBy(xpath="(.//ul[@class='dropdown-menu custom-scroll'])[2]/li/a[1]/p")
	WebElement lowTohighDestArr;
	
	@FindBy(xpath="//span[@class='splitVw-total-fare']")
	WebElement Fare;
	
	@FindBy(xpath="//button[@class='fli_primary_btn text-uppercase ']")
	WebElement BookBtn;
	
	public FlightPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
	public String BookTicket() {
		sortByBtnDest.click();
		lowTohighDest.click();
		sortByBtnArr.click();
		lowTohighDestArr.click();
		String TicketPrice=Fare.getText();
		return TicketPrice;
		
	}
	
	public PaymentPage ClickonBookNow() throws IOException {
		
		BookBtn.click();
		return new PaymentPage();
		
	}

}
