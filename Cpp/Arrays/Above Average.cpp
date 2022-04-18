#include <iostream>
using namespace std;

void solve(int arr[], int size) {
	int sum = 0;
	
	for (int i = 0; i < size; i++) {
		sum += arr[i];
	}

	int avg = sum / size;

	for (int i = 0; i < size; i++) {
		if (arr[i] >= avg) {
			cout << arr[i] << " ";
		}
	}
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

