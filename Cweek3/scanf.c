#include <stdio.h>

// pointers with `printf` and `scanf`

int main() {

  // with primitive types

  int i;
  scanf("%d", &i); // `scanf`, actually takes a pointer as its second
		   // argument, this is why we pass '&i`, the address
		   // of `i`, to `scanf`
  printf("%d\n", i);

  // with strings (which are just arrays)

  char s[20];
  scanf("%s", s); // `s` is a pointer actually (see `arrays.c`)
  printf("%s\n", s); // when the format character is `%s`, `printf`
		     // takes a pointer as an argument

  return 0;
}
