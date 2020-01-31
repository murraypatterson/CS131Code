// control how many digits (of a `double` type) appear after the
// decimal place with `printf`, and format specifiers.  Note that `\n`
// means "new line"

public class Formatting {
    
    public static void main(String[] args) {

	// the old way..
	System.out.println("Four thirds = " + (4.0 / 3.0));

	// with printf: 3 and 6 digits after the decimal place
	System.out.printf("Four thirds = %.3f\n", 4.0 / 3.0);
	System.out.printf("Four thirds = %.6f\n", 4.0 / 3.0);

	// format also an `int` (and then the `double`)
	System.out.printf("%d thirds = %.6f\n", 4, 4.0 / 3.0);

    }
}
