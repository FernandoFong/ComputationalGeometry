import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    /**
     * Given a set of segments, find all the intersections among them
     * in time O((n + k) log n) where k is the number of intersections.
     * @return A collection with all the intersection points.
     */
    public static void sweepLine(Segments [] segments) {
        /*
         * Agregar ambos puntos de los segmentos al priority queue.
         * de esta manera, nos ahorramos un ordenamiento pero segments tiene
         * que implementar a comparable.
         * Crear el estado de la línea.
         * Mientras que la cola aún tenga un evento:
         *     Insertarlo al estado que se va a hacer de manera ordenada.
         *     Y preguntar si se intersecta con sus vecinos del estado.
         *     En caso de
         */
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
