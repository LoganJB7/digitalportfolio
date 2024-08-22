/*This program allow user to enter a string, and returns output as a backwards string*/
import java.util.Scanner;

public class BackwardString
{
    public static String backwards(String str)
    {
      String backward =" ";
      for(int i = str.length()-1; i >=0; i--)
      {
          backward += str.charAt(i);