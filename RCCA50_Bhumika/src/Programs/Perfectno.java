package Programs;

public class Perfectno 
{ 
	static void perfect(int no,int sum)
	{
		int copy=no;
		for(int i=1;i<no;i++)
		{
			sum=sum+i;
		}
		if(copy==sum)
		System.out.println(copy+"is perfectno");
		else
			System.out.println(copy+"is not a perfectno");
	}

	public static void main(String[] args) 
	{
		perfect(52,0);
	}

}
