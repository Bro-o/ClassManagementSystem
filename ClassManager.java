import java.util.ArrayList;
import java.util.Scanner;

import inclass.ClassKind;
import inclass.Course;
import inclass.Major;

public class ClassManager {
	ArrayList<Major> inclasses = new ArrayList<Major>();
	Scanner input;

	ClassManager(Scanner input){
		this.input = input;
	}

	public void addClass() {
		int kind = 0;
		Major inclass;
		while(kind != 1 && kind !=2) {
			System.out.println("1 for Major");
			System.out.println("2 for Course");
			System.out.println("Select num for Class Kind between 1 and 2: ");
			kind = input.nextInt();
			input.nextLine();
			if(kind == 1) {
				inclass = new Major(ClassKind.Major);
				inclass.getUserInput(input);
				inclasses.add(inclass);
				break;
			}
			else if(kind == 2) {
				inclass = new Course(ClassKind.Course);
				inclass.getUserInput(input);
				inclasses.add(inclass);
				break;
			}
			else {
				System.out.println("Select num for Class Kind between 1 and 2.");
			}
		}
		


	}

	public void deleteClass() {
		System.out.print("Subject:");
		String subject = input.nextLine();
		int index = -1;
		for(int i = 0; i < inclasses.size(); i++) {
			if(inclasses.get(i).getSubject().equals(subject)) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			inclasses.remove(index);
			System.out.println("The class " + subject + " is deleted");
		}
		else {
			System.out.println("The class has not been registered");
			return;
		}
		
	}

	public void editClass() {
		System.out.print("Subject:");
		String subject1 = input.nextLine();
		for(int i = 0; i < inclasses.size(); i++) {
			Major inclass = inclasses.get(i);
			if(inclass.getSubject().equals(subject1)) {	
				int num = -1;
				while(num != 8) {
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
					num = input.nextInt();
					input.nextLine();
					if(num == 1) {
						System.out.print("Subject:");
						String subject = input.nextLine();
						inclass.setSubject(subject);
					}
					else if(num == 2) {
						System.out.print("Class No.:");
						String classNo = input.nextLine();
						inclass.setClassNo(classNo);
					}
					else if(num == 3) {
						System.out.print("Class Hour:");
						String classHour = input.nextLine();
						inclass.setClassHour(classHour);
					}
					else if(num == 4) {
						System.out.print("Classroom:");
						String classroom = input.nextLine();
						inclass.setClassroom(classroom);
					}
					else if(num == 5) {
						System.out.print("Professor:");
						String professor = input.nextLine();
						inclass.setProfessor(professor);
					}
					else if(num == 6) {
						System.out.print("Email Adress:");
						String professorEmail = input.nextLine();
						inclass.setProfessorEmail(professorEmail);
					}
					else if(num == 7) {
						System.out.print("Phone:");
						String professorPhone = input.nextLine();
						inclass.setProfessorPhone(professorPhone);
					}
					else {
						continue;
					} //if
				} //while
				break;
			} //if
		} //for
		
	}

	public void viewClass() {
//		System.out.print("Subject:");
//		String subject = ss.nextLine();
		System.out.println("# of registered classes: " + inclasses.size());
		for(int i = 0; i < inclasses.size(); i++) {
			inclasses.get(i).printInfo();
		}
	}

}
