#include<iostream>
#include<string>
using namespace std;

string breakPaliodrome(string str)
{
    int n = str.length();
    if (n>1)
    {
        for (int i=0; i < n/2; i++)
        {
            if ((char)str[i] > 'a')
            {
                str[i] = 'a';
                return str;
            }
        }
        str[n-1] ='b';
        return str;
    }
    else
    {
        return "";
    }
    
}
int main()
{
    string str = "";
    string ans = breakPaliodrome(str);
    cout<< ans <<endl ;
    return 0;
}