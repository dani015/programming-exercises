#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;

	int max;
	int min;

	for (int i = 0; i < n; i++) {
		int num = 0;
		cin >> num;

		if (i == 0) {
			max = num;
			min = num;
		}
		else {
			if (num < min) {
				min = num;
			}
			else if (num > max) {
				max = num;
			}
		}


	}


	cout << min << " " << max;
}
