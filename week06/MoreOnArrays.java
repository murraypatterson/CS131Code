import java.util.Arrays;

// other things that one can do with an array..

public class MoreOnArrays {

    public static void main(String[] args) {

	double a[] = {2.4, 4.5, 6.0, 1.9}; // one-shot init of `a`
	System.out.println("a = " + Arrays.toString(a));
	
	// square every element of `a`
	for (int i = 0; i < a.length; i++) {
	    a[i] = Math.pow(a[i], 2.0);
	}
	System.out.println();
	System.out.println("after squaring every element..");
	System.out.println("a = " + Arrays.toString(a));
	
	System.out.println();
	System.out.println("search in `a` for: " + 36.0);
	search(a, 36.0);

	System.out.println();
	System.out.println("sum up the elements of `a`..");
	sum(a);
    }

    // search in array `a` for index of a `target` value
    public static void search(double[] a, double target) {
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == target) {
		System.out.println("found " + target + " at index: " + i);
	    }
	}
    }

    // report the sum of all element in an array `a`
    public static void sum(double[] a) {
	double total = 0.0;
	for (int i = 0; i < a.length; i++) {
	    total += a[i];
	}
	System.out.println("sum of the elements in the array is: " + total);
    }
}
