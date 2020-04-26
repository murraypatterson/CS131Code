#include <stdio.h>

// function prototypes, as always (in C)
void bad_swap(int a, int b);
void swap(int* a, int* b);

int main(){

  int num1 = 5;
  int num2 = 6;

  // note how this call does not affect `num1` and `num2`..
  bad_swap(num1, num2);
  printf("num1 = %d, num2 = %d\n", num1, num2);

  // ..yet this one is effective
  swap(&num1, &num2);
  printf("num1 = %d, num2 = %d\n", num1, num2);

  return 0;
}

/*
  swaps `a` with `b`, but `a` and `b` are only local variables, that
  is, the variables passed into the function are passed "by value",
  and so, local copies of the variables are made, and the variables
  passed in (from `main`) remain unchanged
*/
void bad_swap(int a, int b) {
  int temp = a;		
  a = b;					
  b = temp;				
}

/*
  to affect the variables that were passed into a function, use
  pointers: they contain the "address" of the variable.  Again, local
  copies of these addresses are made, but the _values_ of such
  variables are addresses themselves, referring to the variables which
  were passed in: in short, the variables passed in are changed
*/
void swap(int* a, int* b) {
  int temp = *a; // `temp` is set to the value stored at `a`
  *a = *b; // value stored at `a` is set to the value stored at `b`
  *b = temp; // value stored at `b` is changed to `temp`
}
