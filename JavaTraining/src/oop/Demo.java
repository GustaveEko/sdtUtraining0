package oop;

public class Demo {

	public static void main(String[] args) {
		//person
		//person's attribute/variable/descriptors
		String name = "joe";
		String email ="joe@email.com";
		String phone= "3333333333";
		
		//Action/Activity/Behavior
		System.out.println(name+" is walking");
		System.out.println(name+" is eating");
		
		/**What if we wanted to do this for another person?
		 *maybe we just have to copy and paste the above
		 *and then add the second person's name in place of the joe
		 */
		String name2 = "Sarah";
		String email2 ="sarah@email.com";
		String phone2 = "4444444444";
		
		//Action/Activity/Behavior
//		System.out.println(name2+" is walking");
//		System.out.println(name2+" is eating");
		walking(name2);
		
		// The above is still not an efficient way to do this
		//one best way would be to write a function and minimize codes

	}
	
	private static void walking(String name2) {
		
		
	}

	
	static void eating() {
		System.out.println("eating");
		
	}

}
