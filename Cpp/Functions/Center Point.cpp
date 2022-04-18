#include <iostream>
#include <cmath>
using namespace std;

void getCenter(int x1, int y1, int x2, int y2) {
	double firstDist = abs(x1) + abs(y1);
	double secondDist = abs(x2) + abs(y2);

	if (firstDist < secondDist) {
		cout << "(" << x1 << ", " << y1 << ")";
	}
	else if (firstDist == secondDist) {
		cout << "(" << x1 << ", " << y1 << ")";
	}
	else {
		cout << "(" << x2 << ", " << y2 << ")";
	}


}


int main()
{
	int x1, y1, x2, y2;
	cin >> x1 >> y1 >> x2 >> y2;

	getCenter(x1, y1, x2, y2);

}
