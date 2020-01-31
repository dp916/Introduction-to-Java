import java.util.*;

public class ProjectISBN3
{

   public static void main(String[] args)
   {
   //ALL the output MUST be done inside the main method.
   }
   
   public static String isValidISBN(String isbn)
   {
      int sum = 0;
      int factor = 1;
      int count = 0;
      String index = "";
      if (isbn.length() == 13)
      {  
         for (int i=0; i<isbn.length()-1; i++)
         {  if (isbn.charAt(i) == '-')
         
         {     count++;
               index = index + i;
               
         }  else if (isbn.charAt(i) >= '0' || isbn.charAt(i) <= '9')
                     sum = sum + Character.getNumericValue(isbn.charAt(i)) * factor;
                     factor++;                               
         }
         
        //end of for loop
      
      int check = sum % 11;
      boolean validcheck = false;
      if (check == 10)
      
      {  if (isbn.charAt(12) == 'x')
      {     validcheck = true;
      
         } else if (Character.getNumericValue(isbn.charAt(12)) == check)
            validcheck = true;
      }
      
      if (count == 3 && (index.equals("1411")) || (index.equals("1511")) && validcheck)
      {
         return true;
         
      }  else  
         return false;
      }
      else
         return false;
            
}   
}
      
     /* if (count == 3) && (index.equals("1411")) || (index.equals("1511")) && (check == isbn.charAt(12))
      {
         return "True";
      } else {
         return "False";
      }
           
}    */


      /* else if (isbn.charAt(12) == check
            validcheck = true; syntax error
      */      
     
      

            
                   
   
 /*  
   }
   public static String getGroupIdentifier()
   {
   return
   }
   
   public static String getPublisherIdentifier()
   {
   return
   }
    
   public static String getBookTitleIdentifier()
   {
   return
   }
   
   public static char getCheckDigit()
   {
   return
   }
   
   public static String getProbableLanguage()
   {
   return
   }

}

*/