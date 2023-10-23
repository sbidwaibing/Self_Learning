//A Simple java program to calculate the n * n (Random Number Matrix) 

import java.util.Random;
import java.util.Scanner;

public class MatrixMul
{
    public static void main(String[] Args)
    {
        //Using try-Catch to terminate program with ease if error encountered
        try 
        {
           System.out.println("Enter the Size of the Matrix: ");
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt(); 
           sc.close();

            MatrixMul MM = new MatrixMul();
            MM.Compute_Normal(n);
        } 
        catch (Exception e) 
        {
            System.err.println("ERROR: Invalid Argument !");
            e.printStackTrace();
        }
    }

    //Here the MaxNumber is the Random generated number with a condition bound of 
    //floor.𝑚𝑎𝑥𝑖𝑚𝑢𝑚_𝑖𝑛𝑡𝑒𝑔𝑒𝑟/𝑛 to avoid Integer OverFlow. 
    public void Compute_Normal(int _N)
    {
        int n = _N;
        int MaxNumber = (int)(Math.floor(Math.sqrt(Integer.MAX_VALUE / n)));

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        int row = A.length;
        int col = A[0].length;
       
        for(int i=0;i<row;i++)
        {
                for(int j=0;j<col;j++)
                {
                    Random R = new Random();
                    int randomNumber = R.nextInt(MaxNumber);
                    A[i][j] = randomNumber;
                }
        }

        int row1 = B.length;
        int col1 = B[0].length;
        
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                Random R = new Random();
                int randomNumber = R.nextInt(MaxNumber);
                B[i][j] = randomNumber;      
            }
        }

        int row2 = A.length;
        int col2 = A[0].length;
        int coln2 = B[0].length;
        int[][] product = new int[n][n];

        for (int i = 0; i < row2; i++) 
        {
            for (int j = 0; j < col2; j++) 
            {
                for (int k = 0; k < coln2; k++) 
                {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for(int i=0;i<product.length;i++)
        {
            for(int j=0;j<product[0].length;j++)
            {
                System.out.println(product[i][j]+"\t");
            }
        } 
    }

}