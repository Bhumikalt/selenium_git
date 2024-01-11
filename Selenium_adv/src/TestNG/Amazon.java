package TestNG;

import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void search()
	{
		System.out.println("product searched");
	}
	@Test
	public void cart()
	{
		System.out.println("added to cart");
	}
	@Test
	public void checkout()
	{
		System.out.println("product ordered");
	}
}
