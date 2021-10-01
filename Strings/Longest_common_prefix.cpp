#include <iostream>
#include <string>
#include <vector>
using namespace std;

string commonPrefix(vector<string> &v)
{
    int n = v.size();
    string str = v[0];
    for (int i = 1; i < n; i++)
    {
        int j=0;
        for (; j < v[i].size(); j++)
        {
            if (str[j] != v[i][j])
                break;
        }
        str = str.substr(0,j); 
        if(str == "")
            return "";
    }
    return str;
}
int main()
{
    vector<string> v;
    v.push_back("flower");
    v.push_back("flower");
    v.push_back("flower");
    v.push_back("flower");
    // v.push_back("helo11");
    // v.push_back("hellll02");

    string ans = commonPrefix(v);
    cout << ans << endl;

    return 0;
}