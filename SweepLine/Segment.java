public class Segment implements Comparable<Segment> {

    private Begin b;
    private End e;
    private int id;
    private boolean c;

    public Segment(int x1, int y1, int x2, int y2, int id, boolean c) {
	this.b = new Begin(x1, y1, id, c);
	this.e = new End(x2, y2, id, c);
	this.id = id;
	this.c = c;
    }

    public Segment(Begin b, End e, int id) {
	this.b = b;
	this.e = e;
	this.id = id;
    }

    public Begin getBegin() {
	return this.b;
    }

    public End getEnd() {
	return this.e;
    }

    @Override
    public int compareTo(Segment s) {
	//If we are sweeping in the y axis, then
	//the segment whose beginning point that's closest to the y axis.
	//Else
	//the segment whos beginning point that's closest to the x axis.
	int val = 0;
	if(!this.c)
	    val = this.b.getX() - s.getBegin().getX();
	else
	    val = this.b.getY() - s.getBegin().getY();
	return val;
    }

    public String toString() {
	return "S"+Integer.toString(this.id);
    }
}
