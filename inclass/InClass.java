package inclass;

import java.util.Scanner;

public abstract class InClass implements ClassInput{
	protected ClassKind kind = ClassKind.Major;
	protected String subject;
	protected String classNo;
	protected String classHour;
	protected String classroom;
	protected String professor;
	protected String professorEmail;
	protected String professorPhone;
	
	public InClass() {

	}
	
	public InClass(ClassKind kind) {
		this.kind = kind;
	}
		
	public InClass (String subject, String classHour, String classroom, String professor) {
		this.subject = subject;
		this.classHour = classHour;
		this.classroom = classroom;
		this.professor = professor;
	}
	
	public InClass(ClassKind kind, String subject, String classNo,String classHour, String classroom, String professor, String email, String phone) {
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
	
	public abstract void printInfo();
	public void setSubject(Scanner input) {
		System.out.print("Subject:");
		String subject = input.nextLine();
		this.setSubject(subject);
	}
	
	public void setClassNo(Scanner input) {
		System.out.print("Class No.:");
		String classNo = input.nextLine();
		this.setClassNo(classNo);
	}
	
	public void setClassHour(Scanner input) {
		System.out.print("Class Hour:");
		String classHour = input.nextLine();
		this.setClassHour(classHour);
	}
	
	public void setClassRoom(Scanner input) {
		System.out.print("Classroom:");
		String classroom = input.nextLine();
		this.setClassroom(classroom);
	}
	
	public void setProfessor(Scanner input) {
		System.out.print("Professor:");
		String professor = input.nextLine();
		this.setProfessor(professor);
	}
	
	public void setProfessorEmail(Scanner input) {
		System.out.print("Email Adress:");
		String professorEmail = input.nextLine();
		this.setProfessorEmail(professorEmail);
	}
	
	public void setProfessorPhone(Scanner input) {
		System.out.print("Phone:");
		String professorPhone = input.nextLine();
		this.setProfessorPhone(professorPhone);
	}
	
	public String getKindString() {
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
		return skind;
	}
}
