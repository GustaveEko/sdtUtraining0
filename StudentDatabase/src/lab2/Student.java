package lab2;

public class Student {
	
	private static int  ID =0;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private static final double costOfCourse = 800;
	private double balance = 0;
	private String phone;
	private String city;
	private String State;
	private String courses="";
	
	//Constructor
		public Student(String name, String SSN) {
			ID++;
			this.name = name;
			this.SSN = SSN;
			setEmail();
			setUserID();		}
		/**2-Automatically create an 
       		email ID based on the name*/
		
		
		
		/**as soon as we create a new student we are going to call
		setEmail in the constructor*/
		private void setEmail() {
			email = name.toLowerCase()+"."+ID+"@university.edu";
			System.out.println("Your email is: "+email);
		}
		
		public String getEmail() {
			return email;
		}
		private void setUserID() {
			int max = 9000;
			int min = 1000;
			int randNum = (int) (Math.random()*(max-min));
			randNum = randNum+min;
			userID = ID +""+randNum+""+SSN.substring(5);
			System.out.println("Your user ID is: "+userID);
		}
		
		/**5- Methods: enroll(), pay(), checkBalance(),
		 toString(), showCourses() */
		//when someone enroll, we want them to say what they are enrolling in
		// so in the argument we want to say sString course.
		
		public void enroll(String course){
			this.courses = this.courses+"\n"+course;
			/**In the main let call:
			stu1.enroll("Math101");
			stu1.enroll("English245");and */
			System.out.println(courses);
			balance = balance+costOfCourse;

			}
		public void payTuition(double amount){
			balance = balance-amount;
			System.out.println("Payment: $"+ amount);

			}
		public void checkBalance(){
			System.out.println("Balance: $"+balance);
			}
		public void showCourse(){
			System.out.println(courses);
			}



		@Override
		public String toString() {
			return "Name: " +"\nname"+ userID + ", name=" + name + ", email=" + email + ", balance=" + balance
					+ ", phone=" + phone + ", city=" + city + ", State=" + State + ", courses=" + courses + "]";
		}
		

	

}
