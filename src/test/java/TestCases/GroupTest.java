package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		Initiliazation();
		login = new LoginPage();
	}
	
	@Test (groups = "smoke")
	public void Test1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups = "sanity")
	public void Test2() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups = "smoke")
	public void Test3() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups = {"sanity","Regression"})
	public void Test4() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups = "smoke")
	public void Test5() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups = { "sanity","Regression"})
	public void Test6() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
	  driver.close();
	}


}
