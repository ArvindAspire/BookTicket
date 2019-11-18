package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice2 {
	

@BeforeMethod
public void  beforeMethod() {
	
	System.out.println("before method animal");
	
}

@Parameters({"animal"})
@Test
public void test1(String animal) {
	System.out.println("test case "+animal);
}


@Test(dataProvider="getdata")
public void test2(String animal) {
	System.out.println("data is "+animal);
	Practice.test1();
	
}


@AfterMethod
public void afterMethod() {
	System.out.println("aftermethod dead");
}

@DataProvider
public  Object[]  getdata() {
	Object[] obj=new Object[2];
	obj[0]="lion";
	obj[1]="tiger";
	
	
	
	return obj;
	
	
	
}

}
