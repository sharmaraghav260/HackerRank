//Problem: https://www.hackerrank.com/challenges/camelcase
//Java 8
/*
If we handle the edge cases all we need to do is count the capital letters
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if(s.isEmpty())
        {
            System.out.println("0");
            System.exit(0);
        }

        int words = 1;

        for(int i = 1; i<s.length(); i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                words++;
        }
        System.out.println(words);
    }
}
