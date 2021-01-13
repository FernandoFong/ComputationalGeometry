#include <bits/stdc++.h>

using namespace std;

int main() {
  set<int> s;
  for(int i = 1; i <= 10; i++){
    s.insert(i);
  }
  auto x = s.find(5), y = s.find(4);
  swap(*x, *y);
  ++x;
  ++y;
  for(auto it = s.begin(); it != s.end(); it++) {
    cout << *it << endl;
  }
}
