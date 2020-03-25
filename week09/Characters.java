// A character (`char`) is a primitive type like `int`, `double`, etc.
// A string is composed of characters, it is alike an array of `char`

public class Characters {

    public static void main(String[] args) {

	String fruit = "banana";
	char letter = fruit.charAt(0); // character at index `0`
	char anotherLetter = fruit.charAt(1); // at index `1`

	System.out.println(letter); // can print a `char`
	System.out.println(anotherLetter);
	//fruit.charAt(10); // out of bounds.. throws an exception

	if (anotherLetter == 'a') { // can compare `char` types
	    System.out.println('?'); // and print them, like `int`
	}

	// characters are ordered, so we can even loop through them
	for (char c = 'A'; c <= 'Z'; c++) {
	    System.out.print(c);
	}
	System.out.println();
    }
}

/*
  Note: in fact, there is a standard on how characters are ordered,
  namely the American Standard Code for Information Interchange
  (ASCII) standard.  See http://www.asciitable.com/
*/
