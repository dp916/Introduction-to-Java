import java.util.*;

public class ProjectISBN3
{

   public static void main(String[] args)
   {
   
      //ALL the output MUST be done inside the main method.
      Scanner kd = new Scanner(System.in);
      String answer = "y";
      while (answer.equalsIgnoreCase("y")) 
      {
      
         System.out.print("What is the ISBN Number that you wish to have analyzed? (Be sure to include hyphens) ");
         String isbn = kd.nextLine();
         System.out.println();
         boolean valid = isValidISBN(isbn);
         System.out.println(valid + "******");
         
         if (valid)
         {
            System.out.println("ISBN: " + isbn);
      
            System.out.println("Group Identifier: " + getGroupIdentifier(isbn));
      
            System.out.println("Publisher Identifier: " + getPublisherIdentifier(isbn));
      
            System.out.println("Book Title Identifier: " + getBookTitleIdentifier(isbn));
     
            System.out.println("CheckDigit: " + getCheckDigit(isbn));
      
            System.out.println("The book is probably in " + getProbableLanguage(isbn));
            
         }  
         else 
         {
            System.out.println("You entered : " + isbn + ". Enter a valid IBSN");
                 
         }
               
         System.out.println("Do you wish to have another ISBN number analyzed (Y/N)? ");
         answer = kd.next();
            
      
         
}            
      
         
      
   }    
     
   public static boolean isValidISBN(String isbn)
   {
      int sum = 0;
      int factor = 1;
      int count = 0;
      String index = "";
      if (isbn.length() == 13)
      {  
         for (int i=0; i<isbn.length()-1; i++)
         {  if (isbn.charAt(i) == '-')
            {
               count++;
               index = index + i;
               
            }  else if (isbn.charAt(i) >= '0' && isbn.charAt(i) <='9')
                
               {
                  sum = sum + Character.getNumericValue(isbn.charAt(i)) * factor;
                  factor++; 
               }
                                             
          }
      
        
//end of for loop
      
      int check = sum % 11;
      System.out.println(sum + "ssss");
      System.out.println(check + "Cccccccc");
      boolean validcheck = false;
      
      if (check == 10)
      
      {  
         if (isbn.charAt(12) == 'x')
         {     validcheck = true;
      
         } 
      }   
      else if (Character.getNumericValue(isbn.charAt(12)) == check)
      {
            validcheck = true;
      }
      
      System.out.println(index);
      System.out.println(count); 
      System.out.println(validcheck);
      if (count == 3 && (index.equals("1411")) || (index.equals("1511")) && validcheck)
      {
         return true;
         
      }  
       
      else
         return false;
    }
    else
        return false;     
      
      
    }
   
   public static String getGroupIdentifier(String isbn)
   {
   
      String g = isbn.substring(0, 1);
      return g;
      
   }   
   

   public static String getPublisherIdentifier(String isbn)
   {  
      /*
      String s = isbn;
      int index1 = s.indexOf("-");
      String s1 = s.substring(index1 + 1);
      int index2 = s1.indexOf("-");
      String s2 = s.substring(index1, index2);    
      return s2;
      */
      return isbn.substring(2, 5);
      
   }
   
   public static String getBookTitleIdentifier(String isbn)
   {
      return isbn.substring(6, 11);
      
   }
   
   
   
   public static char getCheckDigit(String isbn)
   {
      return isbn.charAt(12);
   
   }

   public static String getProbableLanguage(String isbn)
   {
      String language = " ";
            
      if (isbn.charAt(0) == '0' || isbn.charAt(0) == '1') 
         language = "English";
       else if (isbn.charAt(0) == '2') 
         language = "French";
       else if (isbn.charAt(0) == '3') 
         language = "German";
       else if (isbn.charAt(0) == '4') 
         language = "Japanese";
       else if (isbn.charAt(0) == '5') 
         language = "Russian";
       else if (isbn.charAt(0) == '6') 
         language = "Chinese";
         return language;
   }
}

