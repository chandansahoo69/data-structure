package recursion;

import java.util.Scanner;

public class MaximumInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(max(a, 0));
		sc.close();
	}

	static int max(int[] a, int i) {
		if(i == a.length)
			return -1;
		//get the maximum value from 1 to n then compare the value 
		//with 0 index return the maximum element
		int Max = max(a, i+1);
		if(Max > a[i])
			return Max;
		else 
			return a[i];
	}
}
