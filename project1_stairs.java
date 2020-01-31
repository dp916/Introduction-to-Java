public class Stairs
{
   public static final int HEIGHT = 5;
   public static final int TOTALHEIGHT = HEIGHT * 5;
   public static void main(String[] args)
   {
     
      for (int i=1; i<=STAIRSNUM; i++)
      {
         for (int j=1; j<=TOTALHEIGHT + (i*(-5)); j++)
         {
            System.out.print(" ");
         }
         printTop();
         
         for (int j=1; j<=(i-1)*5; j++)
         {
            System.out.print(" ");
            
         }
         System.out.println("*");
         
         
         
         for (int j=1; j<=TOTALHEIGHT + (i*(-5)); j++)
         {
            System.out.print(" ");
            
         }
         printMiddle();
         
         for (int j=1; j<=(i-1)*5; j++)
         {
            System.out.print(" ");
            
         }
         System.out.println("*");
         
         
         for (int j=1; j<=TOTALHEIGHT + (i*(-5)); j++)
         {
            System.out.print(" ");
         
         }
         printBottom();
         
         for (int j=1; j<=(i-1)*5; j++)
         {
            System.out.print(" ");
            
         }
         System.out.println("*");
      
         }
      
         
      for (int j=1; j<=TOTALHEIGHT + 7; j++)
      {
         System.out.print("*");
         
      }
}      
     


public static void printTop()
{
   System.out.println("  O  ******");
   
}

public static void printMiddle()
{ 
   System.out.println(" /|\\ *");
 
}
public static void printBottom()
{
   System.out.println(" /  \\ *");
   
}      
}
           
      
         
                   
         
                  
            
           
               
            
            
            
             
         
               
      
      
      
    