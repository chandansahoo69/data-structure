#include<iostream>
#include<string>
using namespace std;

int main()
{
    string str;
    cin>> str ; 
    string str2 ;
    cin>> str2 ;

    string temp = str+str2;
     if(temp.find(str2) != string::npos)
     {
         cout <<"true"<<endl;
     }
     else
        cout<< "false" <<endl ;
    return 0;
}