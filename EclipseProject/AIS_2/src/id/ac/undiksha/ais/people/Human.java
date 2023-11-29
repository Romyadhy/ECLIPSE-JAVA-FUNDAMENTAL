package id.ac.undiksha.ais.people;

public class Human {

	private String name;
	private String address;
	private String birthDate;
	private boolean gender;
	
	public Human() {
		this.name = "<please enter the name>";
		this.address = "<please enter the address>";
		this.birthDate = "<please enter the birtdate>";
		this.gender = false;
		
	}

	public Human(String name, String address, String birthDate, boolean gender) {
		super();
		this.name = name;
		this.address = address;
		this.birthDate = birthDate;
		this.gender = gender;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirtDate() {
		return birthDate;
	}

	public void setBirtDate(String birtDate) {
		this.birthDate = birtDate;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		if(isGender()) {
			return "male";
		}
		else {
			return "female";
		}
		
	}

	public void printAll() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(birthDate);
		System.out.println(getGender());
		
	}

}
