package inclass;

import java.util.Scanner;

public class Course extends InClass{
	
	String examDate;
	String examPlace;
	
	public Course(ClassKind kind) {
		super(kind);
	}
	
	public void getClassInput(Scanner input) {
		setSubject(input);
		
		setClassNo(input);

		setElearningwithYN(input);
		
		setProfessor(input);

		setProfessorEmail(input);

		setProfessorPhone(input);

		char ans = 'x';
		ans = 'x';
		while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N') {
			System.out.println("Does it take exam? (Y/N)");
			ans = input.next().charAt(0);
			input.nextLine();
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
	
	public void setElearningwithYN(Scanner input) {
		char ans = 'x';
		while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N') {
			System.out.println("Is this e-learning class? (Y/N)");
			ans = input.next().charAt(0);
			input.nextLine();
			if(ans == 'y' || ans == 'Y') {
				this.setClassHour("-");
				this.setClassroom("-");
				break;
			}
			else if(ans == 'n' || ans == 'N') {
				setClassHour(input);
				setClassRoom(input);
				break;
			}
		}
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "subject: " + subject + " classNo: " + classNo + " classHour: "+ classHour +" classroom: " + classroom + " professor: " + professor + " professorEmail: " + professorEmail + " professorPhone: " + professorPhone + " examDate: " + examDate + " examPlace: " + examPlace);
	}
	

}
