// slightly more complex situation with two methods

public class TwoMethods {

    public static void main(String[] args) {
	saySomething(); // calling the first method
	saySomethingElse(); // calling the other method
	saySomething(); // calling the first method, again
    }

    // definition of the method (what it does)
    public static void saySomething() {
	System.out.println("Hello World!");
    }

    // definition of another method
    public static void saySomethingElse() {
	System.out.println("How are you?");
    }
}
