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
		double number = number1 + number2;
		System.out.println("两数之和为：" + number);
	}

}
