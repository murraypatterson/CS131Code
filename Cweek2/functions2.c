#include <stdio.h>

// another example of (slightly more complex) function (from slides)

int power(int m, int n); // function prototype

int main() {

  for(int i = 0; i < 10; i++) {

    printf("2^%d = %d  -3^%d = %d\n", i, power(2,i), i, power(-3,i));
  }

  return 0;
}

// raise base `m` to the power of `n` (`n` >= 0)
int power(int m, int n) {

  int i, p;
  p = 1;

  for(i = 1; i <= n; ++i) {
    p = p * m;
  }

  return p;
}
