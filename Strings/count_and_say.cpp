// https://leetcode.com/problems/count-and-say/submissions/

#include <iostream>
#include <string>
using namespace std;

string countsay(int n)
{
    if (n == 1)
    {
        return "1";
    }
    string str = countsay(n - 1);
    int ctr = 1;
    string ans;
    for (int i = 0; i < str.size(); i++)
    {
        if (str[i] != str[i + 1])
        {
            ans = ans + (to_string(ctr) + str[i]);
            ctr = 1;
        }
        else
            ctr++;
    }
    return ans;
}
int main()
{
    int n;
    cin >> n;
    string str = countsay(n);
    cout << str;
    return 0;
}