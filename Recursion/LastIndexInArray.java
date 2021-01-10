package recursion;

import java.util.Scanner;

public class LastIndexInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(getLastIndex(a, 0, 3));
		sc.close();
	}
	static int getLastIndex(int a[], int index, int x) {
		if(a.length == index)
			return -1;
		int lindx = getLastIndex(a, index+1, x);
		if(lindx == -1) {
			if(a[index] == x)
				return index;
			else
				return -1;
		} else 
			return lindx;
	}
}