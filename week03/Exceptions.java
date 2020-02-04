import java.util.Scanner;

// example of exception handling

public class Exceptions {

    public static void main(String[] args) {

	try {
	    // even though it's correct code, this block of code is
	    // prone to error, e.g., the user types "hello" instead of
	    // an integer --- the `nextInt()` method will "throw" an
	    // `InputMismatchException`.  Since we know this, we can
	    // wrap this whole part of code in a `try` block, which
	    // means "try" this.. but then "catch" an exception that
	    // may happen (like the one above), to avoid the program
	    // crashing with an error message
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please type an integer:");
	    int a = scanner.nextInt();
	    System.out.println("a is : " + a);
	}
	catch(Exception e) {
	    // down here in this block is what we do should some
	    // exception happen in the above.  In this case, the
	    // exception will be stored in the `Exception e`.  We
	    // output a message to the user, and even print `e`
	    System.out.println("something went wrong..");
	    System.out.println(e);
	}
    }
}
