package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

//we can decide execution sequence as per our requirement and less priority number will execute first.
//here priority execution will be - [-122,1,2,3,122]
//if priority are same then method will run alphabetically.
public class PriorityTest extends TestBase{
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		Initiliazation();
		login = new LoginPage();
	}
	
	@Test(priority = 3)
	public void verifyTitleTest1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority = 1)
	public void verifyTitleTest2() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority = 122)
	public void verifyTitleTest3() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority = -122)
	public void verifyTitleTest4() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority = 2)
	public void verifyTitleTest5() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority = 2)
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@AfterMethod
	public void closeBrowser()
	{
	  driver.close();
	}





}
