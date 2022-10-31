package kodlama.io.devs.entities.concretes;

import kodlama.io.devs.entities.abstracts.Entity;

public class Developer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String gsmNumber;

	public Developer() {}

	public Developer(int id, String firstName, String lastName, String eMail, String gsmNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.gsmNumber = gsmNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getGsmNumber() {
		return gsmNumber;
	}

	public void setGsmNumber(String gsmNumber) {
		this.gsmNumber = gsmNumber;
	}
	
}
