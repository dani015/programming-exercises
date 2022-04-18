#include <iostream>
#include <cmath>
using namespace std;


int main()
{
    int n;
    cin >> n;

    if (n < 0) {
        n *= -1;
    }

    int pairsum = 0, oddsum = 0;

    while (n) {
        int curSingle = n % 10;

        if (curSingle % 2)
            oddsum += curSingle;
        else
            pairsum += curSingle;

        n = n / 10;
    }


    cout << pairsum * oddsum << endl;
}
