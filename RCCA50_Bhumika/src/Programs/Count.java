package Programs;

public class Count
{
	public static void main(String[] args)
	{
	  int num =22923;
	  int count =0;
	  while(num!=0)
	   {
	    int rem = num%10;
	    
	    count++;
	    num=num/10;
	   }
       System.out.println(count);
	} 
}
