#include <iostream>
#include <string>
#include <regex>
#include <algorithm>
using namespace std;

int solve(string arr, string word, string replace) {
    arr = regex_replace(arr, regex(word), replace);
    cout << arr;

    return 0;
}

int main()
{
    string arr1;

    getline(cin >> ws, arr1);
    string word;
    cin >> word;

    string replace;
    cin >> replace;

    solve(arr1, word, replace);

}
