package recursion;

import java.util.Scanner;

public class Print1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print1ToN(n);
		sc.close();
	}

	private static void print1ToN(int n) {
		if(n == 0)
			return ;
		print1ToN(n-1);
		System.out.print(n + " ");
	}

}
