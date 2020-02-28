// simple example of a break statement

public class BreakExample {

    public static void main(String[] args) {
	breakCountdown(10); // same behavior as `countdown`..
    }

    public static void breakCountdown(int n) {

	while (true) { // loops infinitely.. (unless we break..)

	    if (n <= 0) { // normal `if` statement
		break; // should this statement be reached, we "break"
		       // out of the loop immediately
	    }
	    
	    System.out.println(n);
	    n = n - 1;
	}

	System.out.println("Blastoff!");
    }
}
