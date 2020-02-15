/*

  simple example of

  1. relational operators: which take `int` types, `double` types
  etc., and return `True` or `False` (a `boolean` type), and

  2. logical operators: which take `boolean` types (which may be`True`
  or `False` --- just like an `int` type may be `-1`, or `2`, or
  `-456`, or.. etc.), and return `True` or `False` (a `boolean` type)

*/

public class Relational {

    public static void main(String[] args) {

	int a = 2;
	int b = 3;
	double x = 2.0;
	double y = 3.0;

	// the addition operation (what we knew from before)
	System.out.println("a + b = " + (a+b));
	System.out.println("x + y = " + (x+y));
	System.out.println("a + x = " + (a+x));
	// Note: `a` converted to the `double` type before the
	// operation can be performed

	// relational operations (returns a `True` or a `False`)
	System.out.println("is a > b ? : " + (a > b));
	boolean result = (x < y); // we can store it in a variable of
				  // type `boolean`
	System.out.println("is x < y ? : " + result);
	System.out.println("is a == x ? : " + (a == x));
	// Note: again, `a` converted to the `double` type before the
	// operation can be performed

	// logical operations (returns `True` or `False`, given other
	// expressions which are either `True` or `False`
	System.out.println("is a == x AND x > b ? : " + ((a == x) && (a > b)));
	result = ((a == x) || (a > b)); // just a boolean..
	System.out.println("is a == x OR x > b ? : " + result);
    }
}
