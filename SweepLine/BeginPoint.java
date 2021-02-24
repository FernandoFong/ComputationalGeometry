import java.util.PriorityQueue;

public class BeginPoint extends Point {

    public BeginPoint(int x, int y) {
	super(x, y);
    }
    
    @Override
    public void act(StateLine sl, PriorityQueue<Point> events) {
	/*
	 * Insert my segment on the state line.
	 * Ask if I intersect with my neighbours.
	 * If I do, then add the intersection points to the events.
	 */
    }
}
