package PolymorphisTask1;

public class A {
	int val=5;
	public void print(A obj)
	{
		System.out.println(obj.val);
	}
	public void invoke()
	{
		print(this);
	}
}
