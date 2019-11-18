package pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {
	
@BeforeMethod
public void  beforeMethod() {
	
	System.out.println("before method ");
	
}

@Test
public static void test1() {
	System.out.println("test case 1 ");
}



@AfterMethod
public void afterMethod() {
	System.out.println("aftermethod ");
}

}
