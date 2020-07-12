// SE L2T07

// Class declaration - Blueprint
public class Customer {

	// Attributes
	private String name;
	private String telephone;
	private String emailAddress;
	private String physicalAddress;

	// Constructor
	public Customer(String name, String telephone, String emailAddress, String physicalAddress) {
		this.name = name;
		this.telephone = telephone;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}

	// Getters and Setters
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

	// toString print method
	public String toString() {
		String output = "Name: " + name;
		output += "\nTelephone: " + telephone;
		output += "\nEmail Address: " + emailAddress;
		output += "\nPhysical Address: " + physicalAddress + "\n";

		return output;
	}
}