package id.ac.undiksha.ais.people;

public class Lecture {
	
	private String lectureID;
	private String lectname;
	private boolean gender;
	private String lectaddress;
	private String lectBirthDate;
	private String Faculty;
	private String Departement;
	private String study;
	
	
	
	public String getLectureID() {
		return lectureID;
	}
	public void setLectureID(String lectureID) {
		this.lectureID = lectureID;
	}
	public String getLectname() {
		return lectname;
	}
	public void setLectname(String lectname) {
		this.lectname = lectname;
	}
	public boolean isGender() {
		return gender;
	}
	
	public String getGender() {
		if(this.isGender()) {
			return "Male";
		} else {
			return "Female";
		}
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getLectaddress() {
		return lectaddress;
	}
	public void setLectaddress(String lectaddress) {
		this.lectaddress = lectaddress;
	}
	public String getLectBirthDate() {
		return lectBirthDate;
	}
	public void setLectBirthDate(String lectBirthDate) {
		this.lectBirthDate = lectBirthDate;
	}
	public String getFaculty() {
		return Faculty;
	}
	public void setFaculty(String faculty) {
		Faculty = faculty;
	}
	public String getDepartement() {
		return Departement;
	}
	public void setDepartement(String departement) {
		Departement = departement;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	
	
	public void printAll() {
		System.out.println(this.lectname);
		System.out.println(this.lectBirthDate);
		if (this.gender)
			System.out.println("Male");
		else 
			System.out.println("Female");
		System.out.println(this.lectaddress);
		System.out.println(this.study);
		System.out.println(this.Faculty);
		System.out.println(this.Departement);


	}
	
	
}
