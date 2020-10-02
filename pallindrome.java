/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
   public static void main(String[] args) throws java.lang.Exception {
      // your code goes here
      int x = 545;
      int num = x;
      if (x < 0) {
         System.out.println("The no is not Palindrome!!");
      }

      int reversed = 0;
      while (x > 0) {
         reversed = (reversed * 10) + x % 10;
         x = x / 10;
      }

      System.out.println(reversed);

      if (reversed == num) {
         System.out.println("The no is palindrome!!");
      } else {
         System.out.println("The no is not palindrome!1");
      }
   }
}
