import java.util.Scanner; // to allow usage of Scanner
import java.util.Random; // to allow usage of Random

/*
  small compare and contrast of the usage of primitive types versus
  classes.  In this case, we demonstrate with the classes Scanner and
  Random.  Java has several primitive types, like `int` or `double`,
  but many more classes.  Classes are more general than primitive
  types.  Note: that only knowledge of how to use (the) classes
  (Scanner and Random) will tested in this course, not background on
  them --- this is more for curiosity purposes
*/

public class Classes {
    
    public static void main(String[] args) {

	// primitives
	int a; // declare an `int`
	a = 3; // assign it a value
	double b = 4.56; // initialize a `double` and assign it a value
	System.out.println("a is " + a + " and b is " +b);

	// the Scanner class
	Scanner scanner; // declare a `Scanner`
	scanner = new Scanner(System.in); // "assign" it a value
					  // (construct an object of
					  // class `Scanner`)
	System.out.println("Please enter an integer:");
	a = scanner.nextInt(); // now methods can be called on it:
			       // this one reads from input and passes
			       // an `int` to `a`
	System.out.println("a is now " + a + " and b is still " + b);

	// the Random (number generator) class
	Random random = new Random(); // declare a `Random` an
				      // construct an object of type
				      // `Random`
	a = random.nextInt(100) + 1; // now this method can be called
				     // on it: this one generates a
				     // random number between 0 and 99
				     // and passes this as an `int` to
				     // `a`
	System.out.println("My random number is " + a);

    }
}
