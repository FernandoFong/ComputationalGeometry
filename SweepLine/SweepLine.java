import java.util.LinkedList;

public class SweepLine {

    public void sweepLine(Segment [] segments) {
        /*
         * Ordeno los puntos con respecto a su coordenada y.
         * Para cada segmento tengo dos paradas, inicio y fin.
         * Para la parada de inicio, agrego al segmento
         * y pregunto si me intersecto con mis vecinos. O(log n)
         * Para la parada de fin, elimino al segmento
         * y pregunto si mis vecinos se intersectan. O(log n)
         * Si dos vecinos se intersectaron, intercambio el orden de
         * los vecinos y pregunto con los nuevos vecinos. O(log n)
         */
        Arrays.sort(segments);
    }

    public static void main(String [] args) {

    }
}
