package corejavaarul;

import java.util.Scanner;

public class ConditionalDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter you mark");
		int mark = sc.nextInt();

		if ((mark >= 35) && (mark < 100)) {
			System.out.println("pass");
			if (mark > 90) {
				System.out.println("grade A");
			} else if (mark > 80) {
				System.out.println("grade B");
			} else if (mark > 70) {
				System.out.println("grade C");
			} else {
				System.out.println("fail");
			}
		} else if ((mark > 100) || (mark < 0)) {
			System.out.println("invalid mark");
		} else {
			System.out.println("fail");

		}

	}
}
