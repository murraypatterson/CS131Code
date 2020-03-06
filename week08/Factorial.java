// note that the `factorial` function (represented with `!`), that we
// dealt with in one of the homeworks, has a very natural recursive
// definition

public class Factorial {

    public static void main(String[] args) {

	for(int i = 0; i < 6; i++) {
	    System.out.println(i + "! = " + factorial(i));
	}
    }

    // compute n! ..
    public static int factorial(int n) {

	if (n == 0) {
	    return 1;
	}

	int recurse = factorial(n - 1);
	int result = n * recurse;

	return result;
    }
}
