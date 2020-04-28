#include <stdio.h>
#include <string.h>

/*
  C final review: in addition to the examples below, all the code on
  the github page (https://github.com/murraypatterson/CS131Code)
  corresponding to the 3 weeks of C is a useful resource, but also pay
  attention to the following Java programs:

  week05/
    Chaining.java
    Nesting.java

  Since conditional (if-else) statements are the same in C as they are
  in Java, so are the "chaining" and "nesting" of these statements.
*/

//function prototypes
//----------------------------------------------------------------------

// 1
void conversion();

// convert inches to centimeters and return the result
double inchesToCentimeters(int inch);

// 2
void arrays();

// 3
void numbers();

// 4
void date();

// output american formatting of date
void print_american(char day[], char month[], int date, int year);

// output european formatting of date
void print_european(char day[], char month[], int date, int year);

// 5
void fun();

// n!
int factorial(int n);

// n! (iterative version)
int factorial_iter(int n);

// 6
void strings();

// count number of vowels in a string
int count_vowels(char s[]);

// "homemade" version of `strcmp` library function
int my_strcmp(char s[], char t[]);

// 7
void encryption();

// apply the Caesar cipher to encrypt a string
void caesar_encrypt(char s[], int shift);

// apply the inverse Caesar cipher to decrypt the string
void caesar_decrypt(char s[], int shift);

// main
//----------------------------------------------------------------------
int main() {

  // each '\n' gives us a new line
  printf("\nHi there!, how are you?\n");

  int choice = -1;
  while(1) {

    printf("\n---\n"); // another new line at the beginning
    printf("Press 1 to be converted\n");
    printf("Press 2 for a wide array of activities\n");
    printf("Press 3 to play the numbers game\n");
    printf("Press 4 to go on a date\n");
    printf("Press 5 for the fun factor(ial)\n");
    printf("Press 6 to get strung along\n");
    printf("Press 7 to win a trip to ancient Rome!\n");
    printf("Press anything else to exit.\n");

    printf("---\n\n"); // new line at the end

    if(!scanf("%d", &choice)) { // c-style "exception" handling :)
      return 1;
    }

    switch(choice) { // a switch statement
    case 1:
      conversion();
      break;
    case 2:
      arrays();
      break;
    case 3:
      numbers();
      break;
    case 4:
      date();
      break;
    case 5:
      fun();
      break;
    case 6:
      strings();
      break;
    case 7:
      encryption();
      break;
    default:
      printf("bye bye..\n");
      return 0; // return from main --- i.e., from the whole program
    }
  }
}

// 1
void conversion() {

  printf("Thou shalt be converted ... to C ... :)\n");

  int inch = 3;
  double cm = inch * 2.54;

  printf("%d inches is %f centimeters\n", inch, cm);
  printf("%d inches is ", inch);
  printf("%.2f centimeters\n", inchesToCentimeters(inch));
}

// convert inches to centimeters and return the result
double inchesToCentimeters(int inch) {
  return 2.54 * inch;
}

// 2
void arrays() {

  printf("Everything in array, instead of disarray...\n");

  int n = 6;
  int a[] = {3,7,12,4,5,6};

  printf("Let's print each number <number> times\n\n");
  for(int i = 0; i < n; i++) {
    for(int j = 0; j < a[i]; j++) {
      printf("%d ", a[i]);
    }
    printf("\n");
  }

  printf("\nNow let's see which numbers are divisible by ");
  printf("the length of the array\n\n");
  for(int i = 0; i< n; i++) {
    printf("%d is ", a[i]);
    if(a[i] % n != 0) {
      printf("NOT ");
    }
    printf("divisible by %d\n", n);
  }
}

// 3
void numbers() {

  printf("It's all a numbers game ...\n");
  printf("(note: this is the solution to homework week 11)\n");

  int a = -1;

  printf("Please enter an integer...\n");
  scanf("%d", &a);

  if(a <= 0) {

    printf("Your number is too small...\n");
    return; // exit the function
  }

  if(a % 2 == 1) {

    printf("Well, that's an odd number.\n");
    int b = a * 3;
    printf("Your number multiplied by three is: %d\n", b);
  }
  else {

    int sum = 0;
    for(int i = 1; i <= a; i++) {
      sum += i;
    }

    printf("The sum from 1 to %d is: %d\n", a, sum);
  }

  return;
}

