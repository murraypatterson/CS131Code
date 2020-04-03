#include <stdio.h>

// an illustration of some of the format specifiers available

int main() {

  // we can read characters
  char c;
  printf("Enter a character (e.g. 'A')\n");
  scanf("%c", &c); // `%c` for `char` type

  // we can read floating point numbers
  double t;
  printf("Enter a floating point number to represent the temperature (e.g., 68.5 degrees)\n");
  scanf("%lf", &t); // `%lf` means "long float", another name for `double`

  // we can read strings: note that a string is an array of characters
  // in C (there is no string type).  Note also the slight difference
  // in notation as well (in Java, this array of characters `s` would
  // be initialized: `char[] s = new char[9];`)
  char s[9]; // array of 9 characters
  printf("Enter the name of a town (e.g., \"Fairfield\")\n");
  scanf("%s", s); // note no `&`, since `s` is already an array.
		  // While the `%s` format specifier reads in a string
		  // of any length (until the user types <Enter>),
		  // careful not to enter a string of length more than
		  // 9 (see what happens when you do..)

  // and print them all using their various format specifiers..
  printf("It is %lf degrees in %s --- today was brought to you by the letter %c.\n", t, s, c);

  return 0;
}
