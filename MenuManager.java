import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClassManager classManager = getObject("classmanager.ser");
		if(classManager == null) {
				classManager = new ClassManager(input);
		}
		else {
			classManager.setScanner(input);
		}
		
		selectMenu(input, classManager);
		putObject(classManager, "classmanager.ser");
	}

	public static void selectMenu(Scanner input, ClassManager classManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				input.nextLine();
				switch(num) {
				case 1:
					classManager.addClass();
					logger.log("Add a class");
					break;
				case 2:
					classManager.deleteClass();
					logger.log("Delete a class");
					break;
				case 3:
					classManager.editClass();
					logger.log("Edit a class");
					break;
				case 4:
					classManager.viewClass();
					logger.log("View a class");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("---- Class Management System Menu ----");
		System.out.println(" 1. Add Subject");
		System.out.println(" 2. Delete Subject");
		System.out.println(" 3. Edit Subject");
		System.out.println(" 4. View Subjects");
		System.out.println(" 5. Exit");
		System.out.println("Select one number:");
	}
	
	public static ClassManager getObject(String filename) {
		ClassManager classManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			classManager = (ClassManager) in. readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return classManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return classManager;		
	}
	public static void putObject(ClassManager classManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out. writeObject(classManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
