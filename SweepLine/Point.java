import java.util.PriorityQueue;

public abstract class Point implements Comparable<Point>{
    
    private int x;
    private int y;

    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public void setX(int x) {
	this.x = x;
    }
    
    public int getX() {
	return this.x;
    }

    public void setY(int y) {
	this.y = y;
    }

    public int getY() {
	return this.y;
    }
    
    @Override 
    public int compareTo(Point p) {
	return (this.y - p.getY() == 0) ? this.x - p.getX() : this.y - p.getY();
    }

    public abstract void act(StateLine sl, PriorityQueue<Point> events);
}
