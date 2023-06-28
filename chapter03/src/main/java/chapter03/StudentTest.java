package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1 = s1; 	// Upcasting(암시적, implicity)
		p1.setName("둘리");
		
		Student s2 = (Student)p1;	// Downcasting(명시적, explicity) 
		s2.setMajor("Computer Science");
		
		// ((Student)p1).setMajor("computer Science2");
	}

}
