package corejavaarul;

import java.util.Scanner;

public class forloop1to100 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the iteration :");
		int iteration=sc.nextInt();
		
		for(int i=iteration;i>=1;i--) {
			System.out.println(i);
		}
	}

}
