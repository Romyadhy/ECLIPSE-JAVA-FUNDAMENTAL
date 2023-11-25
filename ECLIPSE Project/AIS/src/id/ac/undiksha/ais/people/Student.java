package id.ac.undiksha.ais.people;

public class Student {

	
		private String studentID;
		private String name;
		private String birthDate;
		private boolean gender; //0=Female, 1=Male
		private String address;
		private int smtr;
		
		public String getStudentID() {
			return this.studentID;
		}
		
		public void setStudentId(String studentId) {
			this.studentID = studentId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
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

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getSmtr() {
			return smtr;
		}

		public void setSmtr(int smtr) {
			this.smtr = smtr;
		}

		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}

	public void printAll() {
		System.out.println(this.name);
		System.out.println(this.studentID);
		System.out.println(this.birthDate);
		if (this.gender)
			System.out.println("Male");
		else 
			System.out.println("Female");
		System.out.println(this.smtr);
		System.out.println(this.address);


	}

}
