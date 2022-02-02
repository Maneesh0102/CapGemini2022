package loopDemo;
import java.util.Scanner;

public class CaseConversion {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char a=sc.next().charAt(0);
	int i=a;
	//System.out.println(i);
	if(i>=65 && i<=90) {
		i+=32;
		char b=(char)i;
		System.out.println(a+"->"+b);
	}
	else {
		i-=32;
		char b=(char)i;
		System.out.println(a+"->"+b);
	}
	}

}
