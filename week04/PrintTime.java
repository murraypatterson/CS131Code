// example from Section 4.7 of the Java text

public class PrintTime {

    public static void printTime(int hour, int minute) {
	System.out.print(hour);
	System.out.print(":");
	System.out.println(minute);
    }

    public static void main(String[] args) {
	int hour = 11;
	int minute = 59;
	printTime(hour + 1, 0);
    }
}

/*

  Note that the stack diagram of Figure 4.1 of the Java text can be
  represented textually as:

    main [ hour [11]  minute [59] ]
      printTime [ hour [12]  minute [0] ]

  Notice the indent, as `main` is calling the `printTime` method

*/
