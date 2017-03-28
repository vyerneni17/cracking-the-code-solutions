/*
Input format
// Two strings on separate lines
abc   //First String
dec   //Second String
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int numberNeeded(String first, String second) {

        int result = 0;

        int[] alphabets = new int[26];

            for(char c : first.toCharArray()){
                alphabets[c - 'a']++;
            }

            for(char c : second.toCharArray()){
                alphabets[c - 'a']--;
            }

            for(int i : alphabets){
                result += Math.abs(i);
            }

      return result;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
