package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import util.TestUtil;

public class TestBase {
	
	public static WebDriver driver=null;
	public static FileInputStream ip=null;
	public static Properties prop=null;
	
	public TestBase() throws IOException {
		
		prop=new Properties();
		System.getProperty("user.dir");
		//System.getProperty(("user.dir") + "\\src\\json\\Crc.json");
		ip=new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\config\\config.properties");
		
		prop.load(ip);
		
	}

	
	public static void init() {
		
		if(prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		
	}
	
	public void failed() throws IOException {
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(SrcFile, DestFile);
	//	FileHandler.copy(srcfile, new File("C:\\WorkSpace\\BookTicket\\screenShot"));
		FileUtils.copyFile(srcfile, new File("C:\\WorkSpace\\BookTicket\\screenShot\\"+"failshot"+this.getClass().getName()+"_"+".jpg"));
		
	}
	
	}


