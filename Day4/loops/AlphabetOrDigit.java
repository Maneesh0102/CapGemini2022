package loopDemo;
import java.util.*;

public class AlphabetOrDigit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		int n=a;
		if(n>=48 && n<=59) {
			System.out.println("Digit");
		}
		else if((n>=65 && n<=90)||(n>=96 && n<=122)) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special Character");
		}
		

	}

}
