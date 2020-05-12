public class DriverPoints {

    public static void main(String [] args) {
	Begin b1 = new Begin(2, 8, 1, false);
	Begin b2 = new Begin(5, 3, 2, false);
	Begin b3 = new Begin(5, 1, 3, false);
	System.out.println(b1.compareTo(b2));
	System.out.println(b1.compareTo(b3));
	System.out.println(b2.compareTo(b3));
	Begin bTrue = new Begin(2, 9, 4, false);
	System.out.println(b1.compareTo(bTrue));
	b1 = new Begin(2, 8, 1, true);
	b2 = new Begin(5, 3, 2, true);
	b3 = new Begin(5, 1, 3, true);
	System.out.println(b1.compareTo(b2));
	System.out.println(b1.compareTo(b3));
	System.out.println(b2.compareTo(b3));
    }
}
