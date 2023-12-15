package javapractice1;

class a{
	void animal() {
		System.out.println("milk");
	}
}
class B extends A {
	void cat() {
		System.out.println("eat");
	}
}
class C extends B{
	void dog() {
		System.out.println("eat");
	}
}
public class upcasting {
	public static void main(String[] args) {
   C ref=new C();
   ref.dog();
   ref.cat();
   //ref.animal();
   
}}
