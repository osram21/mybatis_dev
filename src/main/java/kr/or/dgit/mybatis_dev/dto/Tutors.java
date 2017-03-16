package kr.or.dgit.mybatis_dev.dto;

import java.util.List;

public class Tutors {
	private int tutorId;
	private String name;
	private String email;
	private Address address;
	private List<Course> courses;
	private Gender gender;
	private PhoneNumber phone;
	
	public Tutors(int tutorId, String name, String email, Address address, List<Course> courses, Gender gender,
			PhoneNumber phone) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.courses = courses;
		this.gender = gender;
		this.phone = phone;
	}
	

	public Tutors(int tutorId, String name, String email, Gender gender, PhoneNumber phone) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
	}


	public PhoneNumber getPhone() {
		return phone;
	}


	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}


	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return String.format("[%s, %s, %s, %s, %s]", tutorId, name, email, address, courses);
	}
	
	
	
}
