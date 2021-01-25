#include<bits/stdc++.h>
using namespace std;
#define ll long long int

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		for (int i = 1; i <= n; ++i)
		{
			for (int j = 1; j <= n; ++j)
			{
				cout << i;
			}
			cout << "\n";
		}
		cout << "\n";
	}
	return 0;
}