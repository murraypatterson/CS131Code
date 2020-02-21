import java.util.Arrays;

// copying arrays, and more

public class CopyingArrays {

    public static void main(String[] args) {

	// primitives, notice that the `=` operation copies over
	// values (and does not equate variables)
	System.out.println();
	System.out.println("primitives..");
	int x = 3;
	int y = x; // `y` gets value `3`
	x = 4; // `y` still has value `3`
	System.out.println("x = " + x + ", y = " + y);

	// arrays, notice how something different happens..
	System.out.println();
	System.out.println("arrays..");

    	double a[] = {2.3, 4.5, 6.0, 1.9}; // one-shot init of `a`
	System.out.println("a = " + Arrays.toString(a));

	double b[] = a;
	b[0] = 5.6; // modify a value in `b` array

	// what?? `a` is not changed as well?
	System.out.println();
	System.out.println("after changing `b`..");
	System.out.println("a = " + Arrays.toString(a));
	// this is because both arrays are just "aliases" for the same
	// set of `double` values

	// need to do this instead..
	double[] c = new double[a.length];
	for (int i = 0; i < a.length; i++) {
	    c[i] = a[i]; // copy elements over, one by one
	}

	c[0] = 3.14159; // modify a value in `c` array

	// this has no effect on `a`, because `c` is a separate copy
	System.out.println();
	System.out.println("after changing `c`..");
	System.out.println("a = " + Arrays.toString(a));
    }
}
