package ua.univer.task.ifelse;
import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int month = in.nextInt();
		switch (month) {
		case 1: System.out.println("ѳ���� = " + "����");
				break;
		case 2: System.out.println("����� = " + "����");
				break;
		case 3: System.out.println("�������� = " + "�����");
				break;
		case 4: System.out.println("������ = " + "�����");
				break;
		case 5: System.out.println("������� = " + "�����");
				break;
		case 6: System.out.println("������� = " + "˳��");
				break;
		case 7: System.out.println("������ = " + "˳��");
				break;
		case 8: System.out.println("������� = " + "˳��");
				break;
		case 9: System.out.println("�������� = " + "����");
				break;
		case 10: System.out.println("������� = " + "����");
				break;
		case 11: System.out.println("�������� = " + "����");
				break;
		case 12: System.out.println("������� = " + "����");
				break;
		}
	}

}
