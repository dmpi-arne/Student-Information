package association;

import java.util.ArrayList;

public class Startpoint {

	public static void main(String[] args) {
		
		Address add = new Address("18/I", "12", "Dhaka", "1701");
		//System.out.println(a);
		
		Student s= new Student();
		s.setStudentName("Rabeya");
		s.setStudentId("345");
		//System.out.println(s);
		
		Contact c = new Contact("01954602122", "rabeyaarne1111@gmail.com");
		s.setContact(c);
		//System.out.println(c);
		Department d = new Department("computer", "Academic");
		s.setDepartment(d);
		

		Course cr1 = new Course("computer Fandamental", "cs-01", 04);
		Course cr2 = new Course("Programming language-1", "cs-02", 03);
		Course cr3 = new Course("computer serviceing", "cs-03", 02);
		
		ArrayList<Course>courses = new ArrayList<>();
		courses.add(cr1);
		courses.add(cr2);
		courses.add(cr3);
		s.setCourse(courses);
		System.out.println(s);
	}

}
