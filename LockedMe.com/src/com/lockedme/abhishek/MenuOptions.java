package com.lockedme.abhishek;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("*****************************************************\n"
	            +"*****************************************************\n"
	            + "\n"
				+ "     Welcome to %s.  \n"
	            + "\n"
	            + "     Developer Name : %s.  \n"
	            + "\n"
	            + "*****************************************************\n"
				+ "*****************************************************\n", appName, developerName);
	/*	String appFunction = "You can use this application to :-\n"
				+ "? Retrieve all file names in the \"main\" folder\n"
				+ "? Search, add, or delete files in \"main\" folder.\n"
				+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(companyDetails);

		System.out.println(appFunction); */
		System.out.println(companyDetails);
	}

	public static void displayMenu() {
		String menu = "\n\n Select any option number from below and press Enter \n\n"
				//+ "1)  Retrieve all files inside \"main\" folder\n" 
				+ "1: Get All File Name From \"main\" folder in Sorted Manner\n" 
				//+ "2) Display menu for File operations\n"
				+ "2: For Business Level Operations\n"
				+ "3: Close the Applications\n";
		System.out.println(menu);

	}
//BusinessLevelOperations();
	public static void BusinessLevelOperations() {
		String fileMenu = "\n\n Select any option number from below and press Enter \n\n"
				+ "1: Add a file to \"main\" folder\n"
				+ "2: Delete a file from \"main\" folder\n"
				+ "3: Search for a file from \"main\" folder\n" 
				+ "4: Go Back To Previous Menu\n" ;
				//+ "5: Exit program\n";

		System.out.println(fileMenu);
	}

}

