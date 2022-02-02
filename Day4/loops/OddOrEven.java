package loopDemo;
import java.util.*;

public class OddOrEven {
	void OoE(int a){
		if(a%2==0) {
			System.out.println("It's an Even Number");
		}
		else {
			System.out.println("It's an Odd Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OddOrEven i=new OddOrEven();
		int n=sc.nextInt();
		i.OoE(n);
	}

}
