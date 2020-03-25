// strings are objects, and so we cannot compare them with `==`
// operator, we must use the string method `equals`

public class Compare {

    public static void main(String[] args) {

	// two different strings with the same content
	String name1 = new String("Sam I am.");
	String name2 = new String("Sam I am.");

	// the `==` operator checks whether the two variables refer to
	// the same object (by comparing the references).  If you give
	// it two different strings that contain the same content, it
	// yields false

	if (name1 == name2) { // incorrect!
	    System.out.println("(using `==`)  The names are the same.");
	}

	if (name1.equals(name2)) { // correct!
	    System.out.println("(using `equals`)  The names are the same.");
	}
    }
}
