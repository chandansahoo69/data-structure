package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(combination(str));
		sc.close();
	}
	static String[] code = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	static ArrayList<String> combination(String str) {
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		//every time get the first character and pass the rest of the
		//string to the function so it will give the rest of the 
		//result and after that get the string at the ch index of 
		//code array and attach all the character with the result 
		//then get the result 
		
		//get the char no
		char ch = str.charAt(0);
		//get the rest of the string 
		String ros = str.substring(1);
		//then pass to the function to get the n-1 result 
		ArrayList<String> rres = combination(ros);
		//then create a list and add the rest value 
		ArrayList<String> mres = new ArrayList<>();
		//get the string present in the array
		String codeforch = code[ch - '0'];
		//for each character of the string add it with the res
		for (int i = 0; i < codeforch.length(); i++) {
			char chcode = codeforch.charAt(i);
			//get the character and add 
			for(String rstr: rres)
				mres.add(chcode + rstr);
		}
		return mres;
	}

}
