#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main()
{
    string str = "ajkdfnjf";
    for (int i = 0; i < str.size(); i++)
    {
        if (str[i]>='a' && str[i]<='z')
        {
            str[i] -= 32;
        }
        
    }
    cout<< str <<endl ;
    //using predefined function

    transform(str.begin(), str.end(),str.begin(), ::tolower);
    cout<< str <<endl ;
    
    return 0;
}
