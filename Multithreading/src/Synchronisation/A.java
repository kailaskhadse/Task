package Synchronisation;

public class A extends Thread {
	Hello h;
	
	String msg;
	public A(String msg,Hello h)
	{
		this.msg=msg;
		this.h=h;
		
		
	}
	public void run(){
		h.display(msg);
		
		
	}

}
