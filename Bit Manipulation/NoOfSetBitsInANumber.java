package bitManipulation;

import java.util.Scanner;

public class NoOfSetBitsInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n != 0) {
			int rmsb = n & -n; // -n = n" 
			n -= rmsb;
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
