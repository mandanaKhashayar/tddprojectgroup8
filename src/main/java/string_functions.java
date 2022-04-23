import java.util.Random;
import java.lang.Math;  

public class string_functions{  
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

      public int no_of_occr_word(String string,String word)
      {
          String buff[] = string.split(" ");
          int count = 0;
          for (int i = 0; i < buff.length; i++) {
          if (word.equals(buff[i]))
          count++;
          }
          return count;
      }
    
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
}