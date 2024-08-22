/*Write a method named showChar. The method should accept two arguments: a String object and an integer.
The integer argument is a character position within the String, with the first character being at position 0.*/
import java.util.Scanner;

public class Method_showChar
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a line of text:");
        String text = input.nextLine();