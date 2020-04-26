#include <stdio.h>

// simple example of pointers, the & and * operations

int main() {

  int i = 1; // an integer
  int* p; // a pointer-to-int

  /*
    a pointer really needs to have a type, e.g. `int*` above, because
    it needs to know how how big the chunk of memory that it is
    pointing to (how big the chunk of memory that the address refers
    to) --- in the case of `int`, it is 4 bytes (as we saw in
    `overlflow.c`)
  */

  p = &i; // p points to i (&i is the "address" of `int i`)
  printf("%d\n", *p); // prints i, which is 1

  /*
    Note that `*p` is the act of "dereferencing" the pointer:
    returning the value of the variable stored at the memory address
    that `p` points to
  */

  *p = 5; // sets i to 5
  printf("%d\n", i);

  return 0;
}
