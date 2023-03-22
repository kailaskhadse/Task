package Inteface.Task2;

public class oracle implements Connection {
	public void commit() {
		System.out.println("commit oracle");
	}
	public void rollback()
	{
		System.out.println("rollback-oracle");
	}
	
	}


