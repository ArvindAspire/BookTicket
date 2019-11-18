package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class PaymentPage extends TestBase {
	
	@FindBy(xpath=".//span[@class='font20']/span/span")
	WebElement FinalPrice;
	
	
	public PaymentPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public String FinalPrice() {
		
		return FinalPrice.getText();
	}
	
	

}
