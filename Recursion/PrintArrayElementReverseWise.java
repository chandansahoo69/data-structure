package recursion;

import java.util.Scanner;

public class PrintArrayElementReverseWise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		printElementRevese(a, 0);
		sc.close();
	}

	static void printElementRevese(int[] a, int index) {
		if(index == a.length)
			return ;
		printElementRevese(a, index+1);
		System.out.print(a[index] + " ");
	}
}
