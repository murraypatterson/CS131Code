#include <stdio.h>

// example of integer overflow

int main() {

  /*
    Data in memory is organized as a sequence of bytes.  Most
    primitive types like `int`, `char`, `float`, etc. are 4 bytes in
    size.  Since a byte is 8 bits, 4 bytes = 32 bits, and so an
    integer can represent 2^32 distinct integers --- that is, it is a
    finite amount of memory.  This is why, when you run the below
    (successive powers of 2), you'll "run out of numbers".  Try the
    below:
  */

  int b = 2;
  for(int i = 1; i < 34; i++) {
    printf("2^%d = %d\n", i, b);
    b *= 2;
  }

  /*
    Note that at 2^31, it "rolls" over to a negative number.  The
    integer type stores the number in 31 bits, and the 32nd bit is for
    the sign (positive or negative).  Since 31 bits can represent 2^31
    distinct integers: 0..2^31-1, 2^31 is one integer beyond this
    range, and so it rolls over to the other side, where the negative
    numbers are stored.  2^32, 2^33, etc. give 0 because 2^32 % 2^32 =
    0, 2^33 % 2^32 = 0, etc. --- the integers are really on a "disc",
    per say: go far enough and you come back to zero.  The integer
    only behaves well if we do computations that do not hit these
    boundaries, this is why we must be careful.
  */

  return 0;
}
