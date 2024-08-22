/*Write the definition of class named Temperature. The Temperature class will hold a temperature 
in Fahrenheit and provide methods to get the temperature in Fahrenheit, Celsius, and Kelvin.*/
public class Temperature
{
    private double ftemp;
    
    public Temperature(double ftemp)
    {
        this.ftemp = ftemp;
    }
    public void setFahrenheit(double ftemp)
    {
        this.ftemp = ftemp;
    }
    public double getFahrenheit()
    {
        return ftemp;
    }
    public double getCelsius()
    {
        return(5.0/9.0)*(ftemp-32);
    }
    public double getKelvin()
    {
        return((5.0/9.0)*(ftemp-32))+273;
    }
}