package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(GetPath(1, 1, n, m));
		sc.close();
	}

	static ArrayList<String> GetPath(int sr, int sc, int dr, int dc) {
		if(sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		ArrayList<String> hpaths = new ArrayList<>();
		ArrayList<String> vpaths = new ArrayList<>();
		
		//check if are not crossing the board 
		if(sc<dc)
			hpaths = GetPath(sr, sc+1, dr, dc);
		if(sr<dr)
			vpaths = GetPath(sr+1, sc, dr, dc);
		//add h and v with all the paths that we have traveled
		//because we have moved in two paths h and v so after returning
		//add the paths
		ArrayList<String> paths = new ArrayList<>();
		for(String path: hpaths)
			paths.add('h'+path);
		for(String path: vpaths)
			paths.add('v'+path);
		
		return paths;
	}

}
