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

bool same_point(Point p, Point q) {
  return X(p) == X(q) && Y(p) == Y(q);
}

//The angle of p assuming that q is the "zero"
double angle(Point p, Point q, double acc) {
  if(same_point(p, q))
     return -1.0;
  double angle = atan2((Y(p) - Y(q)), (X(p) - X(q))) * 180.0 / PI;
  angle -= acc;
  if(angle < 0.0)
    return angle + 360.0;
  return angle;
}

Point find_smallest(Points ps, Point p, double acc) {
  double a0 = HUGE_VAL;
  Point ans;
  for(Point q : ps) {
    double ai = angle(q, p, acc);
    if(ai < a0 && ai != -1) {
      a0 = ai;
      ans = q;
    }
  }
  return ans;
}

Points gift_wrapping(Points ps) {
  Points hull;
  Point initial = lowest_point(ps);
  hull.push_back(initial);
  double acc = 0.0;
  do {
    Point last_added = hull[hull.size()-1];
    Point smallest = find_smallest(ps, last_added, acc);
    acc += angle(smallest, last_added, acc);
    hull.push_back(smallest);
  } while(!same_point(hull[hull.size()-1], initial));
  hull.pop_back();
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
  Points convex_hull = gift_wrapping(ps);
  for(Point p : convex_hull) {
    printf("(%d, %d)\n", X(p), Y(p));
  }
}
