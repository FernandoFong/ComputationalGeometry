import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SweepLine {

    public class PairSegments {

	Segment s1;
	Segment s2;
	
    }

    public List<IntersectionPoint> sweepLinePoints(Segment [] segments) {
	ArrayList<IntersectionPoint> intersections = new ArrayList<>();
	PriorityQueue<Point> events = new PriorityQueue<>();
	StateLine state = new StateLine();
	for(Segment s : segments) {
	    events.add(s.getBeginPoint());
	    events.add(s.getFinalPoint());
	}
	while(!events.isEmpty()) {
	    Point p = events.poll();
	    try {
		IntersectionPoint ip = (IntersectionPoint) p;
		intersections.add(ip);
	    } catch(ClassCastException cse) {}
	    p.act(state, events);
	}
	return intersections;
    }

    public List<PairSegments> sweepLineSegments(Segment [] segments){
	return null;
    }
}
