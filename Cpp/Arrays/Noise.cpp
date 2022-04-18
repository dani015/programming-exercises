#include <iostream>
#include <string>
#include <cmath>
using namespace std;

void solve(int size, const char* arr) {
	string num = "";

	for (int i = 0; i < size; i++) {
		if (isdigit(arr[i])) {
			num += arr[i];
		}
	}

	int pre = stoi(num);

	cout << sqrt(pre);

}



int main()
{
	string s;
	cin >> s;
	int n = s.length();

	const char* arr = s.c_str();
	

	solve(n, arr);
}