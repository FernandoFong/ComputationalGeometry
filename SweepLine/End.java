
public class End extends Point {

    public End(int x, int y, int id, boolean xaxis) {
	super(x, y, id, xaxis);
    }
    
    @Override
    public Intersection act(State line, Segment [] segments) {
	return null;
    }
    
}
