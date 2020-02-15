import java.util.Scanner;

/*

  simple example of two conditional statements which are "chained"
  together, allowing us to handle three different cases for an integer
  (positive, negative, or zero)

*/

public class Chaining {

    public static void main(String[] args) {

	// receive an input from the user (as usual..)
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter an integer value for x:");
	int x = scanner.nextInt();
	System.out.println("testing: x = " + x);

	// chained conditional statement, handling all of the three
	// possible cases (positive, negative, or zero) for an integer
	if (x > 0) {
	    System.out.println("x is positive");
	}
	else if (x < 0) {
	    System.out.println("x is negative");
	}
	else {
	    System.out.println("x is zero");
	}
    }
}

/*

  Note: that this handles "all of the three cases" here, because an
  integer can be positive, negative, or zero, i.e., it cannot fall
  into a fourth category --- this has be carefully thought about and
  programmed.  That is, make sure your conditionals handle all cases
  for a particular variable, because it may become more complicated,
  e.g., what if we were taking about colors?  A `String color` could
  be "blue", "red", "green", "yellow".. how many cases would we have
  to handle here?  Depends on the application..

*/
