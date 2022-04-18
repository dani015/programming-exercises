#include <iostream>
#include <string>
using namespace std;

int solve(string arr1, string arr2) {
    if (arr1.size() != arr2.size()) {
        cout << "not equal";
        return 0;
    }

    for (int i = 0; i < arr1.size(); i++) {
        if (arr1[i] != arr2[i]) {
            cout << "not equal";
            return 0;
         }
        
    }

    cout << "equal";
    return 0;
}

int main()
{
    string arr1;
    string arr2;
    
    getline(cin, arr1);
    getline(cin, arr2);


    solve(arr1, arr2);

}
