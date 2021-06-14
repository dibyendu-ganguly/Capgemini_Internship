/**
 * 
 */
package com.capgemini.cmapp.model;

/**
 * @author DIBYENDU
 *
 */
public class Contact {

	/**
	 * declaring class variables
	 */
	private String fName;
	private String lName;
	private String phNo;
	/**
	 * default constructor
	 */
	public Contact() {
		super();
	}
	/**
	 * parameterized constructor
	 * @param fName stores the first name of contact
	 * @param lName stores last name of contact
	 * @param phNo stores phone number of contact
	 */
	public Contact(String fName, String lName, String phNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phNo = phNo;
	}
	/**
	 * getfName method retrieves the first name of contact
	 * @return first name
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * setfName method sets first name of contact to fName
	 * @param fName 
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * getlName method retrieves the last name of contact
	 * @return lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * setlName method sets last name of contact to lName
	 * @param lName
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * getPhNo method retrieves the phone number of contact
	 * @return phNo
	 */
	public String getPhNo() {
		return phNo;
	}
	/**
	 * setPhNo method sets phone number of contact to phNo
	 * @param phNo
	 */
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	/**
	 * overriding the hashCode method of the Object class
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((phNo == null) ? 0 : phNo.hashCode());
		return result;
	}
	/**
	 * overriding equals method of Object class
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (phNo == null) {
			if (other.phNo != null)
				return false;
		} else if (!phNo.equals(other.phNo))
			return false;
		return true;
	}
	/**
	 * overriding the toString method of Object class
	 */
	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", phNo=" + phNo + "]";
	}
	/**
	 * checks whether first name is valid or not
	 */
	public void validateFirstName() {
		// TODO Auto-generated method stub
		if(this.fName.isEmpty()){
			throw new RuntimeException("First Name cannot be null or empty");
		}
	}
	/**
	 * checks whether last name is valid or not
	 */
	public void validateLastName() {
		// TODO Auto-generated method stub
		if(this.lName.isEmpty()){
			throw new RuntimeException("Last Name cannot be null or empty");
		}
	}
	/**
	 * checks whether the phone number is valid or not
	 */
	public void validatePhNo() {
		// TODO Auto-generated method stub
		if(this.phNo.isEmpty()){
			throw new RuntimeException("Phone No cannot be null or empty");
		}
		if(this.phNo.length()!=11){
			throw new RuntimeException("Phone No should be 10 digits long");
		}
		if(!this.phNo.matches("\\d+")){
			throw new RuntimeException("Phone No can contain only digits");
		}
		if(!this.phNo.startsWith("0")){
			throw new RuntimeException("Phone No should start with 0");
		}
	}
	
}