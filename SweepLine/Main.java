import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

    /**
     * Given a set of segments, find all the intersections among them
     * in time O((n + k) log n) where k is the number of intersections, if the
     * flag parameter is <code>true<code> then it will return the segments that
     * intersect each other, in other case, it will return the points of
     * intersection.
     * @return A collection with all the intersection points.
     */
    public static LinkedList<?> sweepLine(Segment [] segments, boolean flag) {
        /*
         * Agregar ambos puntos de los segmentos al priority queue.
         * de esta manera, nos ahorramos un ordenamiento pero segments tiene
         * que implementar a comparable.
         * Crear el estado de la línea.
         * Insertamos a la cola de prioridades los puntos de inicio y final
         * de cada segmento.
         * Mientras que la cola aún tenga un evento:
         *     Si es un punto de inicio, entonces agregamos el segmento al
         *     estado y preguntamos si se intersecta con sus vecinos, en
         *     caso de ser cierto, obtenemos el punto y lo agregamos a los eventos.
         *     Si es un punto de intersección, entonces hacemos un swap de los
         *     segmentos que lo conforman en la línea de estado y preguntamos si
         *     se intersectan con sus nuevos vecinos, en caso de ser cierto,
         *     obtenemos el punto y lo agregamos a los eventos.
         *     Si es un punto final, eliminamos al segmento la línea y preguntamos
         *     si los que ahora son vecinos se intersectan, en caso de ser cierto,
         *     obtenemos el punto de intersección y lo agregamos a los eventos.
         *     Si obtuvimos un punto de intersección vamos a agregarlo a la lista
         *     de intersecciones
         *Regresamos la lista de intersecciones.
         */
        return null;
    }

    /**
     * Driver's code.
     */
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In which direction do you want to sweep?\n" +
                           "1) x\n"+
                           "2) y\n");
        boolean sweepDirection = in.nextLine().equals("x");
        System.out.println("Type the number of segments");
        int n = in.nextInt();
        //Segment [] segments = new Segment[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Type the beginning point of the segment");
            int x = in.nextInt(), y = in.nextInt();
            System.out.println(x);
            System.out.println(y);
            //Begin b = new Begin(x, y, sweepDirection, i);
            System.out.println("Type the end point of the segment");
            x = in.nextInt();
            y = in.nextInt();
            System.out.println(x);
            System.out.println(y);
            //End e = new End(x, y, sweepDirection, i);
            //segments[i] = new Segment(b, e);
        }
    }
}
