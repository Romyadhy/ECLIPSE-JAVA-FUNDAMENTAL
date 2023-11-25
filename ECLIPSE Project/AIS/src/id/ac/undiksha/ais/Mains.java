package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Student;
import id.ac.undiksha.ais.people.Lecture;

public class Mains {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setStudentID("1234");
		student1.setName("ANI");
		student1.setBirthDate("1 JANUARY 2020");
		student1.setGender(false);
		student1.setAddress("Singaraja");
		student1.setSmtr(6);
		
		
		student1.printAll();
		System.out.println('\n');
		// System.out.println(null);
		
		Lecture lect1 = new Lecture();
		lect1.setLectureID("21217");
		lect1.setLectname("Mrs.Yanti");
		lect1.setLectBirthDate("23 January 1999");
		lect1.setGender(false);
		lect1.setLectaddress("Gianyar");
		lect1.setFaculty("FTK");
		lect1.setDepartement("Teknik Informatika");
		lect1.setStudy("Aljabar Linear");
		
		lect1.printAll();
		
		
		
//		System.out.println(student1.getStudentID());
//		student1.name = "Gogo";
//		student1.studentID = "2216191";
//		student1.birthDate = "1 January 2000";
//		student1.gender = false;
//		student1.smtr = 6;
//		student1.address = "Singaraja";
//		
//		System.out.println(student1.name);
//		System.out.println(student1.studentID);
//		System.out.println(student1.birthDate);
//		if (student1.gender)
//			System.out.println("Male");
//		else 
//			System.out.println("Female");
//		System.out.println(student1.smtr);
//		System.out.println(student1.address);
		
		

	}

}
