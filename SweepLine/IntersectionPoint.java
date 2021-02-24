import java.util.PriorityQueue;

public class IntersectionPoint extends Point {

    public IntersectionPoint(int x, int y) {
	super(x, y);
    }

    @Override
    public void act(StateLine st, PriorityQueue<Point> events) {
	/*
	 * Swap in the state line the two segments im part of.
	 * Check if they intersect with their new neighbours.
	 * if they do, then add them to the events.
	 */
    }
}
