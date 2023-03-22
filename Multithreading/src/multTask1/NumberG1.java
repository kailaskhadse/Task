 package multTask1;

public class NumberG1 extends Thread {
int str;
int end;
public NumberG1(int str,int end) {
	this.str=str;
	this.end=end;
}
public void run()
{
	for(int i=str;i<end;i++)
		{
		try {
			sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i+ " "+currentThread().getName());
		i++;
	}
}



}
