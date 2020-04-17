#include <stdio.h>
#include <string.h>

// `strlen`: a C library function which computes and returns the
// length of a string

int main() {

  char string7[] = "abc";

  int len = strlen(string7); // it just returns an `int`: the length

  printf("string7: \"%s\" has length %d\n", string7, len);

  return 0;
}
