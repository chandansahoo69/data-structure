package recursion;

import java.util.Scanner;

public class FirstIndexOfELementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(getFirstIndex(a, 0, 3));
		sc.close();
	}

	static int getFirstIndex(int[] a, int index, int x) {
		if(a.length == index)
			return -1;
		//first we have to check when we are moving to the depth
		//of the stack because first index comes first then 
		//the other index of element of when we find the value 
		//return the index
		if(a[index] == x)
			return index;
		else
			return getFirstIndex(a, index+1, x);
	}

}
