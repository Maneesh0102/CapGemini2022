package loopDemo;
import java.util.*;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);

	}

}
