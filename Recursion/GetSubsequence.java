package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(subsequence(str));
		sc.close();
	}

	static ArrayList<String> subsequence(String str) {
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rres = subsequence(ros);
		ArrayList<String> mres = new ArrayList<>();
		
		for(String rstr: rres) {
			mres.add("" + rstr);
			mres.add(ch + rstr);
		}
		
		return mres;
	}
}
