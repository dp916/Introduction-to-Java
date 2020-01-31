import java.util.*;
public class Chapter7
{
  public static void main(String[] args)
  {
     Scanner kb = new Scanner(System.in);
     String[] names = new String[5];
     getNames(names);
     printNames(names);
     
     
     //avg(kb);
  }
  //populate the array with names from the user
  public static void getNames(String[] names, Scanner kb)
  {
      for (int i=0; i<names.length; i++)
      {
         System.out.print("What is your name doe?");
         name[i] = kb.nextLine();
      }   
      
 
   
  }
  //output the nameas
  public static void printNames(String[] names)
  {
      for (int i=0; i<name.length; i++)
          System.out.println(name[i]);
  }        
  
  public static void avg(Scanner kb)
  {
     System.out.println("Enter the count:");
     int count = -1;
     while (count < 0)
     {
        while (!(kb.hasNextInt()))
        {
            kb.next();
        }    
        count = kb.nextInt();
     }
     int sum = 0;
     //int num = 0;
     int[] num = new int[count];
     for(int i = 0; i < count; i++)
     {
        System.out.println("Enter your number:");
        while (!(kb.hasNextInt()))
        {
         kb.next();
        }
        num[i] = kb.nextInt();
        sum = sum + num[i];
     }
     double avg = sum / count;
     //
     int below =0;
     int above = 0;
     for(int i =0; i < num.length; i++)
     {
        if(num[i] >= avg)
           above++;
        else
           below++; 
     }         
     System.out.println(avg + " " + below + " " + above);
  }      
}
  