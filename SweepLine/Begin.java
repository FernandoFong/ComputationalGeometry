public class Begin extends Point {

    public Begin(int x, int y, int id, boolean xaxis) {
	super(x, y, id, xaxis);
    }

    @Override
    public Intersection act(State line) {
	return null;
    }
    
}
