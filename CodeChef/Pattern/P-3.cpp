#include<bits/stdc++.h>
using namespace std;
#define ll long long int

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int l = 1;
		for (int i = 0; i < n; ++i)
		{
			for (int j = 1; j <= n; ++j)
			{
				cout << l++;
			}
			cout << "\n";
		}
		cout << "\n";
	}
	return 0;
}