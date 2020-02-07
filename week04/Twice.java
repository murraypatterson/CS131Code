// example of a method which takes a parameter

public class Twice {

    // definition of the method (what it does with `s`)
    public static void printTwice(String s) {
	System.out.println(s);
	System.out.println(s);
    }

    public static void main(String[] args) {
	// calling the method with a string (which gets stored as `s`)
	printTwice("Don't make me say this twice!");
    }
}
