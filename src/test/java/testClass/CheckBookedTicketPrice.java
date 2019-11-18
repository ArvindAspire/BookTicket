package testClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.TestBase;

import pages.FlightPage;
import pages.Homepage;
import pages.PaymentPage;
import util.TestUtil;

@Listeners(util.Listener.class)


public class CheckBookedTicketPrice extends TestBase {
	
	Homepage hp;
	PaymentPage pg;
	
	
	public CheckBookedTicketPrice() throws IOException {
		super();
	}
		
		
	
	@BeforeMethod
	public void setUp() throws IOException {
	
	TestBase.init();
	hp=new Homepage();
	
	
		
	}
	@Test
	public void StablePrice() throws IOException, InterruptedException {
		
		FlightPage fp=hp.CreateFlightTicket();
		String price=fp.BookTicket();
		pg=fp.ClickonBookNow();
		TestUtil.switchWindow();
		String  FinalPrice=pg.FinalPrice();
		Assert.assertEquals(price, FinalPrice);
	}
	
	public void tearDown() {
		
		driver.quit();
	}

}
