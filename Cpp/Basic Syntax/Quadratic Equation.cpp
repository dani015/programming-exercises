#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	double a;
	double b;
	double c;
	cin >> a >> b >> c;

	double ans1;
	double ans2;

	double root = (b * b) - (4 * a * c);

	if (root < 0) {
		cout << "no roots";
		return 0;
	}
	else {
		root = sqrt(root);
	}

	ans1 = ((b * -1) - root) / (2 * a);
	ans2 = ((b * -1) + root) / (2 * a);

	if (ans1 == ans2) {
		cout << ans1;
	} else {
		if (ans1 < ans2) {
			cout << ans1 << " " << ans2;
		}
		cout << ans2 << " " << ans1;

	}
	return 0;


}
