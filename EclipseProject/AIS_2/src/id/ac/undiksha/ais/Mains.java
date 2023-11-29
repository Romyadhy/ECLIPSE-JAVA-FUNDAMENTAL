package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Student;
import id.ac.undiksha.ais.people.Lecture;


public class Mains {

	public static void main(String[] args) {
		
		//Student 1
		Student student1 = new Student();
		student1.setStudentID("1234");
		student1.setName("ANI");
		student1.setBirtDate("1 JANUARY 2020");
		student1.setGender(false);
		student1.setAddress("Singaraja");
		student1.setSmtr(6);
		
		
		System.out.println("STUDENTS");
		System.out.println("------");
		student1.printAll();
		System.out.println("------");
		
		//Student 2
		Student student2 = new Student();
		student2.printAll();
		System.out.println("------");
		
		//Student 3
		Student student3 = new Student(
				"Gojo",
				"10 January 2000",
				true,
				"Gianyar",
				"221510234",
				3
				);
		student3.printAll();
		
		
		
		System.out.println("------");
		System.out.println('\n');
		
		
		System.out.println("LECTURER");
		System.out.println("------");
		
		Lecture lect1 = new Lecture();
		lect1.setLectureID("21217");
		lect1.setName("Mrs.Yanti");
		lect1.setBirtDate("23 January 1999");
		lect1.setGender(false);
		lect1.setAddress("Gianyar");
		lect1.setFaculty("FTK");
		lect1.setDepartement("Teknik Informatika");
		lect1.setStudy("Aljabar Linear");
		
		lect1.printAll();
		
		System.out.println("------");
		
		Lecture lect2 = new Lecture();
		lect2.printAll();
		System.out.println("------");
		Lecture lect3 = new Lecture(
			
			"Giyu",
			"12342947",
			"Gianyar",
			"30 January 1990",
			"FTK",
			"Teknik Informatika",
			"Metode Numerik",
			true
		);
		
		lect3.printAll();
		
		
		
		
		
		
		
		

		
		

	}

}
