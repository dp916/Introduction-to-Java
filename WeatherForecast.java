public class WeatherForecast
{
  private double temperature; // in Fahrenheit
  private String sky;
  
  /* initializes temperature to 70.0 and sky to "sunny"
     calls mutator methods to validate these default values */
  public WeatherForecast( )
  {
      temperature = 70.0;
      sky = "sunny";
  } 
     
   /* Allows client to set beginning values for temperature and sky
      This constructor takes two parameters 
      Calls mutator methods to validate new values
      newTemperature the temperature for the weather forecast
      newSky the sky conditions for the weather forecast */
  
  public WeatherForecast( double newTemperature, String newSky )
  {
      setTemperature(newTemperature);      
      setSky(newSky);
  }

  /* getTemperature method
   return the temperature */
  
  public double getTemperature( )
  {
     return temperature;
  }
    
 /*Allows client to set value of temperature
   setTemperature  sets the value of  temperature 
   to 70.0 if newTemperature is less than -50 or greater than 150
   newTemperature the new number of temperature */
  
  public void setTemperature( double newTemperature )
  { 
      if (newTemperature < -50 || newTemperature > 150)
      {  
        temperature = 70.0;  
      } else
      {
        temperature = newTemperature;
      }
                   
  }

  /* getSky method
     return the sky conditions
  */
  
  public String getSky( )
  {
      return sky;
  }
        
 /*Allows client to set value of sky
   setSky  sets the value of  sky 
   to "sunny" if newSky is neither "sunny", "snowy",
   "cloudy", nor "rainy" 
   This method is not case sensitive
   newSky the new sky condition */
  
  public void setSky( String newSky )
  {
      if ((newSky.equalsIgnoreCase("sunny") || newSky.equalsIgnoreCase("snowy") || newSky.equalsIgnoreCase("cloudy") || newSky.equalsIgnoreCase("rainy")))
         
         sky = newSky;
   
         
  }

  
  /* return the temperature and the sky conditions for the weather forecast */
  
  public String toString( )
  {
      /*   
      String s = "";
      s = s + "Temperature: " + temperature;
      s = s + "\nSky: " + sky;
      return s;
      */
    return "Temperature: " +temperature+ "\tSky: " +sky;
  }
  
/* equals method
   Compares two WeatherForecast objects for the same field values
   o another WeatherForecast object
   @return a boolean, true if this object
   has the same field values as the parameter wf */
  
  public boolean equals( WeatherForecast other )
  {     
      return (this.temperature == other.temperature && this.sky == other.sky);
  }

  
 /*fahrenheitToCelsius method
   Computes the degrees Celsius temperature
   return a double, the temperature value in degrees Celsius*/
  
  
  public double fahrenheitToCelsius()
  {
    
    double celsius = (temperature - 32) * (5.0/9.0);
    return celsius;
  }
 
/* isConsistent method
   Checks if the temperature value and the sky conditions are compatible
   return a boolean, false if the temperature is below 32 and the sky is not snowy,
   or if the temperature is greater than 100 and the sky is not sunny, true otherwise */
  
  public boolean isConsistent( )
  {     
      if (temperature <= 32 && !sky.equalsIgnoreCase("snowy") || temperature >= 100 && !sky.equalsIgnoreCase("sunny"))
      {
         return false;
      }
      return true;  
  }
  
  
}