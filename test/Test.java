package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double number1 = input.nextDouble();
		System.out.println("请输入第二个数：");
		double number2 = input.nextDouble();
		double number3 = number1 + number2;
		double number4 = number1 - number2;
		double number5 = number1 * number2;
		double number6 = number1 / number2;
		System.out.println("两数之和为：" + number3);
		System.out.println("两数之差为：" + number4);
		System.out.println("两数之积为：" + number5);
		System.out.println("两数之商为：" + number6);
	}

}
