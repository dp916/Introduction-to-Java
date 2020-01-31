public class Coins
{

//instance variables 
  private int quarters;
  private int dimes;
  private int nickels;
  private int pennies;

//constructor 
  public Coins(int newQuarters, int newDimes, int newNickels, int newPennies)
  {
      setQuarters(newQuarters);
      setDimes(newDimes);
      setNickels(newNickels);
      setPennies(newPennies);      
  }
  
  public Coins(int q)
  {
      quarters = q;    
  }
//actions and functionality by mutator  
  public void removeQuarters(int q)
  {
      if (q <= 0)
         quarters = quarters - q;         
  }
  
  public void addQuarters(int q)
  {    
      if (q > 0)
         quarters = quarters + q;
  }
  
  public double eurosMoney()
  {
      double euro = totalAmount() * 0.9;
      return euro;
  }
  
  public double moneyWeight()
  {
      double total = (quarters * 5.66) + (dimes * 2.28) + (nickels * 5.01) + (pennies * 2.67);
      return total;
  }  
      
//mutators and accessors
  public int getQuarters( )
  {
    return 25;
  }

  public void setQuarters(int newQuarters )
  {
    if (newQuarters > 0)    
       quarters = newQuarters;
          
  }
      
  public int getDimes( )
  {
    return 10;
  }

  public void setDimes( int newDimes )
  {
    if (newDimes > 0)
       dimes = newDimes;   
  }
  
  public int getNickels( )
  {
    return 5;
  }

  public void setNickels( int newNickels )
  {
    if (newNickels > 0)
       nickels = newNickels;
  }
   
  public int getPennies( )
  {
    return 1;
  }

  public void setPennies( int newPennies )
  {
    if (newPennies > 0)
       pennies = newPennies;
  }

//***********************************************************************************************
// @return the number of quarters, dimes, nickels, and pennies for the coins
    
  public String toString( )
  {
      String s = "";
      s = s + "Quarters: " + quarters;
      s = s + "\nDimes: " + dimes;
      s = s + "\nNickels: " + nickels;
      s = s + "\nPennies: " + pennies;
      return s;  
    //return "Quarters: " +quarters+ "\tDimes: " +dimes+ "\tNickels: " +nickels+ "\tPennies: " +pennies;
  }

  public boolean equals( Coins other )
  {
     
     return (this.quarters == other.quarters && this.dimes == other.dimes && this.nickels == other.nickels && this.pennies == other.pennies);
              
  }
   
//***********************************************************************************************

  public double totalAmount( )
  {
     double total = moneyFromQuarters( ) + moneyFromDimes( ) + moneyFromNickels( ) + moneyFromPennies( ); 
     return total;    
  }
           
  public double moneyFromQuarters( )
  {
    return ( quarters * .01 );
  }

  public double moneyFromDimes( )
  {
    return ( dimes * .01 );
  }

  public double moneyFromNickels( )
  {
    return ( nickels * .01 );
  }

  public double moneyFromPennies( )
  {
    return ( pennies * .01 );
  }
  
  
}