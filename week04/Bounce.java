// even more complex situation with two methods where one method calls
// the other: here we are "bouncing" around in the methods

public class Bounce {

    public static void main(String[] args) {
	saySomething(); // call the first method
	saySomethingElse(); // call the other method (which, in turn
			    // calls the first method)
    }

    // definition of the method (what it does)
    public static void saySomething() {
	System.out.println("Hello World!");
    }

    // definition of another method
    public static void saySomethingElse() {
	System.out.println("How are you?");
	saySomething(); // a call to the first method is part of the
			// definition of this second method
    }
}

/*

  Note: that this program outputs

    Hello World!
    How are you?
    Hello World!

  because `main` calls `saySomething`, printing out "Hello World!",
  and then `main` calls `saySomethingElse`, which prints out "How are
  you?", but then `saySomethingElse` calls `saySomething`, printing
  out "Hello World!" again.  We can represent the flow of this program
  with the following "textual version" of the stack diagram (mentioned
  in section 4.7 of the Java text):

    main
      saySomething
      saySomethingElse
        saySomething

*/
