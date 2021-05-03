package entities;

import java.util.Calendar;

import abstracts.Entity;

public class Gamer implements Entity {
	private int id;
	private String identityId;
	private String firstName;
	private String lastName;
	private Calendar dateOfBirth;

	public Gamer() {
		
	}
	
	public Gamer(int id, String identityId, String firstName, String lastName, Calendar dateOfBirth) {
		this.id = id;
		this.identityId = identityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
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

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
