import java.util.*;
public class Project2 {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   System.out.print("How far is distance 1?");
   double d1 = sc.nextDouble();
   System.out.print("How much is price of gallon for car 1?");
   double pog1 = sc.nextDouble();
   System.out.print("What model is the first car?");
   String type1 = sc.next();
   System.out.print("What is the MPG of car 1?");
   double mpg1 = sc.nextDouble();
   System.out.print("Daily cost : ");
   System.out.print(dc1);
   System.out.print("Weekly cost : ");
   double wc1 = (dc1 * 5);
   
   calculateCost1(d1, mpg1, pog1);  
   output1(type1, d1, mpg1, pog1, dc1);
   
   System.out.print("How far is distance 2?");
   double d2 = sc.nextDouble();
   System.out.print("How much is price of gallon for car 2?");
   double pog2 = sc.nextDouble();
   System.out.print("What model is the second car?");
   String type2 = sc.next();
   System.out.print("What is the MPG of car 2?");
   double mpg2 = sc.nextDouble();
   System.out.print("Daily cost : ");
   double dc2 = sc.nextDouble();
   System.out.print("Weekly cost : ");
   double wc2 = sc.nextDouble();
   
   calculateCost2(d2, mpg2, pog2);  
   output2(type2, d2, mpg2, pog2, dc2);
}   
public static double calculateCost1(double d1, double mpg1, double pog1) {
      double dailyCost1 = distance1 / mpg1 * pog1; 
      return dailyCost1;
}

public static double calculateCost2(double d2, double mpg2, double pog2) {
      double dailyCost2 = distance2 / mpg2 * pog2;
      return DailyCost2;
}
      
public static void output1(String type1, double distance1, double mpg1, double pog1, double dc1) {
      System.out.println("1. " + type1 + " " + distance1 + " " + mpg1 + " " + pog1 + " " + dc1 + " "); 
}   

public static void output2(String type2, double distance2, double mpg2, double pog2, double dc2) {
      System.out.println("2: " + type2 + " " + distance2 + " " + mpg2 + " " + pog2 + " " + dc2 + " ");    
}     
}
      
  
 
    