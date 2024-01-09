package Programs;

public class Palindrome 
{	
	static void Numberpalin(int no)
	{
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(copy==rev)
		{
			System.out.println("number palindrome");
		}
		else 
		{
			System.out.println("not a number palindrome");
		}
	}
	
	public static void main(String[] args)
	{
		Numberpalin(171);
	}

}
