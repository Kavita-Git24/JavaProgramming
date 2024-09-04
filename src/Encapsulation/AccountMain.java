package Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		a1.setAccno(101);
		a1.setName("John");
		a1.setAmount(56000);
		
		System.out.println(a1.getAccno());
		System.out.println(a1.getName());
		System.out.println(a1.getAmount());
	}

}
