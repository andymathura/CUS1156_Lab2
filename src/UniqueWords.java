import java.util.ArrayList;
/* Project: Lab 2 - Git
 * Class: UniqueWords.java
 * Author: Andy Mathura
 * Date: February 27, 2021
 * This program counts the number of unique strings within 
 * an ArrayList<String>.
 */ 

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {		 
    	  int j = 0;
    	  for (j = 0; j < list.size(); j++)
    		  if(list.get(i) == list.get(j))
    			  break;
    	  
    	  if(i == j)
    		  count++;
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println("The arraylist " + words + " has " + unique + " unique words.");
   }
}
