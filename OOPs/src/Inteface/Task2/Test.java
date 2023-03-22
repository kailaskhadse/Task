package Inteface.Task2;

public class Test {

	public static void main(String[] args) {
		Connection c = new Mysql();
		c.commit();
		c.rollback();
		Connection c1= new oracle();
		c1.commit();
		c1.rollback();

	}

}
