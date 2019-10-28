package ua.univer.task.ifelse;
import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int month = in.nextInt();
		switch (month) {
		case 1: System.out.println("Січень = " + "Зима");
				break;
		case 2: System.out.println("Лютий = " + "Зима");
				break;
		case 3: System.out.println("Березень = " + "Весна");
				break;
		case 4: System.out.println("Квітень = " + "Весна");
				break;
		case 5: System.out.println("Травень = " + "Весна");
				break;
		case 6: System.out.println("Червень = " + "Літо");
				break;
		case 7: System.out.println("Липень = " + "Літо");
				break;
		case 8: System.out.println("Серпень = " + "Літо");
				break;
		case 9: System.out.println("Вересень = " + "Осінь");
				break;
		case 10: System.out.println("Жовтень = " + "Осінь");
				break;
		case 11: System.out.println("Листопад = " + "Осінь");
				break;
		case 12: System.out.println("Грудень = " + "Зима");
				break;
		}
	}

}
