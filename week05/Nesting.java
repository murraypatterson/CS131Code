import java.util.Scanner;

/*

  simple example of two conditional statements where one is "nested"
  within the other.  This is a more general way to "chain" two
  statements together --- and so it also handles three different cases
  for an integer (positive, negative, or zero), but in a slightly
  different way

*/  

public class Nesting {

    public static void main(String[] args) {

	// receive an input form the user (as usual..)
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter an integer value for x:");
	int x = scanner.nextInt();
	System.out.println("testing: x = " + x);

	// nested conditional statement, handling all of the three
	// possible cases (positive, negative, or zero)
	if (x == 0) {
	    System.out.println("x is zero");
	}
	else {
	    // note that this statement is really "inside" the `else`
	    // clause of the first statement..
	    if (x > 0) {
		System.out.println("x is positive");
	    }
	    else {
		System.out.println("x is negative");
	    }
	}
    }
}
