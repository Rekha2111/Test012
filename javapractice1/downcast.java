package javapractice1;
class parent{
	void animal() {
		System.out.println("sound");
	}
}
class child extends parent{
	void dog() {
		System.out.println("bark");
	}
}
class child1 extends child{
	void cat() {
		System.out.println("meow");
	}
}

public class downcast {
public static void main(String[]args) {
	child c=new child1();
	child1 d=(child1) c;
	d.animal();
	d.cat();
	d.dog();
}}
