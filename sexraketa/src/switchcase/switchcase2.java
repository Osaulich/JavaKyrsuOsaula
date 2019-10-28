package switchcase;

import java.util.Scanner;

public class switchcase2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int K = in.nextInt();
        switch(K) {
        case 1: System.out.println("Плохо");
        break;
        case 2: System.out.println("Неудовлетварительно");
        break;
        case 3: System.out.println("Удовлетварительно");
        break;
        case 4: System.out.println("Хорошо");
        break;
        case 5: System.out.println("Отлично");
        break;
        default: System.out.println("Ошибка");
        break;
        }

	}

}
