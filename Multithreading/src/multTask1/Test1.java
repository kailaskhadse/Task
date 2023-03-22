package multTask1;

public class Test1 {

	public static void main(String[] args) {
		NumberG1 odd=new NumberG1(1,100);
		NumberG1 even=new NumberG1(2,100);
		odd.setName("Odd");
		even.setName("Even");
		odd.start();
	even.start();

	}

}
