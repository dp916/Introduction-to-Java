import java.util.*;
public class CoinsDriver
{
   public static void main(String[] args)
   {
      Scanner kd = new Scanner(System.in);
      
      //set the variables
      System.out.println("How many quarters, dimes, nickels, pennies do you want?");
      int quarters = kd.nextInt();    
      int dimes = kd.nextInt();      
      int nickels = kd.nextInt();
      int pennies = kd.nextInt();
      
      //set the constructor
      Coins bank1 = new Coins(quarters, dimes, nickels, pennies);
      
      //output
      System.out.println(bank1.toString());
      System.out.println();
      
      //update the variables with accessors
      quarters = quarters * bank1.getQuarters();
      dimes = dimes * bank1.getDimes();
      nickels = nickels * bank1.getNickels();
      pennies = pennies * bank1.getPennies();
      
      //mutators      
      bank1.setQuarters(quarters);
      bank1.setDimes(dimes);
      bank1.setNickels(nickels);
      bank1.setPennies(pennies);
      
      String us = "USD converted to euros: ";
      String grams = "Coins converted to grams: ";
      System.out.printf("%s \t%.2f", us, bank1.eurosMoney());
      System.out.println();
      System.out.printf("%s \t%.2f", grams, bank1.moneyWeight());
      System.out.println();
     
      
                           
      //accessors
      double q = bank1.moneyFromQuarters();
      double d = bank1.moneyFromDimes();
      double n = bank1.moneyFromNickels();
      double p = bank1.moneyFromPennies();      
      
      String amount = "Total: $";   
      //output
      System.out.println();      
      System.out.println("Quarters: $" +q+ "\tDimes: $" +d+ "\tNickels: $" +n+ "\tPennies: $" +p);
      System.out.println();  
      System.out.printf("%s %.2f", amount, bank1.totalAmount()); 
      //1
      System.out.println("Total: $" + bank1.totalAmount());           
      System.out.println();
            
      
      
      
      
      
      
      
      //repeat previous steps to check equality
      System.out.println("How many quarters, dimes, nickels, pennies do you want?");
      int quarters2 = kd.nextInt();    
      int dimes2 = kd.nextInt();      
      int nickels2 = kd.nextInt();
      int pennies2 = kd.nextInt();
      
      //create new object
      Coins bank2 = new Coins(quarters2, dimes2, nickels2, pennies2);
      
      //test equals method
      System.out.println(bank2.toString());
      System.out.println();
      System.out.println("Does the two amounts match? " + bank1.equals(bank2));
      
      
      
      
      
   }
}   
      