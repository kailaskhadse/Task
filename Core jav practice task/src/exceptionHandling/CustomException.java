package exceptionHandling;

public class CustomException {

	public void m1(int age)
	{
		if(age<0)
			throw new AgeInvalidException("Age is not less than zero");
	}
	public static void main(String[] args) {
		CustomException c= new CustomException();
		try{
			c.m1(-10);
			}
		catch(AgeInvalidException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
