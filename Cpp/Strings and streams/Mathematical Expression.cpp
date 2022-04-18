#include <iostream>
#include <string>
using namespace std;

int solve(string arr1) {
    int bracketOpenCount = 0;
    int bracketClosedCount = 0;


    for (int i = 0; i < arr1.size(); i++) {
        if (arr1[i] == '(') {
            bracketClosedCount++;
        } else if (arr1[i] == ')') {
            bracketOpenCount++;
        }

    }

    if (bracketClosedCount == bracketOpenCount) {
        cout << "correct";
    }
    else {
        cout << "incorrect";
    }

    return 0;
}

int main()
{
    string arr1;

    cin >> arr1;
    

    solve(arr1);

}
