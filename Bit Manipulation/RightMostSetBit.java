package bitManipulation;

import java.util.Scanner;

public class RightMostSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rmsb = n & -n; // n & (~n+1); because n & N" means
		//n & n' compliment + 1 so
		System.out.println(Integer.toBinaryString(rmsb));
		sc.close();
	}

}
