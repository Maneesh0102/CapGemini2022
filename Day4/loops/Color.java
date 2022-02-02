package loopDemo;
import java.util.*;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a=='R') {
			System.out.println(a+"->Red");
		}
		else if(a=='B') {
			System.out.println(a+"->Blue");
		}
		else if(a=='G') {
			System.out.println(a+"->Green");
		}
		else if(a=='O') {
			System.out.println(a+"->Orange");
		}
		else if(a=='Y') {
			System.out.println(a+"->Yellow");
		}
		else if(a=='W') {
			System.out.println(a+"->White");
		}
		else{
			System.out.println("Invalid Code");
		}
	}

}
