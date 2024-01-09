package Bhumikalt;

public class Factorial 
{
static void facto(int no) 
{
int fact =1;
for(int i=1;i<=no;i++)
{
	fact=fact*i;
}
System.out.println(fact);
}
public static void main(String[] args) 
{
	facto(6);
}
}

