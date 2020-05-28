public class Intersection extends Point {

    private int id2;

    public Intersection(int x, int y, int id, int id2, boolean xaxis) {
	super(x, y, id, xaxis);
	this.id2 = id2;
    }
    
    @Override
    public Intersection act(State line, Segment [] segments) {
	return null;
    }
}
