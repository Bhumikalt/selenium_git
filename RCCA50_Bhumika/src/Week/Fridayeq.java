package Week;

public class Fridayeq 
{

	public static void main(String[] args) 
	{

		Friday f = new Friday();
		System.out.println(f.hashCode());
		
		Friday f1= new Friday();
		System.out.println(f1.hashCode());
		 
		System.out.println(f.equals(f1));

	}

}
