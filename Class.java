
public class Class {
	String subject;
	String classNo;
	String classHour;
	String classroom;
	String professor;
	String professorEmail;
	String professorPhone;
	
	public Class() {
		
	}
	
	public Class (String subject, String classHour, String classroom, String professor) {
		this.subject = subject;
		this.classHour = classHour;
		this.classroom = classroom;
		this.professor = professor;
	}
	
	public Class(String subject, String classNo,String classHour, String classroom, String professor, String email, String phone) {
		this.subject = subject;
		this.classNo = classNo;
		this.classHour = classHour;
		this.classroom = classroom;
		this.professor = professor;
		this.professorEmail = email;
		this.professorPhone = phone;
	}
	
	public void printInfo() {
		System.out.println("subject: " + subject + " classNo: " + classNo + " classHour: "+ classHour +" classroom: " + classroom + " professor: " + professor + " professorEmail: " + professorEmail + " professorPhone: " + professorPhone);
	}

}
