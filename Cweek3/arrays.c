#include <stdio.h>
#include <string.h>

// a demonstration that arrays are just pointers, in fact

int main() {

  char s[] = "hello"; // an array of characters (a string)
  printf("s = %s\n", s);

  printf("s[0] = %c\n", s[0]); // so s[0] is just a character (the
			       // first character)
  printf("*s = %c\n", *s); // an array is a pointer

  /*
     In the above, we see that a string (array of characters) `s` is
     simply a pointer-to-char (which is why we do not need the `&`
     when passing it to `scanf`, for example).  In this case `s`
     points to the first of 5 consecutive memory addresses
     {'h','e','l','l','o}, each of which stores a `char` --- hence *s
     gives the first one, 'h'.

     Below, since `s` is really just a pointer-to-char, we can assign
     the pointer-to-char `p` to point to the same memory location as
     `s`, and then successively "increment" the pointer, to advance it
     to the next memory address, printing out each character as we go.
  */

  printf("letter by letter: ");
  char* p = s;
  for(int i = 0; i < strlen(s); i++) {
    printf("%c", *p);
    p += 1;
  }
  printf("\n");

  return 0;
}
