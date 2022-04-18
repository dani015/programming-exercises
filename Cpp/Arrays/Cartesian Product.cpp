#include <iostream>
using namespace std;

void solve(int size, int* arr) {
	int sq = size * size;
	int* solution = new int[sq];
	int c = 0;
	for (int i = 0; i < size; i++) {
		int temp = arr[i];
		for (int j = 0; j < size; j++) {
			solution[c] = arr[i] * arr[j];
			c++;
		}
	}

	for (int k = 0; k < sq; k++) {
		cout << solution[k] << " ";
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

	solve(size, arr);
}

