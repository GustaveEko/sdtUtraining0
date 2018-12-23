package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("234658970");
		BankAccount acc2 = new BankAccount("234658972");
		BankAccount acc3 = new BankAccount("234658973");
		
		acc1.setName("Jim Carter");
		System.out.println(acc1.getName());

	}

}
