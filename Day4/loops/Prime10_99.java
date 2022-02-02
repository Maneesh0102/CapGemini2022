package loopDemo;

public class Prime10_99 {
	 static boolean prime(int n) {
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
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i<=99;i++) {
			if(Prime10_99.prime(i)) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