// 4
void date() {

  printf("wanna go on a date ... formatting quest?\n");
  printf("(note: this is C version of the solution to homework week 4)\n");

  char the_day[] = "Saturday";
  char the_month[] = "July";
  int the_date = 22;
  int the_year = 2015;

  print_american(the_day, the_month, the_date, the_year);
  print_european(the_day, the_month, the_date, the_year);
}

// output american formatting of date
void print_american(char day[], char month[], int date, int year) {

  printf("%s, %s %d, %d\n", day, month, date, year);
}

// output european formatting of date
void print_european(char day[], char month[], int date, int year) {

  printf("%s, %d %s %d\n", day, date, month, year);
}

// 5
void fun() {

  int n = 0;
  printf("Give me a number:\n");
  scanf("%d", &n);
  printf("%d! = %d\n", n, factorial(n));
  printf("%d! = %d\n", n, factorial_iter(n));
}

// n!
int factorial(int n) {

  if(n < 1)
    return 1;
  else
    return n * factorial(n-1);
}

// n! (iterative version)
int factorial_iter(int n) {

  int result = 1;
  for(int i = 1; i <= n; i++) {
    result *= i;
  }

  return result;
}

// 6
void strings() {

  // input / output of strings
  printf("I hope I am not stringing you along!..\n");

  char s[44]; // allocate 44 chars for a string s

  printf("Enter a string:\n"); // like System.out.println in java
  scanf("%s",s); // get input from user (like scanner.nextLine() in java)

  printf("Your string is: ");
  printf("%s\n",s); // format for string

  // copy a string with strcpy (from string.h)
 
  char t[44]; // allocate 44 chars for another string t

  strcpy(t, s); // copy s over to t
  printf("The string t is : %s\n", t);

  // concatenate two strings
  
  char u[100] = "Hello, "; // allocate 100 chars for u, assign it "Hello, "
  char v[] = "world!";

  printf("%s\n", u);
  int u_len = strlen(u); // length of string (like u.length() in java)
  printf("length: %d\n", u_len); // format for int

  strcat(u, v); // string concatenation (like u = u + v in java)

  printf("%s\n",u);
  u_len = strlen(u);
  printf("length: %d\n", u_len);

  // calling some functions: count the number of vowels

  printf("%s\n", u);
  printf("number of vowels: %d\n", count_vowels(u)); // defined below

  // define my own version of strcmp, and compare it to strcmp

  printf("should be the same, i.e., = 0\n");
  printf("strcmp: %d\n", strcmp(s, t)); // s equals t
  printf("my version: %d\n", my_strcmp(s, t));

  printf("should be different: i.e., != 0\n");
  printf("strcmp: %d\n", strcmp(u, v)); // u is different from v
  printf("my version: %d\n", my_strcmp(u, v));
}

/*
  function count_vowels: counts the number of (lower-case) vowels in a
  string and returns this count
*/
int count_vowels(char s[]) {

  int count = 0;

  for(int i = 0; i < strlen(s); i++) {
    if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
      count++;
    }
  }

  return count;
}

/*
  my version of strcmp, for comparing two strings

  return: 0 if they are equal

  return: -1 if they are not
*/
int my_strcmp(char s[], char t[]) {

  if(strlen(s) != strlen(t)) {
    return -1;
  }

  for(int i = 0; i < strlen(s); i++) {
    if(s[i] != t[i]) {
      return -1;
    }
  }

  return 0;
}

// 7
void encryption() {
  
  printf("Et tu, Brute?!?  Yet is was Cassius who was the shifty character.\n");
  printf("Speaking of shifting characters, did you know that in ancient Rome\n");
  printf("they were already using (albeit, primitive) methods for encrypting\n");
  printf("messages?  Given some message, you could \"shift\" every character\n");
  printf("forward by a certain amount (like 3).  Then if the person receiving\n");
  printf("this encrypted message knows the shift, they can decrypt it.  Let us\n");
  printf("see how this works!\n\n");

  // message for encryption
  char message[] = "Beware the Ides of March.";
  printf("message: %s\n", message);

  // encrypted message
  caesar_encrypt(message, 3);
  printf("encrypted: %s\n", message);

  // decrypted message
  caesar_decrypt(message, 3);
  printf("decrypted: %s\n", message);

  /*
    note: have a look at an ascii table (www.asciitable.com) to
    understand exactly why the encrypted message is how it is
  */

}

void caesar_encrypt(char s[], int shift) {

  for(int i = 0; i < strlen(s); i++) {
    s[i] += shift;
  }
}

void caesar_decrypt(char s[], int shift) {

  for(int i = 0; i < strlen(s); i++) {
    s[i] -= shift;
  }
}
