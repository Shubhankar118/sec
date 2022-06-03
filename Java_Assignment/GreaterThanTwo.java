package nagarro;
import java.util.*;
public class GreaterThanTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
if(n>=2) {
for(int i=0;i<n;i++) {
	
	a[i]=sc.nextInt();
}
}
else {
	System.out.println("user input is less then two");
}
if(a[0]==10 && a[n-1]==10) {
	System.out.println("10 is available at first and last position");
}
else {
	System.out.println("10 is not available at first and last position");
}
	}

}
