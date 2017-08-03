//Problem: https://www.hackerrank.com/challenges/alternating-characters
//Java 8
/*
Initial thoughts:
Count the consecutive duplicates and problem is solved.
*/

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input = new Scanner(System.in);
    int T = input.nextInt();
    input.nextLine();

    tests:
    for(int t = 0; t < T; t++)
    {
      String s = input.nextLine();
      int deletions = 0;
      for(int i = 1; i < s.length(); i++)
      {
        if(s.charAt(i) == s.charAt(i-1))
          deletions += 1;
      }
      System.out.println(deletions);
    }
  }
}
