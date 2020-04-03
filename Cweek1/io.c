#include <stdio.h>

// example of taking an int from the user and outputting it

int main() {

  int x;
  printf("Enter an integer:\n");

  // functions like the `nextInt()` method of `Scanner`.  Note the two
  // arguments: (1) is `%d` to indicate that the input from the user
  // is to be interpreted as an integer; and (2) is `&x` to signify
  // the "memory address" of x, i.e., we are reading this integer into
  // the memory location where (int) `x` is stored
  scanf("%d", &x);

  printf("x = %d\n", x); // output `x` as usual..

  return 0;
}
