// simple example of loops

public class Loops {

    public static void main(String[] args) {

	// basic while loop
	System.out.println();
	System.out.println("while loop..");
	int i = 0;
	while(i < 4) { // keep running until `i < 4` becomes false
	    System.out.println("i = " + i);
	    i++;
	}

	// basic for loop
	System.out.println();
	System.out.println("for loop..");
	for(int j = 0; j < 4; j++) { // do the above (..from 0 to 3)
	    System.out.println("j = " + j);
	}

	// one reason for using loops?  To go through all the elements
	// of an array !
	int[] b = {8,3,5,2}; // one-shot initialization of `b`
	System.out.println();
	System.out.println("loop through elements of the `b` array..");
	for(int j = 0; j < 4; j++) {
	    System.out.println("b[" + j + "] = " + b[j]);
	}
    }
}
