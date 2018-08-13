package association;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private String studentId;
	private String StudentAge;
	private Address address;
	private Contact contact;
	private Department department;
	private ArrayList<Course>course;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(String studentAge) {
		StudentAge = studentAge;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ArrayList<Course> getCourse() {
		return course;
	}
	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", StudentAge=" + StudentAge
				+ ", address=" + address + ", contact=" + contact + ", department=" + department + ", course=" + course
				+ "]";
	}
	
	
}