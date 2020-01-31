import java.util.*;
public class CommuteCostsShell {

   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   //for help 5th floor room 29
   //declare variables for distance, priceofgallon, autoType, milesPerGallon, dailyCost, weeklyCost
   
   System.out.print("How many miles is it to your work? ");
   double distance1 = sc.nextDouble();
   System.out.print("How much do you pay for 1 gallon of gas? ");
   double priceOfGallon1 = sc.nextDouble();
   System.out.print("What type of vehicle is your first one? ");
   sc.nextLine();
   String autoType1 = sc.nextLine();
   
   System.out.print("How many miles per gallon does your car get? ");
   double milesPerGallon1 = sc.nextDouble();
   
   double result1 = commuteCost(distance1, milesPerGallon1, priceOfGallon1);
      
   commuteCost(distance1, milesPerGallon1, priceOfGallon1);  
   
   
 
   System.out.print("What type of vehicle is your second one? ");
   sc.nextLine();
   String autoType2 = sc.nextLine();
   
   System.out.print("How many miles per gallon does your car get? ");
   double milesPerGallon2 = sc.nextDouble();
  
   
   double result2 = commuteCost(distance1, milesPerGallon2, priceOfGallon1);
   
   commuteCost(distance1, milesPerGallon2, priceOfGallon1);  
   
   output(distance1, priceOfGallon1, milesPerGallon1, milesPerGallon2, result1, result2, autoType1, autoType2);
   }
   
   
public static double commuteCost(double distance, double milesPerGallon, double priceOfGallon) {
      double result = distance / milesPerGallon * priceOfGallon; 
      return result;
}

public static double output(double distance1, double pricePerGallon1, double milesPerGallon1, double milesPerGallon2, double result1, double result2, String autoType1, String autoType2) {
   
        
         double weeklyCost1 = result1 * 5;
         double weeklyCost2 = result2 * 5; 
         double difference1 = result1 - result2;
         double difference2 = weeklyCost1 - weeklyCost2;
         double realDifference1 = Math.abs(difference1);
         double realDifference2 = Math.abs(difference2);
         System.out.printf("%-30s %-10s %-10s %-10s", " ", "Miles", "Daily", "Weekly");
         System.out.println();
         System.out.printf("%-30s %-10s %-10s %-10s", "Vehicle", "Per Gallon", "Cost", "Cost");
         System.out.println();
         System.out.println();
         System.out.printf("%-30s %-10.1f $%-10.2f $%-10.2f", autoType1, milesPerGallon1, result1, result1 * 5);
         System.out.println();
         System.out.printf("%-30s %-10.1f $%-10.2f $%-10.2f", autoType2, milesPerGallon2, result2, result2 * 5);
         System.out.println();
         System.out.println();
         System.out.printf("%-30s %-10s $%-10.2f $%-10.2f", "Difference", " ", realDifference1, realDifference2);
         System.out.println();
         return 0;
}
}