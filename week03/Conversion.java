import java.util.Scanner;

// using Scanner to get an `int`

public class Conversion {

    public static void main(String[] args) {

	int inch;
	double cm;

	Scanner in = new Scanner(System.in);

	System.out.print("How many inches? ");
	inch = in.nextInt(); // careful ! make sure you don't type "hello" instead..

	cm = inch * 2.54;
	System.out.print(inch + " in = ");
	System.out.println(cm + " cm");

    }
}
