#include <stdio.h>

// a few of the many similarities between C and Java

int main() {

  int x = 3; // declare/initialize an integer in the same way

  // if statements are the same !
  if(x > 0) {
    printf("x is positive\n");
  }
  else {
    printf("x is negative or zero\n");
  }

  // the modulus `%` operator is the same !
  if(x % 2 == 0) {
    printf("x is even\n");
  }
  else {
    printf("x is odd\n");
  }

  // for loops are the same !
  printf("for loop:\n");
  for(int i = 0; i < 10; i++) {
    printf("  the current value of i is : %d\n", i);
  }

  // while loops are the same !
  printf("while loop:\n");
  while(x > 0) {
    printf("  the current value of x is : %d\n", x);
    x -= 1; // decrement x (like in Java)
  }
}
