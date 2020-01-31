public class Circle
{
  //instance variables
  private double radius;
  private int x;
  private int y;
  
  //constructor
  public Circle(double r, int xCor, int yCor)
  {
    radius = r;
    x = xCor;
    y = yCor;
  }
  //mutator to modify the instance variables
  public void setRadius(double r)
  {
     radius = r;
  } 
  public void setX(int newX)
  {  
     x = newX;
  } 
  public void setY(int newY)
  {  
     y = newY;
  }  
   
 //**************************************************** 
  //accessor
  public double getRadius()
  {
     return radius;
  }
  public int getX()
  {
     return x;
  }
  public int getY()
  {
     return y;
  }

  //*********************************************
  //area
  public double getArea()
  {
     double area = Math.PI * Math.pow(radius, 2) ;
     return area;
  }
  //circum 
   public double getCircum()
  {
     double circum = Math.PI  *2 * radius ;
     return circum;
  }
  //shrink
  public void shrink(double size)
  {
    if (radius - size > 0)
      radius = radius - size;
  }
   public void expand(double size)
  {
     radius = radius + size;
  }

//*************************************************************  
     
  public String toString()
  {
    String s = "";
    s = s + "Radius :" + radius;
    s = s + "\n( " + x + " , " + y +" )";
    return s;
  } 
  //must have acces to the calling object and the paramter
  public boolean equals(  Circle other )
  {
     return this.radius == other.radius && this.x == other.x && this.y == other.y;
  
     
  }
}   
      