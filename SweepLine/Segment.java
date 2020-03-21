public class Segment implements Comparable {

    private enum Action {
        BEGIN,
        INTERSECTION,
        END
    }

    private class Point {

        private int x;
        private int y;
        private Action action;

        public Point(int x, int y, Action action) {
            this.x = x;
            this.y = y;
            this.action = action;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getX() {
            return this.x;
        }

        public void setY(int y) {
            this. y = y;
        }

        public int getY() {
            return this.y;
        }

        public void setAction(Action a) {
            this.action = a;
        }

        public Action getAction() {
            return this.action;
        }
    }

    private Point begin;
    private Point end;

    public Segment(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1, Action.BEGIN);
        this.end = new Point(x2, y2, Action.END);
    }

    @Override public int compareTo(Object o) {
        Segment s = (Segment) o;
        int dif = this.begin.getY() - s.begin.getY();
        if(dif > 0 || dif < 0)
            return dif;
        else if(dif == 0)
            return this.begin.getX() - s.begin.getX();
        else
            return -1;
    }

    public boolean intersect(Segment s) {
        return false;
    }
}
