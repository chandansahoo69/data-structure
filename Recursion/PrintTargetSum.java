package recursion;

import java.util.Scanner;

public class PrintTargetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		PrintSum(a, 0, "", 0, tar);
		sc.close();
	}
	static void PrintSum(int a[], int i, String s, int total, int tar) {
		if(i == a.length) {
			if(tar == total) {
				System.out.println(s);
			}
			return;
		}
		//once we have to pass the index value and once not 
		//when we pass the value we also add it with string and total
		//so that at last we can check it's matching or not
		PrintSum(a, i+1, s+a[i]+",", total+a[i], tar);
		PrintSum(a, i+1, s, total, tar);
	}
}
