// SE L2T07

// Class declaration - Blueprint
public class Contractor {

	// Attributes - Fields - Properties
	private String name;
	private String telephone;
	private String emailAddress;
	private String contrPhysicalAddress;

	// Constructor
	public Contractor(String name, String telephone, String emailAddress, String contrPhysicalAddress) {
		this.name = name;
		this.telephone = telephone;
		this.emailAddress = emailAddress;
		this.contrPhysicalAddress = contrPhysicalAddress;
	}

	// Getters and setters
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

	public String getContrPhysicalAddress() {
		return contrPhysicalAddress;
	}

	public void setContrPhysicalAddress(String contrPhysicalAddress) {
		this.contrPhysicalAddress = contrPhysicalAddress;
	}

	public static Contractor get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	// toStrings print method
	public String toString() {

		String output = "Name: " + name;
		output += "\nTelephone: " + telephone;
		output += "\nEmail Address: " + emailAddress;
		output += "\nPhysical Address: " + contrPhysicalAddress;

		return output;
	}

}
