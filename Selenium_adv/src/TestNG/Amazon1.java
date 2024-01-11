package TestNG;

import org.testng.annotations.Test;

public class Amazon1 {
	@Test(priority = 2)
	public void search()
	{
		System.out.println("product searched");
	}
	@Test(priority = 1 ,enabled = false)
	public void cart()
	{
		System.out.println("added to cart");
	}
	@Test(priority = 4)
	public void checkout()
	{
		System.out.println("product ordered");
	}

}
