package inclass;

import java.util.Scanner;

public class Course extends Major {
	
	String examDate;
	String examPlace;
	
	public Course(ClassKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Subject:");
		String subject = input.nextLine();
		this.setSubject(subject);

		System.out.print("Class No.:");
		String classNo = input.nextLine();
		this.setClassNo(classNo);

		char ans = 'x';
		while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N') {
			System.out.println("Is this e-learning class? (Y/N)");
			ans = input.next().charAt(0);
			if(ans == 'y' || ans == 'Y') {
				this.setClassHour("-");
				this.setClassroom("-");
			}
			else if(ans == 'n' || ans == 'N') {
				System.out.print("Class Hour:");
				String classHour = input.nextLine();
				this.setClassHour(classHour);

				System.out.print("Classroom:");
				String classroom = input.nextLine();
				this.setClassroom(classroom);

			}
		}
		
		System.out.print("Professor:");
		String professor = input.nextLine();
		this.setProfessor(professor);

		System.out.print("Email Adress:");
		String professorEmail = input.nextLine();
		this.setProfessorEmail(professorEmail);

		System.out.print("Phone:");
		String professorPhone = input.nextLine();
		this.setProfessorPhone(professorPhone);
		
		ans = 'x';
		while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N') {
			System.out.println("Does it take exam? (Y/N)");
			ans = input.next().charAt(0);
			if(ans == 'y' || ans == 'Y') {
				System.out.println("Exam Date:");
				this.examDate = input.nextLine();
				System.out.println("Exam Place:");
				this.examPlace = input.nextLine();
			}
			else if(ans == 'n' || ans == 'N') {
				this.examDate = "-";
				this.examPlace = "-";
			}
		}
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Major:
			skind = "Major";
			break;
		case Course:
			skind = "Course";
			break;
		default:
		}
		System.out.println("kind: " + skind + "subject: " + subject + " classNo: " + classNo + " classHour: "+ classHour +" classroom: " + classroom + " professor: " + professor + " professorEmail: " + professorEmail + " professorPhone: " + professorPhone + " examDate: " + examDate + " examPlace: " + examPlace);
	}
}
