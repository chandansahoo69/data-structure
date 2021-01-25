#include<bits/stdc++.h>
using namespace std;
#define ll long long int

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int k = 2;
		for (int i = 0; i < n; ++i)
		{
			for (int j = 1; j <= n; ++j)
			{
				cout << k+j-1; 
			}
			cout << "\n";
			k++;
		}
		cout << "\n";
	}
	return 0;
}