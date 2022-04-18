#include <iostream>
using namespace std;

void solve(int size, int* arr) {
	int firstLow = 0;
	int secondLow = 0;

	for (int i = 0; i < size; i++) {
		if (i != 1) {
			if (arr[i] < firstLow) {
				secondLow = firstLow;
				firstLow = arr[i];
			}
			else if (arr[i] < secondLow) {
				secondLow = arr[i];
			}
		}
		else {
			firstLow = arr[0];
			secondLow = arr[1];
		}
	}

	cout << secondLow - firstLow;
	
}



int main()
{
	int size;
	cin >> size;

	int* arr = new int[size];
	for (int i = 0; i < size; i++) {
		cin >> arr[i];
	}

	solve(size, arr);
}