/*This program asks the user to enter the number of packages purchased.
 The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount.*/
import java.util.Scanner;

public class SoftwareSales
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final double regPrice = 99.0;
        
        System.out.printf("Enter number of packages purchased: ");
        final int numPackages = input.nextInt();
        double discount = 0.0, total = regPrice * numPackages;
        
        if (numPackages <= 0)
           total = 0.0;
        else if ((numPackages >= 10) && (numPackages <= 19))
           discount = (0.2 * total);
        else if ((numPackages >= 20) && (numPackages <= 49))
           discount = (0.3 * total);
        else if ((numPackages >= 50) && (numPackages <= 99))
           discount = (0.4 * total);
        else if (numPackages >= 100)
           discount = (0.5 * total);
           
        System.out.printf("Your discount is: $%.2f\n" +
                          "Your total is: $%.2f\n",
                          discount, total - discount);
    }
}