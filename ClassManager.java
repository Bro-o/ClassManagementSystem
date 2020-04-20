import java.util.ArrayList;
import java.util.Scanner;

public class ClassManager {
	ArrayList<Class> inclasses = new ArrayList<Class>();
	Scanner input;

	ClassManager(Scanner input){
		this.input = input;
	}

	public void addStudent() {
		Class inclass = new Class();

		System.out.print("Subject:");
		inclass.subject = input.nextLine();


		System.out.print("Class No.:");
		inclass.classNo = input.nextLine();

		System.out.print("Class Hour:");
		inclass.classHour = input.nextLine();

		System.out.print("Classroom:");
		inclass.classroom = input.nextLine();

		System.out.print("Professor:");
		inclass.professor = input.nextLine();

		System.out.print("Email Adress:");
		inclass.professorEmail = input.nextLine();

		System.out.print("Phone:");
		inclass.professorPhone = input.nextLine();
		
		inclasses.add(inclass);

	}

	public void deleteStudent() {
		System.out.print("Subject:");
		String subject = input.nextLine();
		int index = -1;
		for(int i = 0; i < inclasses.size(); i++) {
			if(inclasses.get(i).subject.equals(subject)) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			inclasses.remove(index);
			Class.numClassesRegistered--;
			System.out.println("The class " + subject + " is deleted");
		}
		else {
			System.out.println("The class has not been registered");
			return;
		}
		
	}

	public void editStudent() {
		System.out.print("Subject:");
		String subject = input.nextLine();
		for(int i = 0; i < inclasses.size(); i++) {
			Class inclass = inclasses.get(i);
			if(inclass.subject.equals(subject)) {	
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
						inclass.subject = input.nextLine();
					}
					else if(num == 2) {
						System.out.print("Class No.:");
						inclass.classNo = input.nextLine();
					}
					else if(num == 3) {
						System.out.print("Class Hour:");
						inclass.classHour = input.nextLine();
					}
					else if(num == 4) {
						System.out.print("Classroom:");
						inclass.classroom = input.nextLine();
					}
					else if(num == 5) {
						System.out.print("Professor:");
						inclass.professor = input.nextLine();
					}
					else if(num == 6) {
						System.out.print("Email Adress:");
						inclass.professorEmail = input.nextLine();
					}
					else if(num == 7) {
						System.out.print("Phone:");
						inclass.professorPhone = input.nextLine();
					}
					else {
						continue;
					} //if
				} //while
				break;
			} //if
		} //for
		
	}

	public void viewStudents() {
//		System.out.print("Subject:");
//		String subject = ss.nextLine();
		System.out.println("# of registered classes: " + Class.numClassesRegistered);
		for(int i = 0; i < inclasses.size(); i++) {
			inclasses.get(i).printInfo();
		}
	}

}
