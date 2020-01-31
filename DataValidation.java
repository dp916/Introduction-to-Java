import java.util.*;
public class DataValidation
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter a positive integer number");
      int x = kb.nextInt();
      int x = -1;
      while (x < 0)
      {
         System.out.println("Enter a positive integer number");
      while (!kb.hasNextInt() )
      {
         kb.next();
         System.out.println("Enter a positive integer number");
      }
      x = kb.nextInt();
   }   
      while (x < 0)
      {
         System.out.println("Enter a positive integer number");
         x = kb.nextInt();
      }   
      System.out.println("You entered :" + x);  
    } 
}
       boolean moreData = true;
      while (moreData) //moreData == true
      {
         System.out.println("Enter your number:" );
         int x = kb.nextInt();
         System.out.println(x);
         System.out.print("Do you have another value?");
         String answer = kb.next();
         if (answer.equalsIgnoreCase("no"))
            moreData = false;
      }
      System.out.println("Good Bye");
    }
    
    public static void doWhile(Scanner kb))
    {
      int age;
      
      do
      {
         System,out.println("Enter your age");
            age = kb.nextInt();
      }while (age < 21); 
                 
      }   
   }
}  


      