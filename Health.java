import java.util.Scanner;
public class Health
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      // for (int i=1; i<=5; i++);175
      
      System.out.println("Enter your weight?");
      double w = console.nextDouble();
      System.out.println("Enter your height?");
      double h = console.nextDouble();
      String result = bmi(w,h);
      System.out.println("You are : " + result);
     
}        
  
  
   public static String bmi(double w, double h)
   {
      h = h * 12;
      double b = (w / (h*h) * 703);
      String result = "";
      if (b < 18.5) 
         result = "Underweight";
       else if (b >= 18.3 && b < 24.9) 
         result = "Normal";
       else if (b >= 25.0 && b <= 29.9) 
         result = "Overweight";
       else
         result = "Obese"; 
      return result;
}      
}
 
       
      
      
   
       