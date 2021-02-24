import java.util.PriorityQueue;

public class FinalPoint extends Point {

    public FinalPoint(int x, int y) {
	super(x, y);
    }

    @Override
    public void act(StateLine st, PriorityQueue<Point> events) {
	/*
	 * Im not on the events.
	 * Remove my segment from the state line
	 * Ask if my former neighbours intersect, if they do, add them to the
	 * events.
	 */
    }
    
}
