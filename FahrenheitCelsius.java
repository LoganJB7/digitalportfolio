/*Write a public static method named celsius that accepts a Fahrenheit temperature as an argument and returns that temperature converted to Celsius. 
The method's parameter should be a double and the method's return type should also be double.*/
public static double celsius(double fahrenheit)
{
    double celsius = (5.0 / 9.0) * (fahrenheit - 32);
    return celsius;
}