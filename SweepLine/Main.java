import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    private class SegmentIntersection {

	private Segment s1;
	private Segment s2;

	public SegmentIntersection(Segment s1, Segment s2){
	    this.s1 = s1;
	    this.s2 = s2;
	}

	public String toString() {
	    return this.s1.toString() + " intersects with "+this.s2.toString();
	}
	
    }

    public static List<?> sweepLine(Segment [] segments, boolean segInt) {
	/*
	 * Inserto todos los eventos (los puntos de los segmentos) en el
	 * priority queue.
	 * Creo una línea de estado vacío.
	 * Mientras el priority queue no sea vacío (aún hay un evento).
	 * Saco el evento, que actúe sobre la línea de estado.
	 * Va a regresar o un punto o null.
	 * Si regresa != null, lo inserto en los eventos.
	 * Si regresó distinto de null, entonces regresó un punto != null, 
	 * necesariamente de intersección.
	 * Si está activada segIntersections, tengo que ver quiénes son los
	 * segmentos que conforman ese punto y crear un SegmentIntersection e
	 * insertarlo en la lista de retorno.
	 * En otro caso, regresaré una lista de intersections.
	 */
	List<?> l = (segInt) ? new LinkedList<Intersection>() : new LinkedList<SegmentIntersection>();
	PriorityQueue<Point> events = new PriorityQueue<>();
	for(Segment s : segments) {
	    events.add(s.getBegin());
	    events.add(s.getEnd());
	}
	while(!events.isEmpty()) {
	    Point p = events.poll();
	    System.out.printf("(%d, %d)\n", p.getX(), p.getY());
	}
	return l;
    }
    
    public static void main(String [] args) {
	Segment [] segments = new Segment[2];
	Begin ba = new Begin(2, 9, 1, true), bb = new Begin(4, 4, 2, true);
	End ea = new End(5, 1, 1, true), eb = new End(3, 3, 2, true);
	segments[0] = new Segment(ba, ea, 1);
	segments[1] = new Segment(bb, eb, 2);
	List<?> l = sweepLine(segments, false);
    }
    
}
