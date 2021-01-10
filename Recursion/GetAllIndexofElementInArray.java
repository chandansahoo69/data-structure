package recursion;

import java.util.Scanner;

public class GetAllIndexofElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int b[] = getAllIndex(a, 0, 3, 0);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		sc.close();
	}

	static int[] getAllIndex(int[] a, int i, int x, int foi) {
		//when index cross the length then create the array
		//with foi length
		if(i == a.length) {
			int arr[] = new int[foi];
			return arr;
		}
		//if the index value is match with x then add it in 
		//the array at the index foi because the foi becames 
		//the no of x present in the array so when we come back 
		//then we add the index at foi index
		if(a[i] == x) {
			int res[] = getAllIndex(a, i+1, x, foi+1);
			res[foi] = i;
			return res;
		} else {
			int res[] = getAllIndex(a, i+1, x, foi);
			return res;
		} //if the element is not matching then return the element
		//then return the array that return previously
	}
}
