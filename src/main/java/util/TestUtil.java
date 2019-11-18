package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import baseClass.TestBase;

public class TestUtil extends TestBase {
	
	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT_WAIT=30;
	
	/*
	 * public void wait(WebElement ele) { WebDriverWait wait = new
	 * WebDriverWait(driver, 10); WebElement el =
	 * wait.until(ExpectedConditions.presenceOfElementLocated(ele);
	 * 
	 * }
	 */
	
	public static void switchWindow() {
		
		//String firstWindow=driver.getWindowHandle(); 
		List<String> list=new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(list.get(1));
		
		
	}

}
