package nagarro;


import java.util.Scanner;

public class CompareTwoNo {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter first node:");
	        int i = sc.nextInt();
	        System.out.println("Enter second node:");
	        int j = sc.nextInt();
	        if(i==j)
	        {
	            System.out.println(i+"="+j);
	            System.out.println(i+"<="+j);
	            System.out.println(i+">="+j);
	        }
	        else
	        {
	            System.out.println(i + "!=" + j);
	            if (i > j) {
	                System.out.println(i + ">" + j);
	                System.out.println(i + ">=" + j);
	            } else {
	                System.out.println(i + "<" + j);
	                System.out.println(i + "<=" + j);
	            }
	        }



	    }
	
	

}
