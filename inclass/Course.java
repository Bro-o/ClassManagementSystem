package inclass;

import java.util.Scanner;

public class Course extends Major {
	public void getUserInput(Scanner input) {
		System.out.print("Subject:");
		String subject = input.nextLine();
		this.setSubject(subject);

		System.out.print("Class No.:");
		String classNo = input.nextLine();
		this.setClassNo(classNo);

		System.out.print("Class Hour:");
		String classHour = input.nextLine();
		this.setClassHour(classHour);

		System.out.print("Classroom:");
		String classroom = input.nextLine();
		this.setClassroom(classroom);

		System.out.print("Professor:");
		String professor = input.nextLine();
		this.setProfessor(professor);

		System.out.print("Email Adress:");
		String professorEmail = input.nextLine();
		this.setProfessorEmail(professorEmail);

		System.out.print("Phone:");
		String professorPhone = input.nextLine();
		this.setProfessorPhone(professorPhone);
	}
}
