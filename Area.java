/*This program write a class named Area. The Area class should provide static methods that calculate the areas of different geometric shapes.*/
public class Area
{
    public static double getArea(double radius)
    {
        return Math.PI * radius * radius;
    }
    public static double getArea(double length,double width)
    {
        return length * width;
    }
    public static double getArea(double base1, double base2, double height)
    {
        return 0.5 *(base1 + base2)* height;
    }
    public static void main(String [] args)
    {
        double circleArea = getArea(3);
        System.out.printf("%.2f\n",circleArea);
        
        double rectangleArea = getArea(2,4);
        System.out.printf("%.1f\n",rectangleArea);
        
        double trapezoidArea = getArea(3,4,5);
        System.out.printf("%.1f\n",trapezoidArea);
    }
}

