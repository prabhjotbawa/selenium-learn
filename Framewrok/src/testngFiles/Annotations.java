package testngFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeMethod
	
	public void UseridGeneration()
	{
		System.out.println("ID generated");
	}
	
	@AfterMethod
	public void Reportadding()
	{
		System.out.println("ID removed");
	}
	
	
@BeforeTest
	
	public void DeleteCookies()
	{
		System.out.println("Cookies deleted");
	}
	
@AfterTest

public void Cookies()
{
	System.out.println("Cookies deleted after tests");
}
	@Test
	public void OpeningBrowser()
	{
		System.out.println("test");
	}
	
	@Test
	public void FlightBooking()
	{
		System.out.println("Flight booked");
	}
	

}
