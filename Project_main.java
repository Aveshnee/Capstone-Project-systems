// SE L2T07
// Capstone Poised Project Management

// Packages to import
import java.util.ArrayList;

import javax.swing.JOptionPane;

// OOP - Project System Main driver
public class Project_main {

	// Main - Driver
	public static void main(String[] args) {
		// Create Array list to store user input
		ArrayList<Project> projects = new ArrayList<Project>();

		// While loop to go through the Choices
		// int endOption = 5;
		while (true) {
			String choice = input("Select your choice:\n" + "1. Add a project\n" + "2. Update deadline\n"
					+ "3. Update fees\n" + "4. Update Contractor details\n" + "5. Exit\n" + "");

			if (choice.equals("1")) {
				createProject(projects);

			} else if (choice.equals("2")) {
				updateDeadline(projects);

			} else if (choice.equals("3")) {
				updateFee(projects);

			} else if (choice.equals("4")) {
				updateContractor(projects);

			} else if (choice.equals("5")) {
				// Exit the while loop

			} else {
				// Invalid input
			}
		}
	}

	private static void createProject(ArrayList<Project> projects) {
		// Read the user's input
		// Add a project
		int projectNum = Integer.parseInt(input("What is the project number? "));
		String projectName = input("\nWhat is the project name? ");
		String typeOfBuilding = input("What is the type of building? ");
		String physicalAddress = input("What is the physical address? ");
		int erfNum = Integer.parseInt(input("What is the erf number? "));
		int totalFee = Integer.parseInt(input("What is the total fees? "));
		int totalPaidalready = Integer.parseInt(input("What is the fees paid already? "));
		String deadline = input("What is the deadline/ due date? ");

		String[] details = getDetails("architect");
		Architect architect = new Architect(details[0], details[1], details[2], details[3]);

		String[] details1 = getDetails("contractor");
		Contractor contractor = new Contractor(details[0], details[1], details[2], details[3]);

		String[] details2 = getDetails("customer");
		Customer customer = new Customer(details[0], details[1], details[2], details[3]);

		// Constructor
		// Call the project object to create a new project
		Project proj = new Project(projectNum, projectName, typeOfBuilding, physicalAddress, erfNum, totalFee,
				totalPaidalready, deadline, architect, contractor, customer);

		projects.add(proj);
		System.out.println("New Project added: \n" + proj);
	}

	public static String[] getDetails(String role) {
		String name = input("Enter the name of the " + role);
		String telephone = input("Enter the telephone of the " + role);
		String emailAddress = input("Enter the email address of the " + role);
		String contrPhysicalAddress = input("Enter the address of the " + role);

		String[] contents = { name, telephone, emailAddress, contrPhysicalAddress };
		return contents;
	}

	private static void updateDeadline(ArrayList<Project> projects) {
		// Update Deadline date
		// Using index and set method
		int index = Integer.parseInt(input("To adjust the deadline date, select the project index? "));
		String deadline1 = input("What is the new deadline date? ");
		// Get an index reference to the actual object using the ArrayList
		Project proj1 = projects.get(index);
		proj1.setDeadline(deadline1);
	}

	private static void updateFee(ArrayList<Project> projects) {
		// Update Fee paid already
		// Using index and set method
		int index1 = Integer.parseInt(input("To adjust the fee paid already, select the project index? "));
		int totalPaidalready1 = Integer.parseInt(input("What is the adjusted fees paid already? "));
		// Get an index reference to the actual object using the ArrayList
		Project proj2 = projects.get(index1);
		proj2.setTotalPaidalready(totalPaidalready1);
		System.out.println("Deadline date and the Total fee paid adjusted: \n" + projects);
	}

	private static void updateContractor(ArrayList<Project> projects) {
		// Update Contractor contact details
		// Using index and set method
		int index2 = Integer.parseInt(input("To change the contractor contact details, select the project index? "));

		String[] details = getDetails("contractor");
		Contractor newContractor = new Contractor(details[0], details[1], details[2], details[3]);

		// Get an index reference to the actual object using the ArrayList
		Project proj2 = projects.get(index2);
		proj2.setContractor(newContractor);
		System.out.println("Contractor contact details changed: \n" + projects);
	}

	// To get USER INPUT using JOptionsPane
	public static String input(String message) {
		return JOptionPane.showInputDialog(null, message);
	}
}
