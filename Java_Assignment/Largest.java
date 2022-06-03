package nagarro;

import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( a>b && a>c)
			System.out.println(a+ " largest");
		else if (b>a &&b>c)
			System.out.println(b+ " largest");
		else 
			System.out.println(c+ " largest");
		
	}

}
