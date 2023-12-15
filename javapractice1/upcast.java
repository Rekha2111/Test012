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

public class upcast {
	public static void main (String[] args) {

//		//child ibj2=(child) new child1();
		parent p= new child();
		child c=(child)p;
		p.animal();
		
		
		
	
	}

}
