package Inheritance.SuperAndThistask6;

public class Illustation {
	int value=5;
	public void print(Illustation ref)
	{
		System.out.println("ob.value="+ref.value);
		
	}
	public void invoke()
	{
      print(this);
	
	}

}
