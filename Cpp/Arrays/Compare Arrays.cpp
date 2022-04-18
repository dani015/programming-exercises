#include <iostream>
using namespace std;


bool areEqual(int arr1[], int length1, int arr2[], int length2) {
	
	if (length1 != length2) {
		return false;
	}

	for (int i = 0; i < length1; i++) {
		if (arr1[i] != arr2[i]) {
			return false;
		}
	}

	return true;

}

const unsigned maxSize = 200;

int main(void)
{
	int arr1size;
	
	cin >> arr1size;

	int* arr1 = new int[arr1size];
	for (int i = 0; i < arr1size; i++) {
		cin >> arr1[i];
	}

	

	int arr2size;
	cin >> arr2size;

	

	int* arr2 = new int[arr2size];
	for (int i = 0; i < arr2size; i++) {
		cin >> arr2[i];
	}

	
	
	if (areEqual(arr1, arr1size, arr2, arr2size) == false) {
		cout << "Not equal";
	}
	else {
		cout << "equal";
	}
	


}
