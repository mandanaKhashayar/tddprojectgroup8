import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
 
//Author: Lasya

public class string_functions{  
  // Author: Lasya
  // This function will count the words in the input string 
    public int wordcnt(String string)  
      {  
        int count=0;  
    
          char ch[]= new char[string.length()];     
          for(int i=0;i<string.length();i++)  
          {  
              ch[i]= string.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
      }  

  // Author: Lasya
  // This function will count the no of occurences of a word in the input string 
      public int no_of_occr_word(String string,String word)
      {
          String buff[] = string.split(" ");
          int count = 0;
          for ( int i=0; i< buff.length; i++)
          {
            if(word.equals(buff[i]))
            count++;
          }
          return count;
      }
    
  // Author: Lasya
  // This function will generate a random string from the input string and for a given length 
      static String gen_random_string(String string,int length)  
      {  
        // This function will generate a random string from the input string given and length provided
        StringBuilder str_build = new StringBuilder();
        Random random = new Random();
    
        for(int i = 0; i < length; i++) {
    
          int idx = random.nextInt(string.length());
          char randomChar = string.charAt(idx);
          str_build.append(randomChar);
        }
    
        String randomString = str_build.toString();
        // return randomString
        return randomString;
      }

  // Author: Lasya
  // This function will generate a random number 
      static int gen_random_number()  
      {  
         // it will generate random number
         return (int) (20 * Math.random());
      }

      public static void main(String[] args) {  
        String string ="This is full sentence and in this sentence this is assertEqualsthe first sentence of words";  
       System.out.println(gen_random_string(string,15)) ;
       System.out.println(gen_random_number());
  }  

  //Author Mahesh
  // Function to merge string and number
  public static String merge_str_num(String string,int number)
      {
          String num_str = Integer.toString(number);
          String num_buff[] = num_str.split("");
          String buff[] = string.split("");
          String new_word="";
          int length=string.length();
          int length1=num_str.length();
          int counter=length;

          if (length <= length1)
          {
              counter = length1;
          }
          
          for (int i = 0; i < counter; i++) {
              new_word = new_word + buff[i] + num_buff[i];
            }
                   
          return new_word;
      }

  //Author Mahesh
  // Function to merge two strings

      public static String merge_strings(String string1,String string2)
      {
          String buff1[] = string1.split("");
          String buff2[] = string2.split("");
          String new_word="";
          int length=string1.length();
          int length1=string2.length();
          int counter=length;

          if (length <= length1)
          {
              counter = length1;
          }
          
          for (int i = 0; i < counter; i++) {
              new_word = new_word + buff1[i] + buff2[i];
            }
                   
          return new_word;
      }

  //Author Mahesh
  // Function to sort characters in order for input string

  public static String sort_string_chars(String string1)
  {
      char charArray[] = string1.toCharArray();
      Arrays.sort(charArray);
      String new_word=new String(charArray);
      return new_word;
      }

  public static Object test_sort_string_chars(String string) {
    return null;
  }

public static Object test_merge_strings(String string, String string2) {
    return null;
}

public static Object test_merge_str_num(String string, int i) {
    return null;
}


} 