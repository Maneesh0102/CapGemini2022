package loopDemo;
import java.util.*;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		if(i>0) {
			System.out.println("It is a Positive Number");
		}
		else if(i==0){
			System.out.println("Zero!!");
		}
		else {
			System.out.println("It is a Negative Number");
		}

}
}
