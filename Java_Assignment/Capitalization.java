package nagarro; 
import java.util.*;
public class Capitalization {
	  public static void main(String[] args){
			 Scanner in = new Scanner(System.in);
		     System.out.print("Input a Sentence: ");
			 String line = in.nextLine();
			 String uppercase = ""; 
		       Scanner lineScan = new Scanner(line); 
		         while(lineScan.hasNext()) {
		             String word = lineScan.next(); 
		             uppercase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
		         }
		      System.out.println(uppercase.trim()); 

  }
}