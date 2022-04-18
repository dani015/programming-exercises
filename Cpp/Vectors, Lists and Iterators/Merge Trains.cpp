#include <iostream>
#include <string>
#include <vector>
#include <sstream>
#include <algorithm>
using namespace std;

void print(vector<int> numbers) {
    for (int number : numbers) {
        cout << number << " ";
    }
    cout << endl;
}


void solve(vector<int> A, vector<int> B) {
    
    vector<int> AB;

    vector<char> tracks;

    AB.reserve(A.size() + B.size());
    AB.insert(AB.end(), A.begin(), A.end());
    AB.insert(AB.end(), B.begin(), B.end());

    sort(AB.rbegin(), AB.rend());
    
    for (int num : AB) {
        if (count(A.begin(), A.end(), num)) {
            tracks.push_back('A');
        }
        else {
            tracks.push_back('B');
        }
    }

    reverse(tracks.begin(), tracks.end());

    for (char track : tracks) {
        cout << track;
    }
    cout << endl;
    
    print(AB);


}

int main()
{
    string nums;
    getline(std::cin, nums);

    stringstream stream(nums);
    int n;
    vector<int> vec;
    while (stream >> n) {
        vec.push_back(n);
    }

    string nums1;
    getline(cin, nums1);

    stringstream stream1(nums1);
    int n1;
    vector<int> vec1;
    while (stream1 >> n1) {
        vec1.push_back(n1);
    }

    solve(vec, vec1);

}
