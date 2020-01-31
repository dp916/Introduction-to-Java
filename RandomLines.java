import java.util.*;
public class RandomLines
{
   public static void main(String[] args)
   {
      Random rand = new Random();
      int min = 5;
      int max = 10;
      lines(rand, min, max);
      
   }
   public static void lines(Random rand, int min, int max)
   {
      //generate a randome number between min and max
      int line = rand.nextInt(max - min + 1) + min;
      int count = 80;
      for (int i=1; i <= line; i++)
      {
         //generate a random number between 0 and 80
         int letters = rand.nextInt(count+1);
         for (int j = 1; j <= letters; j++)
         {
            //generate a random unicode for each character
            int c = rand.nextInt((int)'z' - (int)'a' + 1) + (int)'a';
            //output the letter
               System.out.print((char)c);
         }
         
         System.out.println();
      }
}       
       }     