package id.ac.undiksha.ais.people;

public class Student extends Human{

	
		private String studentID;
//		private String name;
//		private String birthDate;
//		private boolean gender; //0=Female, 1=Male
//		private String address;
		private int smtr;
		
		
		
		public Student() {
			this.studentID = "<please insert the student ID>";
			this.smtr = 0;
		
	
		}
		
		
		
		public Student(
				String name, 
				String birthDate, 
				boolean gender, 
				String address,
				String studentID, 
				int smtr) 
		{
			super(name, birthDate, address, gender);
			this.studentID = studentID;
			this.smtr = smtr;
		}
		
		





		public String getStudentID() {
			return this.studentID;
		}
		
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		
//		public void setStudentId(String studentId) {
//			this.studentID = studentId;
//		}

//		public String getName() {
//			return name;
//		}

//		public void setName(String name) {
//			this.name = name;
//		}

//		public String getBirthDate() {
//			return birthDate;
//		}
//
//		public void setBirthDate(String birthDate) {
//			this.birthDate = birthDate;
//		}

//		public boolean isGender() {
//			return gender;
//		}
		
//		public String getGender() {
//			if(this.isGender()) {
//				return "Male";
//			} else {
//				return "Female";
//			}
//		}

//		public void setGender(boolean gender) {
//			this.gender = gender;
//		}
//
//		public String getAddress() {
//			return address;
//		}
//
//		public void setAddress(String address) {
//			this.address = address;
//		}

		public int getSmtr() {
			return smtr;
		}

		public void setSmtr(int smtr) {
			this.smtr = smtr;
		}

		
		
	
		@Override
	public void printAll() {
		super.printAll();		
		System.out.println(this.studentID);
		System.out.println(this.smtr);



	}

}
