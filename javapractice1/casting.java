package javapractice1;

 class A {
	 void widening() {
	int b=22;
	double c=b;//implicit
	System.out.println(c);
	double d=(double)b;
	System.out.println(d);
	}
	 void narrowing() {
		 double d=22.0;
		 int e=(int)d;
		 System.out.println(e);
	 }
}
public class casting{
	public static void main(String[]args) {
		A ref=new A();
		ref.widening();
		ref.narrowing();
		//System.out.println();
	}
}
