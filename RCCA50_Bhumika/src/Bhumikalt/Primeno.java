package Bhumikalt;

public class Primeno 
{
public static void main(String[] args) 
{
	int no=5;
	int count =0;
	for(int i=1;i<=no;i++)
	{
		if(no%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(no+"is a prime number");
	}
	else
	{
		System.out.println(no+"is not a prime number");
	}
}
}
