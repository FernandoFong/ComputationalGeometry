public class Segment {

    private BeginPoint bp;
    private FinalPoint fp;

    public Segment(BeginPoint bp, FinalPoint fp) {
	this.bp = bp;
	this.fp = fp;
    }

    public BeginPoint getBeginPoint() {
	return this.bp;
    }

    public FinalPoint getFinalPoint() {
	return this.fp;
    }

    public IntersectionPoint intersects(Segment s) {
	return null;
    }
}
