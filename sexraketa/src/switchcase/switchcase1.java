package switchcase;

import java.util.Scanner;

public class switchcase1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int day = in.nextInt();
        switch(day) {
        case 1: System.out.println("Monday");
        break;
        case 2: System.out.println("Thusday");
        break;
        case 3: System.out.println("Wednesday");
        break;
        case 4: System.out.println("Thursday");
        break;
        case 5: System.out.println("Friday");
        break;
        case 6: System.out.println("Saturday");
        break;
        case 7: System.out.println("Sunday");
        break;
        
        }

	}

}
