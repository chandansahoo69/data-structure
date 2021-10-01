#include <iostream>
using namespace std;

void reverse(string &str)
{
    int n = str.size();
    for (int i = 0; i < n / 2; i++)
    {
        swap(str[i], str[n - 1 - i]);
    }
}
int main()
{
    string str;
    cin >> str;
    reverse(str);
    cout << str << endl;
    return 0;
}