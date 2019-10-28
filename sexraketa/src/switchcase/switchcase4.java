package switchcase;

import java.util.Scanner;

public class switchcase4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int month = in.nextInt();
		switch (month) {
		case 1: System.out.println("Січень = " + 30);
				break;
		case 2: System.out.println("Лютий = " + 28);
				break;
		case 3: System.out.println("Березень = " + 31);
				break;
		case 4: System.out.println("Квітень = " + 30);
				break;
		case 5: System.out.println("Травень = " + 31);
				break;
		case 6: System.out.println("Червень = " + 30);
				break;
		case 7: System.out.println("Липень = " + 31);
				break;
		case 8: System.out.println("Серпень = " + 31);
				break;
		case 9: System.out.println("Вересень = " + 30);
				break;
		case 10: System.out.println("Жовтень = " + 31);
				break;
		case 11: System.out.println("Листопад = " + 30);
				break;
		case 12: System.out.println("Грудень = " + 31);
				break;
		}

	}

}
