import java.util.*;
public class CircleDriver
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       //get the info for the object
       System.out.println("Enter the radius, x and y:");
       double r = kb.nextDouble();
       int x = kb.nextInt();
       int y = kb.nextInt();
       
       //instantiate the object
       Circle c1 = new Circle(r,x,y);
       
       //output the content of the object
       System.out.println(c1.toString());
       c1.setRadius(6); 
       System.out.println(c1.toString()); 
       
       System.out.println("Enter the radius, x and y:");
       r = kb.nextDouble();
       x = kb.nextInt();
       y = kb.nextInt();
       
       //instantiate the object
       Circle c2 = new Circle(r,x,y);
       System.out.println(c2.toString());
       
       //output
         r = c1.getRadius() + c2.getRadius();
         x = c1.getX() + c2.getX();
         y = c1.getY() + c2.getY();
         Circle c3 = new Circle(r, x, y);
         System.out.println(c3.toString());
         
         //calculate the area of circle c1
         double area = c1.getArea();
         System.out.println(area);
         
         double circum = c1.getCircum();
         System.out.println(circum);
         
         c1.shrink(3);
         System.out.println(c1.equals(c2));
         

     
   }
}   12