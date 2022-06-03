package nagarro;

import java.util.Scanner;

public class Revers {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String original;
		String rev= "" ;
		
		System.out.println("Enter string : ");
		Scanner sc= new Scanner(System.in);
		original = sc.nextLine();
		
		int len =original.length();
		
		for(int i =len -1;i>=0;i--)
			rev=rev+original.charAt(i);
		
		System.out.println("Öriginal string is :"+original);
		System.out.println("Revers of string is :"+rev );

	}

}
