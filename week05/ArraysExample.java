/*

  simple example of how to declare an array, how to initialize (the
  size and the values of) an array, and how to use arrays.  Arrays are
  a built-in feature of Java (like the primitive types `int`,
  `double`, `boolean`, etc.)

*/

public class ArraysExample {

    public static void main(String[] args) {

	// declaring arrays
	int[] counts; // array of int
	double[] values; // array of double

	// initialize the size of arrays
	counts = new int[4]; // set `counts` array to size 4
	int size = 33; // the size of an array can be a variable, but
		       // it has to be an (positive) `int`
	values = new double[size]; // set `counts` to `size` (33)

	// declare and initialize the size of an array in one shot
	int[] a = new int[8]; // a one-liner..

	// using arrays: now that we have declared and initialized the
	// size of the `counts` array to 4, we can access (or "index")
	// these 4 elements at indexes 0, 1, 2 and 3.
	counts[0] = 7; // note that `counts[0]` has type `int`
	counts[1] = counts[0] * 2; // so does this..
	counts[2]++; // and so we can set them to values..
	counts[3] -= 60;

	// and we can print them out.. like we do with `int`..
	System.out.println("The `counts` array contains:");
	System.out.println(counts[0]);
	System.out.println(counts[1]);
	System.out.println(counts[2]);
	System.out.println(counts[3]);	
	System.out.println();
	
	/*
	  Note: that indexes for the elements of this counts array (of
	  size 4) are 0..3, and if we tried to access `counts[4]`, or
	  `counts[-1]`, we would get an `ArrayIndexOutOfBounds`
	  exception.. try it out!
	*/	  
	System.out.println("Oops, too far:");
	try {
	    System.out.println(counts[4]); // error..
	}
	catch(Exception e) {
	    System.out.println(e);
	    System.out.println();
	}

	// while trying to access `counts` itself, will just give you
	// its memory address
	System.out.println("memory address of `counts` array: " + counts);
	System.out.println();
	// this we do not care about, nor need in most cases..
	
	/*
	  In general, an array of size `size` has elements at indexes
	  0, 1, 2, .., `size` -1 --- this means that, e.g., the
	  `values` array has elements at indexes 0, 1, 2, .., 32
	*/
	System.out.println("The `values` array contains:");
	System.out.println(values[0]); // `values[0]` has type `double`
	System.out.println(values[0]); // so does this..
	System.out.println("...");
	System.out.println(values[32]); // they are all 0.0 (by default)
	System.out.println();

	// finally, we can declare, initialize the size AND the values
	// of an array in one shot
	int[] b = {8,3,5,2}; // size is (implicitly) 4 here
	System.out.println("The `b` array contains:");
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
	System.out.println(b[3]);
    }
}
