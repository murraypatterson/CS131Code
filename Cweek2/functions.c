#include <stdio.h>

// a simple example of a function

int add(int a, int b); // function prototype: at least this is needed

int main() {

  printf("Please enter an integer:\n");
  int x;
  scanf("%d", &x);

  printf("Please enter another integer:\n");
  int y;
  scanf("%d", &y);

  printf("%d + %d = %d\n", x, y, add(x,y));

  return 0;
}

// function also with body --- this could all be put at the top as
// well, but then the `main` function gets pushed further down
int add(int a, int b) {
  return a + b;
}
