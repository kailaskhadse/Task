package Synchronisation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Hello h=new Hello();
            A t1=new A("java",h);
            A t2=new A("classes",h);
            t1.start();
            t2.start();
		/*Hello h1=new Hello();
		Hello h2=new Hello();
		 A t1=new A("java",h1);
         A t2=new A("classes",h1);
         A t3=new A("python",h2);
         A t4=new A("classes2",h2);*/
        
		
	}

}
