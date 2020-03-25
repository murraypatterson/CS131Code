// the `substring` method returns a new string from a given string,
// starting at a given index

public class Substring {

    public static void main(String[] args) {

	String fruit = "banana";

	System.out.println(fruit.substring(0)); // starting at index `0`
	System.out.println(fruit.substring(2)); // index `2`
	System.out.println(fruit.substring(6)); // index `6`

	// overloaded version of `substring`: returns a new string
	// from a given string, starting at the first index, and
	// stopping just before the second index

	// starting at index `0`, stopping before index `3` (at `2`)
	System.out.println(fruit.substring(0, 3)); 
       	System.out.println(fruit.substring(2, 5)); // start `2`, stop `4`
    }
}
