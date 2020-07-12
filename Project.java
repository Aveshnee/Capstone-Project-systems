// SE L2T07

// Class declaration - Blueprint
public class Project {

	// Properties, Attributes
	private int projectNum;
	private String projectName;
	private String typeOfBuilding;
	private String physicalAddress;
	private int erfNum;
	private int totalFee;
	private int totalPaidalready;
	private String deadline;

	private Architect architect;
	private Contractor contractor;
	private Customer customer;

	// Constructor
	public Project(int projectNum, String projectName, String typeOfBuilding, String physicalAddress, int erfNum,
			int totalFee, int totalPaidalready, String deadline, Architect architect, Contractor contractor,
			Customer customer) {
		this.projectNum = projectNum;
		this.projectName = projectName;
		this.typeOfBuilding = typeOfBuilding;
		this.physicalAddress = physicalAddress;
		this.erfNum = erfNum;
		this.totalFee = totalFee;
		this.totalPaidalready = totalPaidalready;
		this.deadline = deadline;
		this.architect = architect;
		this.contractor = contractor;
		this.customer = customer;
	}

	// Getters and Setters
	public int getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTypeOfBuilding() {
		return typeOfBuilding;
	}

	public void setTypeOfBuilding(String typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public int getErfNum() {
		return erfNum;
	}

	public void setErfNum(int erfNum) {
		this.erfNum = erfNum;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public int getTotalPaidalready() {
		return totalPaidalready;
	}

	public void setTotalPaidalready(int totalPaidalready) {
		this.totalPaidalready = totalPaidalready;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public Architect getArchitect() {
		return architect;
	}

	public void setArchitect(Architect architect) {
		this.architect = architect;
	}

	public Contractor getContractor() {
		return contractor;
	}

	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	// toString print method
	public String toString() {
		return "Project Number: " + projectNum + "\n" + "Project Name: " + projectName + "\n" + "Type of building: "
				+ typeOfBuilding + "\n" + "ERF Number: " + erfNum + "\n" + "Physical Address: " + physicalAddress + "\n"
				+ "Total fee charged for project: " + totalFee + "\n" + "Total amount already paid: " + totalPaidalready
				+ "\n" + "Deadline of the project: " + deadline + "\n" + "\nArchitect details: \n" + architect + "\n"
				+ "\nContractor details: \n" + contractor + "\n" + "\nCustomer details: \n" + customer;
	}
}
