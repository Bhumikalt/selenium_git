package Programs;

public class Armstrongno 
{
	static void arm(int no,int sum)
	{
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum = sum+(rem*rem*rem);
			no=no/10;
		}
		if(copy==sum)
		System.out.println(copy+"is armstrong no");
		else
			System.out.println(copy+"is not a armstrong no");
	}
	public static void main(String[] args) 
	{
		arm(289,0);
	}

}
