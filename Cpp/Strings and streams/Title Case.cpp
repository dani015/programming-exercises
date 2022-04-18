#include <iostream>
#include <string>
using namespace std;

int solve(string arr) {
    int bracketOpenCount = 0;
    int bracketClosedCount = 0;

    char prev;

    for (int i = 0; i < arr.size(); i++) {
        if (i != 0) {
            prev = arr[i - 1];

            if (prev == ' ' || prev == ',' || prev == '-' || prev == '.') {
                cout << char(toupper(arr[i]));
            }
            else {
                cout << arr[i];
            }
        }
        else {
            cout << arr[i];
        }

    }

    

    return 0;
}

int main()
{
    string arr1;

    getline(cin >> ws, arr1);


    solve(arr1);

}
