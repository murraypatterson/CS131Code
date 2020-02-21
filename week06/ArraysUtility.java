import java.util.Arrays;

// the Arrays utility, imported above (for `toString` method, etc.)

public class ArraysUtility {

    public static void main(String[] args) {

	int[] b = {8,3,5,2}; // one-shot initialization of `b`

	b[2] = 7; // modify some elements..
	b[0] = 1;

	// one-shot output of `b`
	System.out.println("b = " + Arrays.toString(b));
    }
}
