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
		System.out.print("Subject:");
		String subject = input.nextLine();
		if(inclass.subject.equals(subject)) {	
			System.out.println("The class to be edited is " + subject);
		}
	}
	
	public void viewStudent() {
		System.out.print("Subject:");
		String subject = input.nextLine();
		if(inclass.subject.equals(subject)) {
			inclass.printInfo();
		}
	}

}
