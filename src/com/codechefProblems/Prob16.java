package com.codechefProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob16
{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String inputString;
    public static void main(String [] args) throws IOException {
        System.out.println("Enter the number of elements");
        inputString = input.readLine();
        int noOfElements = Integer.parseInt(inputString);

        System.out.println("Enter the number of queries");
        inputString = input.readLine();
        int queries = Integer.parseInt(inputString);

        int arr[] = takeInputOfArray(noOfElements);
        takeQueries(arr, queries);
    }
    public static int [] takeInputOfArray(int noOfElements) throws IOException {
        int [] arr = new int[noOfElements];
        System.out.println("Enter the elements");
        for(int i=0; i<noOfElements; i++)
        {
           inputString = input.readLine();
           arr[i] = Integer.parseInt(inputString);
        }
        return arr;
//        checkNumber(arr);
//        printArray(arr);
    }
    public static void takeQueries(int [] arr, int queries) throws IOException {
        for(int i=0; i<queries; i++)
        {
            System.out.println("Enter lower range");
            inputString = input.readLine();
            int lowerRange = Integer.parseInt(inputString);


            System.out.println("Enter upper range");
            inputString = input.readLine();
            int upperRange = Integer.parseInt(inputString);

            checkNumber(arr, lowerRange, upperRange);
        }
    }
    public static void printArray(int [] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void checkNumber(int [] arr, int lowerRange, int upperRange)
    {
        int numberCounter = 0;
        for(int i=lowerRange-1; i<upperRange; i++)
        {
            int counter = 0;
            int num = arr[i];
            while(num >1)
            {
                int rem = num%2;
                num = num/2;
                if(rem == 1)
                {
                    counter++;
                }
                else
                {
                    counter = 0;
                }
                if(num == 1)
                    counter++;
            }
            if(counter >=2)
            {
                numberCounter++;
            }
        }
        System.out.println(numberCounter);
    }
}
