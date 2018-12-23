package labs;

import java.util.Scanner;

public class BankAccount {
	//---1---Properties of bank Account:
	/** We want to implement the Encapsulation by making all these methods private
	 * This will make sure that other class don't get access to these methods
	 *  except the one we provide.
	 */
	private static int ID = 1000;
	private String accountNumber;
	private static final String routingNumber = "0985674";
	private String name;
	private String SSN;
	private String balance;
	
	//2 set our Constructor:
	public BankAccount(/**we are going to take their SSN like so:
	 * @return */ String SSN){
	      /**we use the SSN to generage the account Number, which is a combination of 
	ID+random 2-digit number+ first 2 of the SSN*/
	//So
	
	this.SSN = SSN;

	/**In the main let test this by typing the following: BankAccount acc1 = new BankAccount("234658970")*/
	    /**We want to have a unique ID for each person's
	account so we want the ID to be Static */
	//Everytime we create a new account, we want to increment ID++
	ID++;
	
	setAccountNumber();
	

	   }
	private void setAccountNumber(){
	     // generating the account Number
		int random = (int) (Math.random()*100);
		accountNumber = ID+""+random+""+SSN.substring(0, 2);
		System.out.println("Your Account Number: "+accountNumber);
	    }
	public void setName(String name) {
		this.name =name;
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter your full name: ");
//		String fullName = input.nextLine();
	}
	public String getName() {
		return name;
	
	}
	

}
