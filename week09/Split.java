// the `split` method is another string method which returns an array
// of strings based on a "separator"

public class Split {

    public static void main(String[] args) {

	String s = "a man a plan a canal, panama";
	String[] words = s.split(" "); // separator = " "

	// iterate over this array of strings
	for(int i = 0; i < words.length; i++) {
	    System.out.println("the current word: " + words[i]);
	}
    }
}
