//Implementation of Basic Arrays in Java
//1. Accepting a user defined input for an Array -
//2. Array Insertion, Deletion, Searching, Display, Traverse, and Update
//3. Array Addition

import java.util.Scanner;

public class Basic_Arrays
{
    public static void main(String[] args) 
    {
        //using try catch to encounter an error and terminating the program efficiently 
        //with stack trace
        try 
        {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the Size of an Array");
            int n = Sc.nextInt();
            

            if(n <= 1)
            {
                System.err.println("Please Enter a Valid Array Size");
                System.exit(0);
            }
            else
            {
                int[] arr1 = new int[n]; 
                for(int i=0;i<n;i++)
                { 
                    System.out.println("Enter "+i+" Element in Array");
                    arr1[i]=Sc.nextInt();
                }
                Sc.close();

                Basic_Arrays BA = new Basic_Arrays();
                BA.DisplayA(arr1);
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            //As soon as the error is encountered render system error and terminate the program
            System.err.println("Error: Invalid Array Arguments provided");
            System.err.println("Please provide expected Array arguments");
            System.out.println();
            e.printStackTrace();
            System.exit(0);
        }

    }

    public void DisplayA(int[] arr1)
    {
        int s = arr1.length;
        for(int i = 0; i < s; i++)
        {
            System.out.print(arr1[i]);
        }
    }

    
}
