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
				if(j&1)
					cout << 1;
				else
					cout << 0;
			}
			cout << "\n";
		}
		cout << "\n";
	}
	return 0;
}