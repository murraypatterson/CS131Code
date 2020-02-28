// simple example of a while loop

public class WhileExample {

    public static void main(String[] args) {
	countdown(10);
    }

    public static void countdown(int n) {

	// while condition: (n > 0), continue the body
	while (n > 0) { // the body { in braces } ..
	    System.out.println(n);
	    n = n - 1;
	}
	System.out.println("Blastoff!");
    }

    /*

      note: that a bad condition of:

      1. n > 1000 : leads to the loop never starting, or
      2. n < 1000 : leads to the loop never finishing

    */
}
