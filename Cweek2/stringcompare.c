#include <stdio.h>
#include <string.h>

// `strcmp`: compare two strings, and return `0` if they are equal,
// and some nonzero number if they are not equal

int main() {

  char string3[] = "this is";
  char string4[] = "a test";
  
  if(strcmp(string3, string4) == 0) {
    // `strcmp` returns `0` if the strings are equal..
    printf("strings are equal\n");
  }
  else {
    // ..and some non-zero value, otherwise 
    printf("strings are different\n");
  }
  // NOTE: `strcmp` does not return a "Boolean" value, and so using
  // `if(strcmp(s,t)` for two strings `s`, and `t` might give a
  // counter-intuitive result
  
  // in fact, this non-zero value has meaning --- it is roughly
  // equivalent to "how different" the strings, are, or rather, "how
  // far they are from each other in a dictionary".  If the are not
  // different at all, of course this difference is `0`
  char a[] = "a";
  char b[] = "z";
  printf("strcmp(\"%s\",\"%s\") = %d\n", a,b, strcmp(a,b));

  // try it out for yourself!  
  printf("Please enter a string (no spaces :)\n");
  char s[64];
  scanf("%s", s);
  printf("Please enter another string:\n");
  char t[64];
  scanf("%s", t);

  printf("strcmp(\"%s\",\"%s\") = %d\n", s,t, strcmp(s,t));

  return 0;
}
