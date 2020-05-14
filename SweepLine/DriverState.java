public class DriverState {

    private static int [] xb = {3, 5, 2, 1, 4};
    private static int [] yb = {9, 8, 7, 4, 2};
    private static int [] xe = {5, 2, 3, 2, 5};
    private static int [] ye = {5, 4, 3, 0, -1};

    public static void main(String [] args) {
	State s = new State();
	Segment [] ss = new Segment[5];
	for(int i = 0; i < ss.length; i++) {
	    ss[i] = new Segment(xb[i], yb[i], xe[i], ye[i], i+1, false);
	}
	for(Segment seg : ss)
	    s.addSegment(seg);
	s.bfs();
    }    
}
