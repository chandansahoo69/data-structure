#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main()
{
    string str = "54213";
    sort(str.begin(), str.end());
    cout<< str <<endl ;
    reverse(str.begin(), str.end());
    cout<< str <<endl ;

    //or directly sort in desecending order
    sort(str.begin(), str.end(),greater<int>());
    cout<< str <<endl ;

    return 0;
}