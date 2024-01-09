package Programs;

public class Compiletime 
{
	static void submit() throws AgeException
	{
		int age =17;
		if(age>18)
		{
			System.out.println("Application submitted");
		}
		else
		{
			throw new AgeException("invalid age");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
		submit();
	    }
		catch(AgeException e) 
		{
			System.out.println(e.getmsg());
		}
	}
}
class AgeException extends Exception
{
	String msg;
	AgeException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
