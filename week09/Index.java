// the `indexOf` method returns the index of a character in a string

public class Index {

    public static void main(String[] args) {

	String fruit = "banana";

	// returns the index of the first instance of 'a'
	int index = fruit.indexOf('a');
	System.out.println(index);

	// return the index of the first instance of 'a', starting at
	// index `2` (index of the first instance already bypassed)
	int indexTwo = fruit.indexOf('a', 2);
	System.out.println(indexTwo);

	// overloaded version of `indexOf`: returns the index of the
	// first instance of (sub-) string "na"
	int indexThree = fruit.indexOf("na");
	System.out.println(indexThree);
    }
}
