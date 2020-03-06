// methods may also return boolean (true or false) values

public class BooleanMethod {

    public static void main(String[] args) {

	System.out.println(isSingleDigit(8));
	System.out.println(isSingleDigit(22));
    }

    public static boolean isSingleDigit(int x) {
	if (x > -10 && x < 10) {
	    return true;
	}
	else {
	    return false;
	}
    }
}
