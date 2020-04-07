import java.util.Scanner;

public class ClassManager {
	Class inclass;
	Scanner input = new Scanner(System.in);

	ClassManager(){
		
	}

	public void addStudent() {
		inclass = new Class();

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

	}

	public void deleteStudent() {
		System.out.print("Subject:");
		String subject = input.nextLine();
		if(inclass == null) {
			System.out.println("The class has not been registered");
			return;
		}
		if(inclass.subject.equals(subject)) {
			inclass = null;
			System.out.println("The class is deleted");
		}
	}

	public void editStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Subject:");
		String subject = input.nextLine();
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
				if(num == 1) {
					System.out.print("Subject:");
					inclass.subject = sc.nextLine();
				}
				else if(num == 2) {
					System.out.print("Class No.:");
					inclass.classNo = sc.nextLine();
				}
				else if(num == 3) {
					System.out.print("Class Hour:");
					inclass.classHour = sc.nextLine();
				}
				else if(num == 4) {
					System.out.print("Classroom:");
					inclass.classroom = sc.nextLine();
				}
				else if(num == 5) {
					System.out.print("Professor:");
					inclass.professor = sc.nextLine();
				}
				else if(num == 6) {
					System.out.print("Email Adress:");
					inclass.professorEmail = sc.nextLine();
				}
				else if(num == 7) {
					System.out.print("Phone:");
					inclass.professorPhone = sc.nextLine();
				}
				else {
					continue;
				}
			}
		}
	}

	public void viewStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject:");
		String subject = input.nextLine();
		if(inclass.subject.equals(subject)) {
			inclass.printInfo();
		}
	}

}
