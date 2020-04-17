#include <stdio.h>
#include <string.h> // library with many string functions

// first taste of string functions in C

int main() {

  char string[64];

  printf("please enter a string (with spaces if you wish):\n");
  
  // collect string of no more than 64 characters from console (stdin)
  fgets(string, 64, stdin);

  // write string to the console
  puts(string);

  return 0;
}
