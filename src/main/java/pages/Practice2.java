package pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {
	
@BeforeMethod
public void  beforeMethod() {
	
	System.out.println("before method animal");
	
}

@Test
public void test1() {
	System.out.println("test case 1 dog");
}

@Test
public void test2() {
	System.out.println("test case 2 cat");
}


@AfterMethod
public void afterMethod() {
	System.out.println("aftermethod dead");
}

}
