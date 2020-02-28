/*

  another example of a while loop.  The `sequence` here, happens to be
  related to the unsolved mathematical problem of the Collatz
  conjecture:

  https://en.wikipedia.org/wiki/Collatz_conjecture

*/

public class Collatz {

    public static void main(String[] args) {
	sequence(100); // does sequence always reach `1` for any n ?
    }

    public static void sequence(int n) {

	while (n != 1) {
	    System.out.println(n);

	    if (n % 2 == 0) { // n is even
		n = n / 2;
	    }
	    else { // n is odd
		n = n * 3 + 1;
	    }
	}
    }
}
