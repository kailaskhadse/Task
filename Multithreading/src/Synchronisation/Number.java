package Synchronisation;

public class Number implements Runnable {
	int st,end;
	public Number(int st,int end) {
		this.st=st;
		this.end=end;
	}
	public void run() {
		for(int i=st;i<=end;i++) {
			try {
				System.out.println(i);
				i++;
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		Number odd = new Number(1,20);
		Number even= new Number(2,20);
		Thread t= new Thread(odd);
		Thread t1=new Thread(even);
		t.start();
		t1.start();
		
	}

}
