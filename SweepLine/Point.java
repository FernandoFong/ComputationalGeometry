public abstract class Point implements Comparable<Point> {

    private int x;
    private int y;
    private int id;
    private boolean xaxis;

    public Point(int x, int y, int id, boolean xaxis) {
	this.x = x;
	this.y = y;
	this.id = id;
	this.xaxis = xaxis;
    }

    public int getX() {
	return this.x;
    }

    public int getY() {
	return this.y;
    }

    public int getId() {
	return this.id;
    }

    @Override
    public int compareTo(Point p) {
	int dif = (xaxis) ? this.x - p.getX() : p.getY() - this.y;
	if(dif == 0)
	    return this.id - p.getId();
	return dif;
    }
    
    public abstract Intersection act(State line);
    
}
