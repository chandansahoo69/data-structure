#include<iostream>
#include<algorithm>
#include<string>
using namespace std;

int main()
{
    // string str;
    // //declaring with pre values
    // string str1(5,'n') ;
    // // cin>> str ;
    // cout<< str1 <<endl ;

    //take input with spaces
    // string str;
    // getline(cin, str);
    // cout<< str <<endl ;

    //apending stirng
    // string s1 = "0123456789";
    // string s2 = "guys";
    // s1.append(s2);
    // // s1= s1+s2;
    // cout<< s1 <<endl ;

    //more functions 
    // s1.clear(); //clears the values
    // s1.empty(); //checks if the string is empty
    // s1.compare(s2); //compare s2 with s1
    // cout<<s1.erase(3,2)<<endl; // 1st arg is index 2nd arg is nuber of terms to be deleted
    
    // s1.insert(2,"lol");
    // cout<<s1<<endl;
    // // cout<<s1.find("7")<<endl;

    // cout<< s1.size() <<endl ;
    // cout<< s1.length() <<endl ;

    // string sub = s1.substr(4,3);
    // cout<< sub <<endl ;

    //converting string to int =
    // string str = "234";  //using characters thorows error
    // int x = stoi(str);
    // cout<< x <<endl ;

    // int x= 782;
    // cout<< to_string(x)+"2" <<endl ;


    // sorting string
    string str = "kjhdsab";
    sort(str.begin(), str.end());
    cout<<str<<endl;
    return 0;
}