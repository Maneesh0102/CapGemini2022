package loopDemo;
import java.util.*;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		int n1=a;
		int n2=b;
		if(n1<n2) {
			System.out.println("Alphabetical order "+a+" , " +b);
		}
		else {
			System.out.println("Alphabetical order "+b+" , " +a);
		}
	}

}
