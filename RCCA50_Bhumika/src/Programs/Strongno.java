package Programs;

public class Strongno 
{
	static void strong(int no)
	{
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			int fact =1;
			for(int i=rem;i>=1;i--)
			{
				fact= fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println(copy+"is a strong no");
		}
		else
		{
			System.out.println(copy+"is a weak no");
	}}
	public static void main(String[] args) 
	{
		strong(109);
	}

}
