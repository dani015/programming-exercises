#include <cmath>
#include <iostream>
using namespace std;


int main()
{
	const int MaxCount = 100;
	int numbers[MaxCount] = {};
	int actualCount;
	cout << "How many elements: "; 
	cin >> actualCount;

	if (actualCount > MaxCount) {
		cout << "Not enough memory for  " << actualCount << "elements." << endl;
		return -1;
	}


	for (int i = 0; i < actualCount; i++) {
		cin >> numbers[i];
	}
}
