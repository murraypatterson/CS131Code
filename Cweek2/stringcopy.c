#include <stdio.h>
#include <string.h>

// `strcpy`: a C library function which copies a string a string

int main() {

  // suppose we want to copy this string over to another string
  char string1[] = "Hello, world!";

  char string2[20]; // declare new string with enough space

  // NOTE: `strlen` is another function which give the "length" of a
  // string (we well get to this one later)
  for(int i = 0; i < strlen(string1); i++) {
    string2[i] = string1[i]; // copy one-by-one
  }
  printf("string2: %s\n", string2);

  char string3[20]; // declare a third string with enough space

  // the `strcpy` allows us to do this (more) automatically "mimics"
  strcpy(string3, string1); // "mimics" string3 = string1 (like in Java)
  printf("string3: %s\n", string3);
  
  return 0;
}
