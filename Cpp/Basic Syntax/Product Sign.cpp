#include <iostream>
using namespace std; 

int main()
{
    double num1;
    double num2;
    double num3;
    cin >> num1 >> num2 >> num3;

    if (num1 * num2 * num3 < 0) {
        cout << "-";
    }
    else {
        cout << "+";
    }

    return 0;
}
