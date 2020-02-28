// simple example of a do-while loop

public class DoWhileExample {

    public static void main(String[] args) {
	doCountdown(10); // same effect as `countdown`..
	doCountdown(-7); // would try at least once before checking
    }

    public static void doCountdown(int n) {

	do { // try once, then check condition..
	    System.out.println(n);
	    n = n - 1;
	}
	while (n > 0);

	System.out.println("Blastoff!");
    }
}
