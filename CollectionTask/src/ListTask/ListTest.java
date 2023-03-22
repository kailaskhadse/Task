package ListTask;

import java.util.*;

public class ListTest{

	public static void main(String[] args) {
		List<Account>branch1=new ArrayList <>();
		Account acc1= new Account();
		acc1.setAccountNumber(12345);
		acc1.setAccountHolderName("abc");
		acc1.setBalance(5000.0);
		Account acc2= new Account();
		acc2.setAccountNumber(123456);
		acc2.setAccountHolderName("abcd");
		acc2.setBalance(5001.0);
		Account acc3= new Account();
		acc3.setAccountNumber(1234567);
		acc3.setAccountHolderName("abcde");
		acc3.setBalance(50010.0);
		branch1.add(acc1);
		branch1.add(acc2);
		branch1.add(acc3);
		List<Account>branch2=new ArrayList <>();
		Account acc4= new Account();
		acc4.setAccountNumber(6789);
		acc4.setAccountHolderName("pqr");
		acc4.setBalance(6000.0);
		Account acc5= new Account();
		acc5.setAccountNumber(67892);
		acc5.setAccountHolderName("pqrs");
		acc5.setBalance(6000.0);
		Account acc6= new Account();
		acc6.setAccountNumber(67890);
		acc6.setAccountHolderName("pqrst");
		acc6.setBalance(60010.0);
		branch2.add(acc4);
		branch2.add(acc4);
		branch2.add(acc6);
		List<List<Account>> Bank=new ArrayList<>();
		Bank.add(branch1);
		Bank.add(branch2);
		/*//iterate element by using Iterator
		  Iterator<List<Account>> itr1=Bank.iterator();
		
		 
		 while(itr1.hasNext())
		{
			List<Account> branch=itr1.next();
			Iterator<Account> itr2=branch.iterator();
			while(itr2.hasNext())
			{
				Account ac=itr2.next();
				System.out.println (ac.getAccountHolderName()+" "+ac.getAccountNumber()+" "+ac.getBalance());
			}
			
		}*/
		 //by using forEach loop or lambda expression
		
		/*Bank.forEach((br)->
		br.forEach((a)-> { System.out.println("Account number :"+a.getAccountNumber());
        System.out.println("Account Holder Name :"+a.getAccountHolderName());
        System.out.println("Account Balance :"+a.getBalance());
		} ));*/
		/*for(List<Account>branch: Bank)
		{
		for(Account a:branch) {
           System.out.println("Account number :"+a.getAccountNumber());
           System.out.println("Account Holder Name :"+a.getAccountHolderName());
           System.out.println("Account Balance :"+a.getBalance());
           
	}


}*/
	}
}