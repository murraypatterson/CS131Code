#include <stdio.h>

// an example of string literals, characters and strings

int main() {

  // in C, a string is just an array of characters.  But we can still
  // initialize it with a "string literal", like in Java, as we see
  // here
  char string[] = "Hello World!";

  printf("%s\n", string);

  // note that because a string is just an array of characters, we may
  // index such an array (to get a character), and even modify
  // elements of this array (i.e., strings in C are no immutable like
  // they are in Java)
  string[0] = 'h';
  string[2] = 'B';

  printf("%s\n", string);

  // there is a difference between a character 'H' and an array "H" of
  // length 1 --- it is important to know the difference, for example:

  // string[0] = "H"; // is incorrect

  // printf takes strings, so outputting a character must be done with
  // a formatting string, just like with an int (`%d`), for example
  printf("%c",'H');
  printf("\n"); // as is the case when printing the (single) end of
		// line character
}
