/*This program has a recursive method that accepts two arguments into the parameters x and y.*/
import java.util.Scanner;

public class Multiplication
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x:  ");
        int x = input.nextInt();
        System.out.print("Enter y:  ");
        int y = input.nextInt();
        input.close();
        
        System.out.println(multiply(x,y));
    }
    public static int multiply(int x, int y)
    {
        if(y==0)
        {
            return 0;
        }else
        {
            return x + multiply(x,y -1);
        }
    }
}