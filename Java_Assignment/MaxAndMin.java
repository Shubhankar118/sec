package nagarro;

import java.util.Scanner;

public class MaxAndMin {
	
	
	public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < n; i++) 
        {
            if (a[i] > max)
                max = a[i];
        }
        int min = a[0]; 
        for (int i = 0; i < n; i++)  
        {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Maximum is "+max);
        System.out.println("Minimum is "+min);

    }

}
