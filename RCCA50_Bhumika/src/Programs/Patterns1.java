package Programs;

public class Patterns1 {

	public static void main(String[] args) {
		char no='A';
		for (int i= 1; i<=3; i++) 
		{
			for (int j = 1; j <=3; j++) 
			{
				if(j<=i) {
				System.out.print(no+" ");
				}
				no++;
			}
			System.out.println();
		}
	}

}
