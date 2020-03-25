// strings are immutable, that is they can be created and destroyed,
// but never changed

public class Immutable {

    public static void main(String[] args) {

	// `toUpperCase` is a string method which casts all characters
	// in a string to upper case.  It does this by returning a new
	// string with all characters upper case, leaving the original
	// string unchanged
	String name = "Sammy Salamander";
	String upperName = name.toUpperCase();
	System.out.println(name);
	System.out.println(upperName);

	// Here, we call `text.replace` to replace in `text`, all
	// instances of "Sunday" with "Monday": again by returning a
	// new string with this replacement done (original unchanged)
	String text = "Today is Sunday!";
	String newText = text.replace("Sunday", "Monday");
	System.out.println(text);
	System.out.println(newText);
    }
}
