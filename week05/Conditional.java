import java.util.Scanner;

// simple example of two conditional statements which are separate
// from each other

public class Conditional {

    public static void main(String[] args) {

	// receive an input from the user (as usual..)
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter an integer value for x:");
	int x = scanner.nextInt();
	System.out.println("testing: x = " + x);

	// one conditional statement
	if (x > 0) {
	    System.out.println("x is positive");
	}

	// a separate conditional statement
	if (x % 2 == 0) {
	    System.out.println("x is even");
	}
	else {
	    System.out.println("x is odd");
	}
    }
}
