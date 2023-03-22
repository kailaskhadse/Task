package Synchronisation;

public class Demo extends Thread {
	String msg;
	public Demo(String msg) {
		this.msg=msg;
	}
	public synchronized void dispaly() {
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
		
	}
	public void run()
	{
		dispaly();
	}
	public static void main(String[] args) {
		Demo d1= new Demo("java");
		Demo d2= new Demo("c sharp");
		d1.start();
		d2.start();
	}

}
