package nagarro;

import java.util.Scanner;

public class RemoveTheNthElement {
	
	 public static void main(String[] args) {
	        int x;
	        int y;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the limit of array");
	        x = sc.nextInt();
	        int a[] = new int[x];
	        System.out.println("Enter elements of array");
	        for ( y = 0; y < x; y++)
	        {
	            a[y] = sc.nextInt();
	        }
	        System.out.println("Enter the node");
	        int j = sc.nextInt();
	        if(j>x) 
	        {
	            System.out.println("//Invalid node//");
	            System.out.println("Node should <= Limit");
	        }
	        else
	        {
	            int k = x - j;
	            for (y = k; y < x-1 ; y++) 
	                a[y] = a[y + 1];
	            for (y = 0; y < x - 1; y++)
	                System.out.println(a[y]);
	        }
	    }
	}


