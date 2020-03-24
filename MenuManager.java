import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		while(num != 6) {
			System.out.println("---- Class Management System Menu ----");
			System.out.println(" 1. Add Subject");
			System.out.println(" 2. Delete Subject");
			System.out.println(" 3. Edit Subject");
			System.out.println(" 4. View Subject");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number:");
			num = input.nextInt();
			if(num == 1) {
				addStudent();
			}
			else if(num == 2) {
				deleteStudent();
			}
			else if(num == 3) {
				editStudent();
			}
			else if(num == 4) {
				viewStudent();
			}
			else {
				continue;
			}
		}
	}
	public static void addStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject:");
		String subject = input.nextLine();
		
		System.out.print("Class No.:");
		String classNo = input.nextLine();
		
		System.out.print("Class Hour:");
		String classHour = input.nextLine();
		
		System.out.print("Classroom:");
		String classroom = input.nextLine();
		
		System.out.print("Professor:");
		String professor = input.nextLine();
		
		System.out.print("Email Adress:");
		String professorEmail = input.nextLine();
		
		System.out.print("Phone:");
		String professorPhone = input.nextLine();
		
	}
	
	public static void deleteStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject:");
		String subject = input.nextLine();
	}
	
	public static void editStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject:");
		String subject = input.nextLine();
	}
	
	public static void viewStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject:");
		String subject = input.nextLine();
	}
	
}
