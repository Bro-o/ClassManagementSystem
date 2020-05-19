import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClassManager classManager = new ClassManager(input);

		selectMenu(input, classManager);
	}

	public static void selectMenu(Scanner input, ClassManager classManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				input.nextLine();
				switch(num) {
				case 1:
					classManager.addClass();
					break;
				case 2:
					classManager.deleteClass();
					break;
				case 3:
					classManager.editClass();
					break;
				case 4:
					classManager.viewClass();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("---- Class Management System Menu ----");
		System.out.println(" 1. Add Subject");
		System.out.println(" 2. Delete Subject");
		System.out.println(" 3. Edit Subject");
		System.out.println(" 4. View Subjects");
		System.out.println(" 5. Exit");
		System.out.print("Select one number:");
	}
}
