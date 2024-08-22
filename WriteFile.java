/*This program opens an output file named numbers.txt,writes integer values 1 through 49 to the file, with each number written on its own line in the file.*/
import java.io.*;

public class WriteFile
{
   public static void main(String[] args) throws IOException
   {
      try (PrintWriter outputFile = new PrintWriter("numbers.txt"))
      {
         for (int num = 1; num < 50; num++)
         {
            outputFile.println(num);
         }
      }      
   }
}