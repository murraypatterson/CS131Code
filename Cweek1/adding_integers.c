#include <stdio.h>

// adding a pair of integer, as input from the user

int main() {

  int a, b;
  printf("Enter the first value:\n");
  scanf("%d", &a);

  printf("Enter the second value:\n");
  scanf("%d", &b);

  // a `printf` statement can involve several formatting characters
  // (just like Java's `System.out.printf`
  printf("%d + %d = %d\n", a, b, a + b);

  return 0;
}
