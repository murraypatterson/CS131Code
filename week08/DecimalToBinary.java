// we can use recursion to get the binary representation of decimal
// digit, e.g., 10 -> 1010, 2 -> 10, 5 -> 101..

public class DecimalToBinary {

    public static void main(String[] args) {

	displayBinary(10);
	System.out.println();

	displayBinary(2);
	System.out.println();

	displayBinary(5);
	System.out.println();
    }

    // display binary representation of a decimal
    public static void displayBinary(int value) {

	if (value > 0) {
	    displayBinary(value / 2);
	    System.out.print(value % 2);
	}
    }
}
