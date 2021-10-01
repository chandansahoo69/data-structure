#include <iostream>
#include <string>
using namespace std;

bool check_substring(string s, string str)
{
    int n = s.size();
    int m = str.size();

    for (int i = 0; i < n - m; i++)
    {
        int j = 0;
        for (; j < m; j++)
        {
            if (s[i + j] != str[j])
                break;
        }
        if (j == m)
            return true;
    }
    return false;
}

int main()
{
    string s;
    cin >> s;
    string str;
    cin >> str;

    cout << check_substring(s, str);

    return 0;
}