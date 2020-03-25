// we can traverse strings in very similar ways that we can traverse
// arrays, with `for` loops, enhanced `for` loops, etc.

public class Traversal {

    public static void main(String[] args) {

	String fruit = "banana";

	// using a `for` loop: note that `length()` is a method, and
	// that we cannot index (we cannot use `fruit[i]`) strings
	// directly (need to use `charAt`)
	for (int i = 0; i < fruit.length(); i++) {
	    char letter = fruit.charAt(i);
	    System.out.print(letter);
	}
	System.out.println();

	// using an enhanced for loop, by using the string method
	// `toCharArray()`, which returns the string as a `char[]`
	for (char letter : fruit.toCharArray()) {
	    System.out.print(letter);
	}
	System.out.println();

	// reverse the string and output it
	String tiurf = reverse(fruit);
	System.out.println(tiurf);
    }

    // read in string `s`, and create another string by traversing `s`
    // in reverse order, accumulating characters onto `r`
    public static String reverse(String s) {

	String r = "";
	for (int i = s.length() - 1; i >= 0; i--) {
	    r = r + s.charAt(i); // `+` returns `r` with `s.charAt(i)`
				 // concatenated onto the end of `r`.
				 // We replace `r` with this new value
				 // (strings are still immutable)
	}

	return r;
    }
}
