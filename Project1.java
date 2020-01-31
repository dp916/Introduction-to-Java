public class Project1
{

public static final int HEIGHT = 7;
public static final int TOTALHEIGHT = HEIGHT * 5;
   
public static void main(String[] args)
{
   
      //main method
      for (int i=1; i<=HEIGHT; i++)
      {
         //draw some spaces before 
         for (int j=1; j<=TOTALHEIGHT + (i*(-5)); j++)
         {
            System.out.print(" ");
         }
         //draw head and stars
         printTop();
         
         //draw some spaces after  
         for (int j=1; j<=(i-1)*5; j++)
         {
            System.out.print(" ");
            
         }
         //one star
         System.out.println("*");
         
         
         //draw some spaces before 
         for (int j=1; j<=TOTALHEIGHT + (i*(-5)); j++)
         {
            System.out.print(" ");
            
         }
         //draw body
         printMiddle();
         
         //draw spaces after
         for (int j=1; j<=(i-1)*5; j++)
         {
            System.out.print(" ");
            
         }
         //one star
         System.out.println("*");
         
         //draw spaces before
         for (int j=1; j<=TOTALHEIGHT + (i*(-5)); j++)
         {
            System.out.print(" ");
         
         }
         //draw legs
         printBottom();
         
         //draw spaces after
         for (int j=1; j<=(i-1)*5; j++)
         {
            System.out.print(" ");
            
         }
         System.out.println("*");
      
         }
      
      //draw last line of stars   
      for (int k=1; k<=TOTALHEIGHT + 7; k++)
      {
         System.out.print("*");
         
      }
}      
     

//the head and stars
public static void printTop()
{
   System.out.print("  O  ******");
   
}
//the body
public static void printMiddle()
{ 
   System.out.print(" /|\\ *     ");
 
}
//the legs
public static void printBottom()
{
   System.out.print(" / \\ *     ");
   
}      
}
           
      
         
                   
         
                  
            
           
               
            
            
            
             
         
               
      
      
      
    