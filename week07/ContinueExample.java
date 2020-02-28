import java.util.Scanner;

// simple example of a continue statement

public class ContinueExample {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int x = -1;

	// in this loop we take the sum of some entered numbers,
	// effectively adding only positive numbers, and stopping the
	// loop when a `0` is entered
	int sum = 0;
	while (x != 0) {
	    x = in.nextInt();

	    if (x <= 0) {
		continue; // should this statement be reached, we
			  // immediately go on to the next iteration,
			  // skipping the rest of the body of the
			  // while loop
	    }

	    System.out.println("Adding " + x);
	    sum += x;
	}

	System.out.println("sum is : " + sum);
    }
}
