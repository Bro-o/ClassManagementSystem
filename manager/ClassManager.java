import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import inclass.ClassInput;
import inclass.ClassKind;
import inclass.Course;
import inclass.Major;

public class ClassManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7929536569071062266L;
	
	ArrayList<ClassInput> inclasses = new ArrayList<ClassInput>();
	transient Scanner input;

	ClassManager(Scanner input){
		this.input = input;
	}

	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addClass() {
		int kind = 0;
		ClassInput classInput;
		while(kind != 1 && kind !=2) {
			try {
				System.out.println("1 for Major");
				System.out.println("2 for Course");
				System.out.println("Select num for Class Kind between 1 and 2: ");
				kind = input.nextInt();
				input.nextLine();
				if(kind == 1) {
					classInput = new Major(ClassKind.Major);
					classInput.getClassInput(input);
					inclasses.add(classInput);
					break;
				}
				else if(kind == 2) {
					classInput = new Course(ClassKind.Course);
					classInput.getClassInput(input);
					inclasses.add(classInput);
					break;
				}
				else {
					System.out.println("Select num for Class Kind between 1 and 2.");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 2");
				if(input.hasNext()) {
					input.next();
				}
				kind = 0;
			}
		}
		
	}

	public void deleteClass() {
		System.out.print("Subject:");
		String subject = input.nextLine();
		int index = findIndex(subject);
		
		removefromoClasses(index, subject);
		
	}
	
	public int findIndex(String subject) {
		int index = -1;
		for(int i = 0; i < inclasses.size(); i++) {
			if(inclasses.get(i).getSubject().equals(subject)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromoClasses(int index, String subject) {
		if(index >= 0) {
			inclasses.remove(index);
			System.out.println("The class " + subject + " is deleted");
			return 1;
		}
		else {
			System.out.println("The class has not been registered");
			return -1;
		}
	}

	public void editClass() {
		System.out.print("Subject:");
		String subject1 = input.nextLine();
		for(int i = 0; i < inclasses.size(); i++) {
			ClassInput inclass = inclasses.get(i);
			if(inclass.getSubject().equals(subject1)) {	
				int num = -1;
				while(num != 8) {
					showEditMenu();
					num = input.nextInt();
					input.nextLine();
					switch(num) {
					case 1:
						inclass.setSubject(input);
						break;
					case 2:
						inclass.setClassNo(input);
						break;
					case 3:
						inclass.setClassHour(input);
						break;
					case 4:
						inclass.setClassRoom(input);
						break;
					case 5:
						inclass.setProfessor(input);
						break;
					case 6:
						inclass.setProfessorEmail(input);
						break;
					case 7:
						inclass.setProfessorPhone(input);
						break;
					default:
						continue;	
					}
				} //while
				break;
			} //if
		} //for
		
	}

	public void viewClass() {
		System.out.println("# of registered classes: " + inclasses.size());
		for(int i = 0; i < inclasses.size(); i++) {
			inclasses.get(i).printInfo();
		}
	}
	

	public void showEditMenu() {
		System.out.println("--- Class Info Edit Menu ---");
		System.out.println(" 1. Edit Subject");
		System.out.println(" 2. Edit Class No.");
		System.out.println(" 3. Edit Class Hour");
		System.out.println(" 4. Edit Classroom");
		System.out.println(" 5. Edit Professor");
		System.out.println(" 6. Edit Professor Email");
		System.out.println(" 7. Edit Professor Phone");
		System.out.println(" 8. Exit");
		System.out.print("Select one number:");
	}

}
