package id.ac.undiksha.ais.people;

public class Lecture extends Human{
	
	private String lectureID; 
	private String Faculty;
	private String Departement;
	private String study;
	
	public Lecture() {
        super();
        this.lectureID = "Please input your user ID";
        this.Faculty= "Please input your Faculty";
        this.Departement = "Please input the departemaent";
        this.study = "Please input the study";
    }

	public Lecture(
			String name, 
			String lectureID, 
			String address, 
			String birthDate,
			String faculty, 
			String departement, 
			String study,
			boolean gender) 
	{
		super(name, address, birthDate, gender);
		this.lectureID = lectureID;
		this.Faculty = faculty;
		this.Departement = departement;
		this.study = study;
		
	}

	public String getLectureID() {
		return lectureID;
	}

	public void setLectureID(String lectureID) {
		this.lectureID = lectureID;
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
	
	@Override
    public void printAll() {
        super.printAll();
        System.out.println(this.lectureID);
        System.out.println(this.Faculty);
        System.out.println(this.Departement);
        System.out.println(this.study);
   }
	
	
	
	
	
	
	
	
	
}
