// arrays have an attribute `length`

public class ArrayLength {

    public static void main(String[] args) {

	int[] b = {8,3,5,2}; // one-shot initialization of `b`

	b[2] = 7; // modify some elements..
	b[0] = 1;

	// output the length of `b`
	System.out.println("b has length: " + b.length);

	// now that we know than array also has a length, we can pass
	// the entire array to a method (and this length goes with it)
	displayArray(b);
    }

    // display a given array --- notice that it can access the length
    // of the array passed to it..
    public static void displayArray(int[] a) {
	System.out.println("elements of the array are..");
	for(int i = 0; i < a.length; i++) {
	    System.out.println("at index " + i + ": " + a[i]);
	}
    }
}
