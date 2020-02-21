// Java has the nice feature of the enhanced for loop

public class EnhancedForLoop {

    public static void main(String[] args) {

	int[] a = {2,6,4,1,8}; // initialize `a` (in one shot)

	// normal for loop
	System.out.println();
	System.out.println("normal for loop..");
	for(int i = 0; i < a.length; i++) {
	    System.out.println("a[" + i + "] = " + a[i]);
	}

	// enhanced for loop
	System.out.println();
	System.out.println("enhanced for loop..");
	for (int element : a) { // simpler to run
	    System.out.println(element); // but we don't have the index
	}	
    }
}
