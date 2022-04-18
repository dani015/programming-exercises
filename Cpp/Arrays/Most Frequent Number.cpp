#include <iostream>
using namespace std;

void solve(int arr[], int size) {
	
	int highestCount = 0;
	int highestNum = 0;

	for (int i = 0; i < size; i++) {
		int current = arr[i];
		int tempHighest = 0;
		for (int j = 0; j < size; j++) {
			if (arr[j] == arr[i]) {
				tempHighest++;
			}
		}

		if (tempHighest >= highestCount) {
			highestCount = tempHighest;
			highestNum = arr[i];
		}
	}
	
	cout << highestNum;
	

}



int main()
{
	int size;
	cin >> size;

	int* arr = new int[size];
	for (int i = 0; i < size; i++) {
		cin >> arr[i];
	}

	solve(arr, size);

}

