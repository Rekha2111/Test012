package javapractice1;

abstract class Shape{
	abstract void draw();
	void size() {
		System.out.println("drawing1");
	}
	}
class rectangle extends Shape{
	void draw() {
		System.out.println("drawing-1");
	}
}
class circle extends rectangle {
	void draw() {
		System.out.println("drawing 2");
	}
}
public class abstract1 {
	public static void main(String[] args) {
    Shape s=new circle();
    s.draw();
    s.size();
		
}
}