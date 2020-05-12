public class Segment {

    private Begin b;
    private End e;
    private int id;

    public Segment(int x1, int y1, int x2, int y2, int id, boolean c) {
	this.b = new Begin(x1, y1, id, c);
	this.e = new End(x2, y2, id, c);
	this.id = id;
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

    public String toString() {
	return "S"+Integer.toString(this.id);
    }
}
