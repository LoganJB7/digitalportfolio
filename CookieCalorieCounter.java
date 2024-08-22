/* This program allow user to amount of cookies eaten, and systems prints out calories consumed*/
import java.util.Scanner;

public class CookieCalorieCounter
{
    public static void main(String[] ags)
    {
        int cookiesInServing = 40 / 10;
        int caloriesPerCookie = 300 / cookiesInServing;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of cookies eaten: ");
        int cookiesEaten = keyboard.nextInt();
        
        int totalCalories = cookiesEaten * caloriesPerCookie;
        
        System.out.println("Your calorie intake was: " + totalCalories + " calories.");
    }    
}