// modulus: the complementary operator to integer division

public class Modulus {

    public static void main(String[] args) {

	int n = 7; // numerator
	int d = 3; // denominator

	System.out.printf("%d (integer) divided by %d is %d, ", n, d, n / 3);
	System.out.print("and the remainder is " + (n % d) + " or, ");
	System.out.printf("%d modulus %d is %d\n", n, d, n % d);

	// hint, hint..
	int in = 27;
	System.out.printf("%d inches is %d feet and %d inches\n", in, in/12, in%12);
	
    }
}
