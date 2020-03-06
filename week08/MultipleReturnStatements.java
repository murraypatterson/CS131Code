// example of a method with two return statements

public class MultipleReturnStatements {

    public static void main(String[] args) {

	System.out.println(absoluteValue(-5));
    }

    public static double absoluteValue(double x) {

	if (x < 0) {
	    return -x;
	}
	else {
	    return x;
	}

	// this line is never reached..
    }
}
