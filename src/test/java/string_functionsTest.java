import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

// Author: Lasya

public class string_functionsTest {

  // Author: Lasya
 
    public static string_functions str_funs;

    @BeforeClass
    public static void setup(){str_funs = new string_functions();}
   
  // Author: Lasya
  // This function will run the word count test and perform assertion

    @Test
    public void test_wordcount()
    {
        assertEquals(4,str_funs.wordcnt("This is the string"));
    }

  // Author: Lasya
  // This function will run the number of occurnaces of a word test and perform assertion

    @Test
    public void test_no_of_occr_word()
    {
      assertEquals(2, str_funs.no_of_occr_word("This is the red apple in red bucket", "red"));
      }

  // Author: Lasya
  // This function will run the random geenration of a string and verifies if it is generated or not

    @Test
    public void test_gen_random_string()
    {
        assertTrue(string_functions.gen_random_string(null, 0).isEmpty());
    }

  // Author: Lasya
  // This function will test random number generation is within 400 and perform assertion
    @Test
    public void test_gen_random_number()
    {
        assertTrue(400 > string_functions.gen_random_number());
    }

    //Author: Mahesh
    //This is the run test case for merge string with number
    @Test
    public void test_merge_str_num()
    {
        assertEquals("G1R2E3A4T5",string_functions.merge_str_num("GREAT",12345));

    }

    //Author: Mahesh
    //This is the run test case for merge string with number
    @Test
    public void test_merge_strings()
    {
        assertEquals("GHREELALTO",string_functions.merge_strings("GREAT", "HELLO"));
    }

    //Author: Mahesh
    //This is the run test case for merge string with number
    @Test
    public void test_sort_string_chars()
    {
        assertEquals("AEGRT",string_functions.sort_string_chars("GREAT"));
    }
    
   // Author: Lasya
   //  Integration  testing
    @Test
    public void test_integration1()
    {
        assertEquals(1,str_funs.wordcnt(string_functions.gen_random_string("ThisString",string_functions.gen_random_number())));
    }


   // Author: Mahesh
   //  Integration  testing
   @Test
   public void test_integration2()
   {
       assertEquals("ATEOGDRATY",string_functions.merge_strings(string_functions.sort_string_chars("GREAT"),"TODAY"));
   }

}

