// we can have methods which differ only in number of parameters, and
// the method used will depend on how many parameters are passed to
// it.  This is known as Method Overloading

public class MethodOverloading {

    public static void main(String[] args) {

	printSillyStuff("hi"); // use first method
	printSillyStuff("hey", "there"); // use second method
    }

    public static void printSillyStuff(String s) {

	System.out.println();
	System.out.println("in `void printSillyStuff(String s)`..");
	System.out.println("Silly stuff passed in: " + s );
    }

    public static void printSillyStuff(String s1, String s2) {

	System.out.println();
	System.out.println("in `void printSillyStuff(String s1, String s2)..`");
	System.out.println("Silly stuff passed in: " + s1 );
	System.out.println("More Silly stuff passed in: " + s2 );
    }
}
