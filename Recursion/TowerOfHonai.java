package recursion;

import java.util.Scanner;

public class TowerOfHonai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int a = sc.nextInt();
		int c = sc.nextInt();
		TOH(n,a,b,c);
		sc.close();

	}

	static void TOH(int n, int a, int b, int c) {
		if(n == 0)
			return ;
		//this call will do all the work if we have n-1 result 
		//then we have to only move the last plate from a to b
		TOH(n-1, a, b, c);
		//we have to print move from a to b
		System.out.println(n + "[" + a + "->" + b + "]");
		//same procedure for it
		TOH(n-1, c, b, a);
	}

}
