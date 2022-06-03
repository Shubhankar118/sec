package nagarro;

import java.util.Scanner;


public class LeepYear {
	
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the year");
	        int a = sc.nextInt();

	        if(a%4 == 0 && (a%100 != 0 || a%400 == 0))
	            System.out.println("leap year");
	        else
	            System.out.println("not a leap year");
	    }

}
