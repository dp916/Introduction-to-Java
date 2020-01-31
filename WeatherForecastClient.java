import java.util.*;
public class WeatherForecastClient
{
  public static void main( String [] args )
  {
    //ask the user the information for two forecast 2 temp and 2 condition)
    Scanner kd = new Scanner(System.in);
    System.out.print("The temperature of weather forecast   #1: ");
    //data validation
    while (!kd.hasNextDouble())
    {
         kd.next();
         System.out.print("The temperature of weather forecast   #1: ");
    }
    double temperature1 = kd.nextDouble();
    
    
    System.out.print("The sky condition of weather forecast #1: ");
    
    while (!kd.hasNext())
    {
         kd.next();
         System.out.print("The sky condition of weather forecast #1: ");
    }
    String sky1 = kd.next();
    
    //second forecast
    System.out.print("The temperature of weather forecast   #2: ");
    while (!kd.hasNextDouble())
    {
         kd.next();
         System.out.print("The temperature of weather forecast   #2: ");
    }
    double temperature2 = kd.nextDouble();
    System.out.print("The sky condition of weather forecast #2: ");
    while (!kd.hasNext())
    {
         kd.next();
         System.out.print("The sky condition of weather forecast   #2: ");
    }
    String sky2 = kd.next();
    System.out.println();

    //create two objects of type  WeatherForecast
    WeatherForecast weather1 = new WeatherForecast(temperature1, sky1);
    WeatherForecast weather2 = new WeatherForecast(temperature2, sky2);
    
    //use the methods in the WeatherForecast class to generate the output given to you
    System.out.println("Temperature cannot be less than -50 or greater than 150.");
    System.out.println("Temperature will set to 70.0.");
    System.out.println();          
    System.out.println("The temperature of weather forecast #1 is " +weather1.getTemperature()+ "F or " +weather1.fahrenheitToCelsius()+ "C");
    System.out.println("The sky condition of weather forecast #1 is " +weather1.getSky());
    System.out.println("Weather forecast #2 is " +weather2);
    System.out.println();
    
    //check to see if weather makes sense
    if (weather1.isConsistent())
    {
         System.out.println("Weather forecast 1 " + weather1.toString() + " is consistent");
    }    else
    {         
         System.out.println("Weather forecast 1 " + weather1.toString() + " is not consistent");
    }     
    if (weather2.isConsistent())
    {  
         System.out.println("Weather forecast 2 " + weather2.toString() + " is consistent");
    }    else
    {         
         System.out.println("Weather forecast 2 " + weather2.toString() + " is not consistent"); 
    }
    System.out.println();    
    
    //check to see if weather are same
    if (weather1.equals(weather2))
    {
         System.out.println("Original weather forecasts #1 and #2 are identical");
    }    else
    {
         System.out.println("Original weather forecasts #1 and #2 are different");
    }
    //change the temp and condition of weather 2     
    weather2.setTemperature(101);
    weather2.setSky("sunny");
         
    if (weather1.equals(weather2))
    {
         System.out.println("Original weather forecasts #1 and modified weather forecasts #2 are identical");
    }    else
    {
         System.out.println("Original weather forecasts #1 and modified weather forecasts #2 are different");
    }  
    
    
  }
}