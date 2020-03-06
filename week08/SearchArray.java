// nice use case for a return statement in a loop --- return when we
// find something..

public class SearchArray {

    public static void main(String[] args) {

	int[] a = {1,4,7,6,43,5,7,8};

	int elem = 7;
	System.out.println("elem: " + elem + " is at index: " + search(a,elem));

	elem = 9;
	System.out.println("elem: " + elem + " is at index: " + search(a,elem));
    }

    public static int search(int[] a, int e) {

	for(int i = 0; i < a.length; i++) {

	    if(a[i] == e) {
		return i;
	    }
	}

	return -1; // get here only if we do not find anything in the
		   // above loop, and so we return the (default) -1
    }
}
