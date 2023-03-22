package multTask1;

public class JoinDemo extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				System.out.println("child thread "+i);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		JoinDemo j =new JoinDemo();
		j.start();
		j.join(5000);
		for(int i=0;i<=5;i++) {
			try {
				System.out.println("Main thread "+i);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		
		}
		
	}
		
	}