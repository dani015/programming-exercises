#include <iostream>
using namespace std;

void calculate(int num1, int num2, string op) {
    if (op == "-") {
        cout << num1 - num2;
    }
    else if (op == "+") {
        cout << num1 + num2;

    }
    else if (op == "/") {
        if (num2 == 0) {
            cout << "Can't divide by zero.";
            
        }
        else {
            cout << num1 / num2;
        }
        

    }
    else if (op == "*") {
        cout << num1 * num2;

    }
}


int main()
{
    int num1, num2;
    string op;

    cin >> num1 >> num2 >> op;

    calculate(num1, num2, op);
}

