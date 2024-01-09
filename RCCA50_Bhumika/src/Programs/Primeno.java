package Programs;

public class Primeno 
{
	static void prime(int no)
	{
		int count = 0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println(no+"is primeno");
		else
			System.out.println(no+"is not a primeno");
	}

	public static void main(String[] args) 
	{
		
		prime(53);
	}

}
