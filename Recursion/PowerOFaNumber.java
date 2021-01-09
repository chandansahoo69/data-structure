package recursion;

import java.util.Scanner;

public class PowerOFaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(powerOfN(n,x));
		sc.close();
	}

	private static int powerOfN(int n, int x) {
		if(x == 0)
			return 1;
		
		int res = powerOfN(n, x/2) * powerOfN(n, x/2);
		//if power value is odd then multiply another n^1
		if(x % 2 == 1)
			res = res * n;
		
		return res;
	}

}
