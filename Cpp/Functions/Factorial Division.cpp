#include <iostream>
using namespace std;

double calculateFactorial(double n) {
	int factorial = 1;

	if (n == 0) {
		return 0;
	}

	for (int i = 1; i <= n; ++i) {
		factorial *= i;
	}

	return factorial;
}


int main()
{
	double num1, num2;
	cin >> num1 >> num2;

	cout.setf(ios::fixed);
	cout.precision(2);

	cout << calculateFactorial(num1) / calculateFactorial(num2);

}

