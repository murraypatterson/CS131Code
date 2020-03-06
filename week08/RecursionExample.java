// simple example of recursion

public class RecursionExample {

    public static void main(String[] args) {
	countdown(10); // same effect as `countdown` from
		       // `WhileExample.java (of week07)
    }

    // a method which calls itself (recursively)..
    public static void countdown(int n) {

	if (n == 0) {
	    System.out.println("Blastoff!");
	}
	else {

	    System.out.println(n);
	    countdown(n-1);
	}
    }
}
