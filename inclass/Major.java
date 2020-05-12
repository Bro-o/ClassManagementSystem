package inclass;

import java.util.Scanner;

public class Major extends InClass{
	
	public Major(ClassKind kind) {
		super(kind);
	}
	
	public void getClassInput(Scanner input) {
		setSubject(input);

		setClassNo(input);

		setClassHour(input);
		
		setClassRoom(input);

		setProfessor(input);

		setProfessorEmail(input);

		setProfessorPhone(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "subject: " + subject + " classNo: " + classNo + " classHour: "+ classHour +" classroom: " + classroom + " professor: " + professor + " professorEmail: " + professorEmail + " professorPhone: " + professorPhone);
	}
}
