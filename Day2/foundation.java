package test_package;

public class foundation {
	private int a=5; 		//Private variable
	int b=10;   	 		//default variable
	protected int c=15;  	//protected variable
	public int d=20;		//public variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foundation f=new foundation();
		System.out.println("private variable "+f.a);
		System.out.println("default variable "+f.b);
		System.out.println("protected variable "+f.c);
		System.out.println("public variable "+f.d);
		
	}

}
