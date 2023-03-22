package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo { 

	public void m1() throws IOException {
		FileReader r1= new FileReader("abc.txt");
	}
	public static void main(String[] args) {
		ThrowsDemo t=new ThrowsDemo();
		try {
			t.m1();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
