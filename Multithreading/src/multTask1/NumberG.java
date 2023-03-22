package multTask1;

public class NumberG {
	int str;
	int end;
	public NumberG(int str,int end) {
		this.str=str;
		this.end=end;
	}
	public void display()
	{
		for(int i=str;i<end;i++)
		{
			System.out.println(i);
			i++;
		}
	}

}
