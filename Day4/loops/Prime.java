package loopDemo;
import java.util.*;

public class Prime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		if(n<=1) {
			flag=false;
		}
		else{
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Non-Prime");
		}
		
		
	}

}
