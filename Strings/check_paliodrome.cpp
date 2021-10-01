#include <iostream>
using namespace std;

int main()
{
    string str = "abba";
    string str2 = str;
    // cout << str.compare(str2);
    int n = str.size();
    for (int i = 0; i < n / 2; i++)
        swap(str2[i], str2[n - 1 - i]);
    
    if (str.compare(str2)==0)
        cout<< "Paliodrome" <<endl ;
    else
        cout<<"Not Palio"<<endl;
    
}