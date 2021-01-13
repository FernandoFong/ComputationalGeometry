#include <bits/stdc++.h>
#define Point pair<int,int>
#define nP(x,y) make_pair(x, y)
#define get_x(p) p.first
#define get_y(p) p.second
#define Segment pair<Point, Point>
#define nS(x1, y1, x2, y2) make_pair(nP(x1, y1),nP(x2, y2))
#define get_p1(s) s.first
#define get_p2(s) s.second
#define get_x1(s) s.first.first
#define get_y1(s) s.first.second
#define get_x2(s) s.second.first
#define get_y2(s) s.second.second

using namespace std;

bool comp_points(Point p1, Point p2) {
  return false;
}

void print_seg(Segment s) {
  int x1 = get_x1(s), y1 = get_y1(s), x2 = get_x2(s), y2 = get_y2(s);
  printf("Segment[(%d, %d), (%d, %d)]\n", x1, y1, x2, y2);
}

int main() {
  int size;
  cout << "Type the number of segments:" << endl;
  cin >> size;
  cout << "Type the coordinates of the segments" << endl;
  vector<Segment> segs;
  int n = 0;
  while(n < size) {
    int x1, y1, x2, y2;
    printf("Type the %dth segment x1 y1 x2 y2\n", n+1);
    cin >> x1;
    cin >> y1;
    cin >> x2;
    cin >> y2;
    Segment s = nS(x1, y1, x2, y2);
    segs.push_back(s);
    n++;
  }
  for(Segment s : segs) {
    print_seg(s);
  }
}
