package bitManipulation;

import java.util.Scanner;

public class switchIsOffOrOn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int mask = 1 << k -1;
		n = n & mask;
		if(n == 0)
			System.out.println("OFF");
		else
			System.out.println("ON");
		sc.close();
	}

}
