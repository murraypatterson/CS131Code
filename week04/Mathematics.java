// example of basic mathematics methods, which are part of the
// `java.lang.Math` class
// (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

public class Mathematics {

    public static void main(String[] args) {

	double root = Math.sqrt(17.0);
	double angle = 1.5;
	double height = Math.sin(angle);
	double power = Math.pow(2, -1);
	
	System.out.println("root = " + root);
	System.out.println("height = " + height);
	System.out.println("power = " + power);
    }
}
