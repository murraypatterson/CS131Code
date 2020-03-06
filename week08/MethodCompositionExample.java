// composing a set of value methods for computing the area of a circle

public class MethodCompositionExample {

    public static void main(String[] args) {

	// circle centered at the origin of the Cartesian plane, with
	// the point (4.0, 3.0) on the circle
	double xc = 0.0;
	double yc = 0.0;
	double xp = 4.0;
	double yp = 3.0;

	System.out.println("Circle has area : " + circleArea(xc, yc, xp, yp));
    }

    // find Euclidean distance, then compute the area, by composing
    // the methods below
    public static double circleArea(double xc, double yc, double xp, double yp) {

	double radius = distance(xc, yc, xp, yp);
	double area = calculateArea(radius);

	return area;
    }

    // Euclidean distance between the Cartesian coordinates (x1,y1)
    // and (x2,y2)
    public static double distance(double x1, double y1, double x2, double y2) {

	return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
    }

    // from `ValueMethodExample.java`..
    public static double calculateArea(double radius) {

	double result = Math.PI * radius * radius;

	return result;
    }
}
