public class State {

    public Point root;
    public State parent;
    public State left;
    public State right;
    public int height;

    public void add(Point p) {
        State s = new State();
        s.root = p;
        if(this.root.compareTo(p) <= 0) {
            if(this.right == null)
        }
    }
}
