#include <stdio.h>
#include <string.h>

// `strcat`: a C library function which concatenates one string onto
// another string

int main() {

  char string5[20] = "Hello, ";
  char string6[] = "world!";

  printf("string5: \"%s\"\n", string5);

  // concatenate "world!" onto "Hello, " to obtain "Hello, world!".
  // Note that we declared `string5` with extra space, to make room
  // for the appended `string6`
  strcat(string5, string6);

  printf("string5 is now: \"%s\"\n", string5);

  return 0;
}
