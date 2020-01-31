public class Point {
	int x;
	int y;
   
   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
	
	public double distanceFromOrigin() {
		double dist = Math.sqrt(x*x + y*y);
		return dist;
	}
	
	public double distance(Point other) {
		int dx = other.x - x;
		int dy = other.y - y;
		double dist = Math.sqrt(dx*dx + dy*dy);
		return dist;
	}
	
	public void translate(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}



/*
CSE 142 Lab 8

This client program uses Point objects.
Expected output:

p1 is (8, 2)
p2 is (4, 3)
p1's distance from origin is 8.246211251235321
p1 is now (9, 4)
p2 is now (3, 13)
*/
