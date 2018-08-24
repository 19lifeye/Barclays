package com.codechefProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob18
{
    static int minValue = Integer.MAX_VALUE;
    static char [] charArray;
    public static void main(String [] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputString = input.readLine();

        deleteChar(inputString);
    }
    public static void deleteChar(String string)
    {
        for(int i=0; i<string.length(); i++)
        {
            String str = string.replace(string.charAt(i), '\0');
            //System.out.println(str);
            charArray = str.toCharArray();
            checkASCII(charArray);
        }
        System.out.println(charArray);
    }
    public static void checkASCII(char [] charArray)
    {
        int sum=0;
        for(int i=0; i<charArray.length; i++)
        {
            char c = charArray[i];
            int val = c;
            sum+=val;
        }
        if(sum<minValue)
        {
            minValue = sum;
            String.valueOf(charArray);
        }
    }
}
