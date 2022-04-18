#include <iostream>
using namespace std;

int getMax(int a, int b) {
	if (a > b) {
		return a;
	}
	
	return b;
}

int getMax(int a, int b, int c) {
	
	return getMax((a, b), c);
}

int main()
{
	int getMax(int, int);

	int undefinedFunctionNeverCalled(int);
	int undefinedFunction(int);

	cout << getMax(5, 7) << endl;
	//cout << undefinedFunction(42) << endl;
	undefinedFunctionNeverCalled(45);
	return 0;

}



