package de.piratenpartei.berlin.ldadmin.app.model.lf;

public class LFMember {

	public String email;
	public String accreditation;
	public String lastname;
	public String firstname;
	public String membernumber;
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMembernumber() {
		return membernumber;
	}

	public void setMembernumber(String membernumber) {
		this.membernumber = membernumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccreditation() {
		return accreditation;
	}

	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}

	public LFMember() {
	}

	@Override
	public String toString() {
		return "LFMember [email=" + email + ", accreditation="
				+ accreditation + ", lastname=" + lastname + ", firstname="
				+ firstname + ", membernumber=" + membernumber + "]";
	}

	

}