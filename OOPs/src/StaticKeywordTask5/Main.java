package StaticKeywordTask5;

public class Main {

	public static void main(String[] args) {
     Test t = new Test();
     t.nonstaticIncrement();
     Test.staticIncrement();
     t.staticIncrement();

	}

}
