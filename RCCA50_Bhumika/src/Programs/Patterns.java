package Programs;

public class Patterns {

	public static void main(String[] args)
	{
		int no=1;
		for (int i= 1; i<=3; i++) 
		{
			for (int j = 1; j <=3; j++) 
			{
				if(j<=i) {
				System.out.print(no);
				}
				no++;
			}
			System.out.println();
		}
	}

}
