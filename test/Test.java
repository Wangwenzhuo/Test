package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		double number1 = input.nextDouble();
		System.out.println("������ڶ�������");
		double number2 = input.nextDouble();
		double number3 = number1 + number2;
		double number4 = number1 - number2;
		double number5 = number1 * number2;
		double number6 = number1 / number2;
		System.out.println("����֮��Ϊ��" + number3);
		System.out.println("����֮��Ϊ��" + number4);
		System.out.println("����֮��Ϊ��" + number5);
		System.out.println("����֮��Ϊ��" + number6);
	}

}
