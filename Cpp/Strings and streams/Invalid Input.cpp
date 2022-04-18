#include <iostream>
#include <string>
using namespace std;

int solve(string arr1) {
    string full = "";
    int sum = 0;
    char prev;
    for (int i = 0; i < arr1.size(); i++) {
        if (isdigit(arr1[i])) {
            sum += arr1[i];
        } else if (isalpha(arr1[i])) {
            if (i != 0) {
                prev = arr1[i - 1];
                

                
            }
            else {
                full += arr1[i];
            }
        }
        

    }

    
    return 0;
}

int main()
{
    string arr1;


    getline(cin, arr1);
    


    solve(arr1);

}
