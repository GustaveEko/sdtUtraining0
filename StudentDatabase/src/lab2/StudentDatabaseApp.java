package lab2;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student std1 = new Student("Janelle", "076890978");
		std1.enroll("Math101");
		std1.enroll("English-245");
		std1.enroll("Infoi-101");
		std1.enroll("Finite Math");
		std1.showCourse();
		std1.checkBalance();
		std1.payTuition(600);
		std1.checkBalance();
		std1.toString();
		
		

	}

}
