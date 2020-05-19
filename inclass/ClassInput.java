package inclass;

import java.util.Scanner;

import exception.FormatException;

public interface ClassInput {
	public String getSubject();
	
	public void setSubject(String subject);
	
	public void setClassNo(String classNo);
	
	public void setClassHour(String classHour);
	
	public void setClassroom(String classroom) throws FormatException;
	
	public void setProfessor(String professor);
	
	public void setProfessorEmail(String professorEmail) throws FormatException;
	
	public void setProfessorPhone(String professorPhone);
	
	public void getClassInput(Scanner input);
	
	
	public void printInfo();
	
	public void setSubject(Scanner input);
	
	public void setClassNo(Scanner input);
	
	public void setClassHour(Scanner input);
	
	public void setClassRoom(Scanner input);
	
	public void setProfessor(Scanner input);
	
	public void setProfessorEmail(Scanner input);
	
	public void setProfessorPhone(Scanner input);
}
