// simple example of a value method

public class ValueMethodExample {

    public static void main(String[] args) {

	// call method, but don’t capture value returned
	calculateArea(5.0);

	double result = calculateArea(5.0); // capture value in `result`
	System.out.println("calculateArea result: " + result);
    }

    public static double calculateArea(double radius) {

	double result = Math.PI * radius * radius;
	return result;
    }
}
