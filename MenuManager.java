import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClassManager classManager = new ClassManager(input);

		int num = -1;
		while(num != 5) {
			System.out.println("---- Class Management System Menu ----");
			System.out.println(" 1. Add Subject");
			System.out.println(" 2. Delete Subject");
			System.out.println(" 3. Edit Subject");
			System.out.println(" 4. View Subjects");
			System.out.println(" 5. Exit");
			System.out.print("Select one number:");
			num = input.nextInt();
			input.nextLine();
			if(num == 1) {
				classManager.addClass();
			}
			else if(num == 2) {
				classManager.deleteClass();
			}
			else if(num == 3) {
				classManager.editClass();
			}
			else if(num == 4) {
				classManager.viewClass();
			}
			else {
				continue;
			}
		}
	}

	
}
