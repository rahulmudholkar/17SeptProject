package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DemoTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		Initiliazation();
		login = new LoginPage();
	}
	//ivocationCount is used to run single test case multiple time as per the given count.
	@Test (invocationCount = 3,enabled = false)
	public void Test1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	//timeout is used to run the test case within the given time.it is not possible to run in 2 micro sec
	//hence the below test case will fail.
	@Test (timeOut = 2,enabled = false)
	public void Test2() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	//here [in Test3] test case got passed and hence syso statement will get executed.
	@Test (enabled=false)
	public void Test3() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		System.out.println("this is test case of title");
		Assert.assertEquals(actTitle, expTitle);
		Assert.assertTrue(true);
	}
	//[in Test4]in hard assertion if test case got failed,then remaining statement of that will not get 
	//executed coz this assertion makes the method fail,here syso statement will not executed coz assertion is failed.
	//and hence it will not comr to syso statement coz it will stop executing in line 54 asserrt statement.
	@Test (enabled = true)
	public void Test4() throws Exception
	{
		String expTitle = "1Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle,"test case failed yar");
		System.out.println("this is test case of title");
		Assert.assertTrue(true);
	}
	//if test case failed,then we will get "test case failed yar" massage in console.
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
	  driver.close();
	}

}
