package switchcase;

import java.util.Scanner;

public class switchcase5 {

	public static void main(String[] args) {
		int a = 14;
		int b = 7;
		int c;
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int d = in.nextInt();
        switch(d) {
        case 1: c = a + b; System.out.println(c);
        break;
        case 2: c = a - b; System.out.println(c);
        break;
        case 3: c = a * b; System.out.println(c);
        break;
        case 4: c = a / b; System.out.println(c);
        break;
        }
	}
}
