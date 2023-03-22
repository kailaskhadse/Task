package ListTask;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map<String,Account>branch1=new HashMap<>();
		Account account1=new Account();
		account1.setAccountNumber(12345);
		account1.setAccountHolderName("Raj");
		account1.setBalance(5000.0);
		Account account2=new Account();
		account2.setAccountNumber(123456);
		account2.setAccountHolderName("Ravi");
		account2.setBalance(6000.0);
		branch1.put("Account1", account1);
		branch1.put("Account2", account2);
		Map<String,Account>branch2=new HashMap<>();
		Account account3=new Account();
		account3.setAccountNumber(123457);
		account3.setAccountHolderName("Rajiv");
		account3.setBalance(7000.0);
		Account account4=new Account();
		account4.setAccountNumber(123458);
		account4.setAccountHolderName("Rahul");
		account4.setBalance(8000.0);
		branch2.put("Account3", account3);
		branch2.put("Account4", account4);
		List<Map<String,Account>> bank = new ArrayList<>();
		bank.add(branch1);
		
		bank.add(branch2);
		Iterator<Map<String,Account>> itr=bank.iterator();
		while(itr.hasNext()) {
			Map<String, Account>s=itr.next();
			Set<String>key1=branch1.keySet();
			for(String s1:key1) {
				Account v=branch1.get(s1); 
				System.out.println("Account number :"+v.getAccountNumber());
		        System.out.println("Account Holder Name :"+v.getAccountHolderName());
		        System.out.println("Account Balance :"+v.getBalance());
				
			}
		
		}
		/*bank.forEach((br)->
		br.forEach((k,v)-> { System.out.println("Account number :"+v.getAccountNumber());
        System.out.println("Account Holder Name :"+v.getAccountHolderName());
        System.out.println("Account Balance :"+v.getBalance());
		} ));*/
		/*for(Map<String,Account> branch: bank)
		{
			Set<String> Accounts = branch.keySet();
		  for(String acc : Accounts) {
			  Account account = branch.get(acc);
			  System.out.println("Account Holder name "+ account.getAccountHolderName());
			  System.out.println("Account Number "+ account.getAccountNumber());
			  System.out.println("Account Balance"+ account.getBalance());
		  }*/
		
			  
		  }}	
		
	
		

	


