// SE L2T07

// Class declaration - Blueprint
public class Architect {

	// Attributes
	private String name;
	private String telephone;
	private String emailAddress;
	private String physicalAddress;

	// Generate constructor
	public Architect(String name, String telephone, String emailAddress, String physicalAddress) {
		this.name = name;
		this.telephone = telephone;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}

	// Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	// Generated toString
	public String toString() {
		String output = "Name: " + name;
		output += "\nTelephone: " + telephone;
		output += "\nEmail Address: " + emailAddress;
		output += "\nPhysical Address: " + physicalAddress;

		return output;
	}
}