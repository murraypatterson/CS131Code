import java.util.Scanner; // for user input
import java.util.Random; // for random numbers

public class JavaFinalReview {

    public static void main(String[] args) {

	// each '\n' gives us a new line
	System.out.println("\nHi there!, how are you?");

	Scanner scanner = new Scanner(System.in); // read from stdin
	
	int choice = -1;
	while(true) {

	    System.out.println("\n---"); // another new line at the beginning
	    System.out.println("Press 1 for some randomness");
	    System.out.println("Press 2 to be converted");
	    System.out.println("Press 3 for a wide array of activities");
	    System.out.println("Press 4 for fun with words");
	    System.out.println("Press anything else to exit.");
	    System.out.println("---\n"); // new line at the end

	    try { // try, in case the user enters "blahblah" instead of an int
		choice = scanner.nextInt();
	    }
	    catch(Exception e) {
		System.out.println("bye bye..");
		return; // return from main --- main is just a method afterall
	    }

	    switch(choice) { // a switch statment
	    case 1:
		randomDance(scanner);
		break; // break from switch statement (but not the loop)
	    case 2:
		conversion();
		break;
	    case 3:
		arrays();
		break;
	    case 4:
		palindromes();
		break;
	    default:
		System.out.println("bye bye..");
		return; // return from main --- i.e., from the whole program
	    }
	}
    }

    // 1
    public static void randomDance(Scanner scanner) {

	System.out.println("Get ready for some randomness...");

	Random random = new Random(); // random number generator

	boolean flag = true;
	int r;
	while(flag) {
	    r = random.nextInt();
	    System.out.println("Here is a random number: " + r);

	    // \" for having quotes in my string (instead of ending the string)
	    System.out.println("Press \"y\" for another random number");

	    flag = false; // guilty until proven innocent..
	    if(scanner.hasNext()) {
		if(scanner.next().equals("y")) {
		    flag = true; // loop condition is saved for this round..
		}
	    }
	}
    }

    // 2
    public static void conversion() {

	System.out.println("Thou shalt be converted...");

	int inch = 3;
	double cm = inch * 2.54;

	System.out.println(inch + " inches is " + cm + " centimeters");
	System.out.print(inch + " inches is ");
	System.out.println(inchesToCentimeters(inch) + " centimeters");

	// format an int and a double
	System.out.printf("%d inches is %f centimeters\n", inch, cm);
    }

    // convert inches to centimeters and return the result
    public static double inchesToCentimeters(int inch) {
	return 2.54 * inch;
    }

    // 3
    public static void arrays() {

	System.out.println("Everything in array, instead of disarray...");

	int[] a = {3,7,12,4,5,6};

	// formatArray returns a string, which is then concatenated to the other string
	System.out.println("My array is : " + formatArray(a));

	System.out.println("Let's print each number <number> times\n");
	for(int i = 0; i < a.length; i++) {
	    for(int j = 0; j < a[i]; j++) {
		System.out.print(a[i] + " ");
	    }
	    System.out.println();
	}

	System.out.print("\nNow let's see which numbers are divisible by ");
	System.out.println("the length of the array");
	int len = a.length;
	System.out.println("The length of " + formatArray(a) + " is " + len + "\n");
	for(int i = 0; i< len; i++) {
	    System.out.print(a[i] + " is ");
	    if(a[i] % len != 0) {
		System.out.print("NOT ");
	    }
	    System.out.println("divisible by " + len);
	}
    }

    // string output of an array
    public static String formatArray(int[] a) {

	String result = "[";
	for(int i = 0; i < a.length - 1; i++)
	    result += a[i] + ",";
	return result + a[a.length - 1] + "]";
    }

    // 4
    public static void palindromes() {

	System.out.println("A man, a plan, a canal, Panama...");

	System.out.print("A palindrome is a word spelled the same ");
	System.out.println("backwards as forwards.\n");

	System.out.println("Consider the phrase:\n");
	String s = "I thought I won a level five racecar on ";
	s += "New Year's Eve but it was just a Honda Civic";
	System.out.println("\""+s+"\"");

	System.out.println("\nLet us go through the words and mark ");
	System.out.println("the ones which are palidromes:\n");

	String[] ss = s.split(" "); // split string into array of strings
	for(String word : ss) {
	    System.out.print(word);
	    if(isPalindrome(word)) {
		System.out.print(" (** palindrome **)");
	    }
	    System.out.println();
	}
    }

    // return true if the string is a palindrome, false otherwise
    public static boolean isPalindrome(String s) {

	s = s.toLowerCase(); // let's ignore case

	// compare first to last, second to second last, ...
	for(int i = 0; i < s.length() / 2; i++) {
	    if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
		return false;
	    }
	}
	return true;
    }
}
