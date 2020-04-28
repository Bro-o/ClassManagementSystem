package inclass;

import java.util.Scanner;

public class Major {
	protected ClassKind kind = ClassKind.Major;
	protected String subject;
	protected String classNo;
	protected String classHour;
	protected String classroom;
	protected String professor;
	protected String professorEmail;
	protected String professorPhone;
	
	public Major() {

	}
	
	public Major(ClassKind kind) {
		this.kind = kind;
	}
		
	public Major (String subject, String classHour, String classroom, String professor) {
		this.subject = subject;
		this.classHour = classHour;
		this.classroom = classroom;
		this.professor = professor;
	}
	
	public Major(ClassKind kind, String subject, String classNo,String classHour, String classroom, String professor, String email, String phone) {
		this.kind = kind;
		this.subject = subject;
		this.classNo = classNo;
		this.classHour = classHour;
		this.classroom = classroom;
		this.professor = professor;
		this.professorEmail = email;
		this.professorPhone = phone;
	}
	
	public ClassKind getKind() {
		return kind;
	}

	public void setKind(ClassKind kind) {
		this.kind = kind;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getClassHour() {
		return classHour;
	}

	public void setClassHour(String classHour) {
		this.classHour = classHour;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getProfessorEmail() {
		return professorEmail;
	}

	public void setProfessorEmail(String professorEmail) {
		this.professorEmail = professorEmail;
	}

	public String getProfessorPhone() {
		return professorPhone;
	}

	public void setProfessorPhone(String professorPhone) {
		this.professorPhone = professorPhone;
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
		System.out.println("kind: " + skind + "subject: " + subject + " classNo: " + classNo + " classHour: "+ classHour +" classroom: " + classroom + " professor: " + professor + " professorEmail: " + professorEmail + " professorPhone: " + professorPhone);
	}
	
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
