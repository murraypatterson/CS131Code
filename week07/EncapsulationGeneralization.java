/*

  The end result of following the ongoing "Encapsulation &
  Generalization" example from the `Slides Week 7` (or from the Java
  textbook) for incrementally designing a method for printing out a
  given number of rows of the multiplication table

*/

public class EncapsulationGeneralization {

    public static void main(String[] args) {
	printTable(10);
	//printTableWithForLoop(10); // see below..
    }

    public static void printTable(int rows) {

	int i = 1; // initialize
	while (i <= rows) { // condition to check
	    printRow(i, rows);
	    i = i + 1; // update
	}
    }

    public static void printRow(int n, int cols) {

	int i = 1;
	while (i <= cols) {
	    System.out.printf("%4d", n * i);
	    i = i + 1;
	}

	System.out.println();
    }

    /*
      Extra: Note that the above `printRow` can also be done with a
      for loop.. 
    */
    public static void printTableWithForLoop(int rows) {

	/*
	  now the (1) initialize, (2) condition to check and (3)
	  update are all done in one shot (separated by ;'s)
	*/ 
	for(int i = 1; i <= rows; i = i + 1) {
	    printRow(i, rows);
	}
    }
}
