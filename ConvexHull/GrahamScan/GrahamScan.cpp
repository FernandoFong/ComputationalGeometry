#define LEFT -1
#define CENTER 0
#define RIGHT 1
#define Point pair<int,int>
#define Points vector<Point>
#define X(p) p.first
#define Y(p) p.second
#define set_x(p, val) p.first = val
#define set_y(p, val) p.second = val
#define PI 3.14159265

#include <bits/stdc++.h>

using namespace std;

int turn(Point p, Point q, Point r){
  int det_p = X(q)*Y(r) - X(r)*Y(q);
  int det_q = X(p)*Y(r) - X(r)*Y(p);
  int det_r = X(p)*Y(q) - X(q)*Y(p);
  int det = det_p - det_q + det_r;
  if(det > 0)
    return LEFT;
  else if(det == 0)
    return CENTER;
  else
    return RIGHT;
}

Point lowest_point(Points ps) {
  Point l;
  if(ps.size() == 0)
    return l;
  l = ps[0];
  for(int i = 0; i < ps.size(); i++)
    if(Y(l) > Y(ps[i]))
      l = ps[i];
  return l;
}

Point low;

double angle(Point p) {
  if(X(p) == X(low) && Y(p) == Y(low))
    return -1.0;
  return atan2((Y(p) - Y(low)), (X(p) - X(low))) * 180.0 / PI;
}

void print_vector(Points ps) {
  for(int i = 0; i < ps.size(); i++)
    printf("(%d, %d), angle: %lf\n", X(ps[i]), Y(ps[i]), angle(ps[i]));
}

bool comp(Point a, Point b) {
  double aa = angle(a), ba = angle(b);
  if(aa == ba)
    return X(a) > X(b);
  else
    return aa < ba;
}

Points graham_scan(Points ps) {
  low = lowest_point(ps);
  sort(ps.begin(), ps.end(), comp);
  //print_vector(ps);
  Points hull;
  hull.push_back(low);
  hull.push_back(ps[1]);
  hull.push_back(ps[2]);
  for(int i = 3; i < ps.size(); i++) {
    Point p2 = hull[hull.size()-1], p1 = hull[hull.size()-2];
    int spin = turn(p1, p2, ps[i]);
    while(spin == RIGHT && hull.size() > 2) {
      hull.pop_back();
      p2 = hull[hull.size() -1], p1 = hull[hull.size()-2];
      spin = turn(p1, p2, ps[i]);
    }
    hull.push_back(ps[i]);
  }
  return hull;
}


int main() {
  Points ps;
  ps.push_back(make_pair(6, 3));
  ps.push_back(make_pair(9, 5));
  ps.push_back(make_pair(12, 5));
  ps.push_back(make_pair(8, 8));
  ps.push_back(make_pair(12, 9));
  ps.push_back(make_pair(11, 11));
  ps.push_back(make_pair(4, 5));
  ps.push_back(make_pair(8, 5));
  ps.push_back(make_pair(6, 9));
  Points convex_hull = graham_scan(ps);
  for(Point p : convex_hull) {
    printf("(%d, %d)\n", X(p), Y(p));
  }
}
