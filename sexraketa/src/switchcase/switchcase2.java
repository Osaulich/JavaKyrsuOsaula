package switchcase;

import java.util.Scanner;

public class switchcase2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int K = in.nextInt();
        switch(K) {
        case 1: System.out.println("�����");
        break;
        case 2: System.out.println("�������������������");
        break;
        case 3: System.out.println("�����������������");
        break;
        case 4: System.out.println("������");
        break;
        case 5: System.out.println("�������");
        break;
        default: System.out.println("������");
        break;
        }

	}

}
