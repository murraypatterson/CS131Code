// from exercise 5.6 of the Java textbook

public class Buzz {

    public static void baffle(String blimp) {
	System.out.println(blimp);
	zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
	if (flag < 0) {
	    System.out.println(quince + " zoop");
	}
	else {
	    System.out.println("ik");
	    baffle(quince);
	    System.out.println("boo-wa-ha-ha");
	}
    }

    public static void main(String[] args) { // 1
	zippo("rattle", 13); // 2 .. etc.
    }
}

/*

  Note: you can just answer parts 3. and 4. of exercise 5.6 here in
  the comments, i.e.,

  3. (your answer here)

  4. (your answer here)

*/
