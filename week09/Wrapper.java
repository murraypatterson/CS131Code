// example of wrapper class for the `int` primitive type

public class Wrapper {

    public static void main(String[] args) {

	// primitive types (like `int`, `double`, and `char`) do not
	// provide methods.  For example, you cannot call `equals` on
	// an `int`..
	int i = 5;
	//System.out.println(i.equals(5)); // compiler error

	// however, for each primitive type, there is a corresponding
	// class in the Java library, called a "wrapper class".  The
	// wrapper class for `char` is called `Character`; for `int`
	// it is `Integer`.  Other wrapper classes include `Boolean`,
	// `Long`, and `Double`
	Integer I = 5;
	System.out.println(I.equals(5)); // ok
    }
}

// In some sense, the `String` is just a wrapper class for `char[]`..
