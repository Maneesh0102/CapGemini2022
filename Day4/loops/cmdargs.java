package loopDemo;
//import java.util.*;

public class cmdargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=args.length;
	if(i==0) {
		System.out.println("No Values");
	}
	else {
		for(int k=0;k<(i-1);k++) {
			System.out.print(args[k]+",");
		}
		System.out.println(args[i]);
	}

	}

}
