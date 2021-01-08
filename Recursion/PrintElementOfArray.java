package recursion;

import java.util.Scanner;

public class PrintElementOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		printElement(a, 0);
		sc.close();

	}

	static void printElement(int[] a, int index) {
		if(index == a.length)
			return ;
		System.out.print(a[index] + " ");
		printElement(a, index+1);
	}

}
